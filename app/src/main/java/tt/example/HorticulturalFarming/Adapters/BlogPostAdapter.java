package tt.example.HorticulturalFarming.Adapters;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import tt.example.HorticulturalFarming.CommentsActivity;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.models.BlogPost;
import tt.example.HorticulturalFarming.models.User;

public class BlogPostAdapter extends RecyclerView.Adapter<BlogPostAdapter.ViewHolder> {
    private Context context;
    private List<BlogPost> blog_list;

    private static final String TAG = "BlogPostAdapter";
    private FirebaseFirestore firebaseFirestore;
    private FirebaseAuth firebaseAuth;
    private StorageReference mRef;


    public BlogPostAdapter(List<BlogPost> blog_list) {

        this.blog_list = blog_list;
        mRef = FirebaseStorage.getInstance().getReference();
    }

    @NonNull
    @Override
    public BlogPostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.bloglistitems, viewGroup, false);
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BlogPostAdapter.ViewHolder viewHolder, int position) {
        viewHolder.setIsRecyclable(false);
        final int MB = 1024 * 1024;


        final String blogPostId = blog_list.get(position).BlogPostId;
        final String currentUserId = firebaseAuth.getCurrentUser().getUid();

        BlogPost post = blog_list.get(position);
        viewHolder.descriptionTv.setText(post.getCaption());

        if (post.getDate() != null) {
            viewHolder.dateTv.setText(new SimpleDateFormat("'Date: 'yyyy-MM-dd  'Time: 'HH:mm", Locale.getDefault()).format(post.getDate()));
        } else {
            viewHolder.dateTv.setText(new SimpleDateFormat("'Date: 'yyyy-MM-dd  'Time: 'HH:mm", Locale.getDefault()).format(new Date()));
        }

        String image_url = blog_list.get(position).getImage();

        if (image_url != null) {
            StorageReference imageRef = mRef.child("posts_images").child(image_url);
            imageRef.getBytes(MB)
                    .addOnSuccessListener(
                            bytes -> {
                                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                viewHolder.uploadImage.setImageBitmap(bitmap);
                            }
                    )
                    .addOnFailureListener(e -> Log.e(TAG, "onBindViewHolder: ", e));
        }

        // likes count
        firebaseFirestore.collection("posts/" + blogPostId + "/likes")
                .addSnapshotListener((documentSnapshots, e) -> {

                    if (!documentSnapshots.isEmpty()) {
                        int count = documentSnapshots.size();
                        viewHolder.updateLikesCount(count);
                    } else {
                        viewHolder.updateLikesCount(0);
                    }
                });


        // get likes
        firebaseFirestore.collection("posts/" + blogPostId + "/likes")
                .document(currentUserId)
                .addSnapshotListener((documentSnapshot, e) -> {
                    if (documentSnapshot.exists()) {
                        viewHolder.likebtn.setImageDrawable(context.getDrawable(R.drawable.ic_favorite_red_24dp));
                    } else {
                        viewHolder.likebtn.setImageDrawable(context.getDrawable(R.drawable.ic_favorite_grey_24dp));
                    }

                });

        //likes features
        viewHolder.likebtn.setOnClickListener(v -> firebaseFirestore
                .collection("Posts/" + blogPostId + "/likes")
                .document(currentUserId)
                .get()
                .addOnCompleteListener(task -> {
                    if (!task.getResult().exists()) {
                        Map<String, Object> likesMap = new HashMap<>();
                        likesMap.put("timestamp", FieldValue.serverTimestamp());
                        firebaseFirestore.collection("posts/" + blogPostId + "/likes").document(currentUserId).set(likesMap);
                    } else {
                        firebaseFirestore.collection("posts/" + blogPostId + "/likes").document(currentUserId).delete();
                    }
                }));

        viewHolder.commentsIcon.setOnClickListener(view -> {
            Intent commentIntent = new Intent(context, CommentsActivity.class);
            commentIntent.putExtra("blog_post_id", blogPostId);
            context.startActivity(commentIntent);
        });

        //Set post Owner

        String ownerId = post.getOwnerId();

        firebaseFirestore.collection("users")
                .document(ownerId)
                .get()
                .addOnCompleteListener(
                        task -> {
                            DocumentSnapshot doc = task.getResult();
                            if(task.isSuccessful()){
                                if(doc.exists()){
                                    viewHolder.userNameTv.setText(doc.getString("name"));

                                    String imageUrl = doc.getString("imageName");
                                    if(imageUrl != null) {
                                        StorageReference postOwnerAvatarRef = mRef.child("avatars").child(imageUrl);

                                        postOwnerAvatarRef.getBytes(MB)
                                                .addOnSuccessListener(
                                                        bytes -> {
                                                            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                                            viewHolder.userProfile.setImageBitmap(bitmap);
                                                        }
                                                );
                                    }
                                }
                            }
                            else{
                                Log.e(TAG, "onBindViewHolder: getting user Failed", task.getException());
                            }
                        }
                );

    }


    @Override
    public int getItemCount() {
        return blog_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView likesCountTv, commentsCountTv, descriptionTv, userNameTv, dateTv;
        public ImageView uploadImage, userProfile;
        ImageView likebtn, commentsIcon;


        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            likebtn = itemView.findViewById(R.id.likesIcon);
            commentsIcon = itemView.findViewById(R.id.comment);
            likesCountTv = itemView.findViewById(R.id.likesCount);
            commentsCountTv = itemView.findViewById(R.id.commentsCount);
            descriptionTv = itemView.findViewById(R.id.desc_tv);
            userNameTv = itemView.findViewById(R.id.username);
            dateTv = itemView.findViewById(R.id.date1);
            userProfile = itemView.findViewById(R.id.ProfilePicImage);
            uploadImage = itemView.findViewById(R.id.desc);


            view = itemView;

            FirebaseUser user = firebaseAuth.getCurrentUser();

            //getUser(user.getUid());


        }

        public void updateLikesCount(int count) {

            likesCountTv.setText(count + " likes");

        }

        private void getUser(String uid) {
            if (firebaseAuth.getCurrentUser() != null) {
                firebaseFirestore.collection("users")
                        .document(uid)
                        .get()
                        .addOnSuccessListener(
                                documentSnapshot -> {
                                    if (documentSnapshot.exists()) {
                                        User user = documentSnapshot.toObject(User.class);

                                        userNameTv.setText(user.getName());

                                        //Getting and Setting Image

                                        if (user.getImageName() != null) {
                                            StorageReference userAvatarRef = mRef.child(user.getImageName());

                                            final long MB = 1024 * 1024;

                                            userAvatarRef.getBytes(MB)
                                                    .addOnSuccessListener(
                                                            bytes -> {
                                                                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                                                userProfile.setImageBitmap(bitmap);
                                                            }
                                                    )
                                                    .addOnFailureListener(
                                                            e -> {
                                                                //  Toast.makeText(this, "Could get the image...", Toast.LENGTH_SHORT).show();
                                                                Log.e(TAG, "onViewCreated: getting Image Failure", e);
                                                            }
                                                    );
                                        }
                                    }
                                }
                        )
                        .addOnFailureListener(
                                e -> {
                                    // Toast.makeText(this, "An error occurred", Toast.LENGTH_SHORT).show();
                                    Log.e(TAG, "onViewCreated: Getting Info", e);
                                }
                        );

            }
        }
    }


}

