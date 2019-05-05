package tt.example.HorticulturalFarming.fragments;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import tt.example.HorticulturalFarming.EditProfileActivity;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.models.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";
    TextView txtPhoneNumber, txtEmailAddress, txtUsername;
    ImageButton editProfileIB;
    ImageView profilePicImageIV;

    private FirebaseFirestore mDb;
    private FirebaseAuth mAuth;
    private StorageReference mRef;

    public HomeFragment() {
        mDb = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
        mRef = FirebaseStorage.getInstance().getReference().child("avatars");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        txtPhoneNumber = view.findViewById(R.id.txt_phone);
        txtEmailAddress = view.findViewById(R.id.txt_email);
        txtUsername = view.findViewById(R.id.username_tv);

        editProfileIB = view.findViewById(R.id.edit_profile_ib);
        editProfileIB.setOnClickListener(v -> startActivity(new Intent(getActivity(), EditProfileActivity.class)));
        profilePicImageIV = view.findViewById(R.id.profile_pic_iv);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        if (mAuth.getCurrentUser() != null) {
            mDb.collection("users")
                    .document(mAuth.getCurrentUser().getUid())
                    .get()
                    .addOnSuccessListener(
                            documentSnapshot -> {
                                if (documentSnapshot.exists()) {
                                    User user = documentSnapshot.toObject(User.class);

                                    txtUsername.setText(user.getName());
                                    txtPhoneNumber.setText(user.getContact());
                                    txtEmailAddress.setText(mAuth.getCurrentUser().getEmail());

                                    //Getting and Setting Image

                                    if (user.getImageName() != null) {
                                        StorageReference userAvatarRef = mRef.child(user.getImageName());

                                        final long MB = 1024 * 1024;

                                        userAvatarRef.getBytes(MB)
                                                .addOnSuccessListener(
                                                        bytes -> {
                                                            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                                            profilePicImageIV.setImageBitmap(bitmap);
                                                        }
                                                )
                                                .addOnFailureListener(
                                                        e -> {
                                                            Toast.makeText(getActivity(), "Could get the image...", Toast.LENGTH_SHORT).show();
                                                            Log.e(TAG, "onViewCreated: getting Image Failure", e);
                                                        }
                                                );
                                    }
                                }
                            }
                    )
                    .addOnFailureListener(
                            e -> {
                                Toast.makeText(getActivity(), "An error occurred", Toast.LENGTH_SHORT).show();
                                Log.e(TAG, "onViewCreated: Getting Info", e);
                            }
                    );

        }
    }
}
