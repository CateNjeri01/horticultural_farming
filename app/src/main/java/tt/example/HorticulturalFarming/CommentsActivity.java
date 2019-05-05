package tt.example.HorticulturalFarming;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tt.example.HorticulturalFarming.models.Comments;
import tt.example.HorticulturalFarming.Adapters.CommentsAdapter;



    public class CommentsActivity extends AppCompatActivity {

        private EditText Comments;
        private Button BtnPost;

        private RecyclerView comment_list;
        private CommentsAdapter commentsRecyclerAdapter;
        private List<Comments> commentsList;

        private FirebaseFirestore firebaseFirestore;
        private FirebaseAuth firebaseAuth;

        private String blog_post_id;
        private String current_user_id;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_comments);
            Comments = findViewById(R.id.Comments);
            BtnPost = findViewById(R.id.CommentsBtn);
            comment_list = findViewById(R.id.commentsList);




            firebaseAuth = FirebaseAuth.getInstance();
            firebaseFirestore = FirebaseFirestore.getInstance();

            current_user_id = firebaseAuth.getCurrentUser().getUid();
            blog_post_id = getIntent().getStringExtra("blog_post_id");


            commentsList = new ArrayList<>();
            commentsRecyclerAdapter = new CommentsAdapter(commentsList);
            comment_list.setHasFixedSize(true);
            comment_list.setLayoutManager(new LinearLayoutManager(this));
            comment_list.setAdapter(commentsRecyclerAdapter);


            firebaseFirestore.collection("Posts/" + blog_post_id + "/comments")
                    .addSnapshotListener(CommentsActivity.this, (documentSnapshots, e) ->
                    {

                        if (!documentSnapshots.isEmpty()) {

                            for (DocumentChange doc : documentSnapshots.getDocumentChanges()) {

                                if (doc.getType() == DocumentChange.Type.ADDED) {

                                    String commentId = doc.getDocument().getId();
                                    Comments comments = doc.getDocument().toObject(Comments.class);
                                    commentsList.add(comments);
                                    commentsRecyclerAdapter.notifyDataSetChanged();
                                }
                            }

                        }else{
                            Toast.makeText(CommentsActivity.this, "No comments", Toast.LENGTH_SHORT).show();
                        }

                    });



            BtnPost.setOnClickListener(v -> {

                String comment_message = Comments.getText().toString();


                Map<String, Object> commentsMap = new HashMap<>();
                commentsMap.put("message", comment_message);
                commentsMap.put("user_id", current_user_id);
                commentsMap.put("timestamp", FieldValue.serverTimestamp());

                firebaseFirestore.collection("posts/" + blog_post_id + "/comments")
                        .add(commentsMap).addOnCompleteListener(task -> {

                            if(!task.isSuccessful()){

                                Toast.makeText(CommentsActivity.this, "Error Posting Comment : " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            } else {

                                Toast.makeText(CommentsActivity.this, "Comment Added", Toast.LENGTH_SHORT).show();

                                Comments.setText("");

                            }

                        });

            });

        }

    }





