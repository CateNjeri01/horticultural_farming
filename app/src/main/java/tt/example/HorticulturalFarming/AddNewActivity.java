package tt.example.HorticulturalFarming;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.common.server.response.FastParser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import tt.example.HorticulturalFarming.models.BlogPost;

public class AddNewActivity extends AppCompatActivity {
    private Uri filePath;
    private final int PICK_IMAGE_REQUEST = 71;

    private final String TAG = getClass().getSimpleName();
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private FirebaseFirestore firestore;
    private FirebaseStorage storage;
    private StorageReference storageReference;
         EditText addCaptionEt;
         ImageView UploadImage;
         Button AddPostBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        firebaseAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference().child("posts_images");

        initComponents();

        AddPostBtn.setOnClickListener(v -> uploadImage());
        UploadImage.setOnClickListener(v -> chooseImage());

    }
    private void initComponents() {

        addCaptionEt = findViewById(R.id.post_caption_et);
        AddPostBtn = findViewById(R.id.add_post_btn);
        UploadImage = findViewById(R.id.post_image_iv);
        progressDialog = new ProgressDialog(this);
    }
    private String getExtension(Uri uri) {
        ContentResolver resolver = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();

        return mime.getExtensionFromMimeType(resolver.getType(uri));
    }

    static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private void CreateNewPost(String image) {


        String caption = addCaptionEt.getText().toString().trim();

        BlogPost post = new BlogPost(firebaseAuth.getCurrentUser().getUid(), image, caption, new Date());



        firestore.collection("posts")
                .add(post)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {

                        Log.d(TAG, "savePostToDB:success");

                        Toast.makeText(AddNewActivity.this, "it was successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(AddNewActivity.this, DiscussionForumActivity.class));
                        finish();

                    } else {
                        Log.e(TAG, "savePostToDB:failure", task.getException());

                        Toast.makeText(AddNewActivity.this, "oops not successful", Toast.LENGTH_SHORT).show();
                    }

                    progressDialog.dismiss();

                });

    }
    private void uploadImage() {
        if (filePath != null) {
            progressDialog.setTitle("Adding Post");
            progressDialog.setMessage("Please Wait...");
            progressDialog.setCanceledOnTouchOutside(true);
            progressDialog.show();

            StorageReference ref = storageReference.child(UUID.randomUUID().toString() + '.' + getExtension(filePath));
            ref.putFile(filePath)
                    .addOnSuccessListener(taskSnapshot -> {
                        CreateNewPost(taskSnapshot.getMetadata().getName());
                        Toast.makeText(AddNewActivity.this, "Image Uploaded", Toast.LENGTH_SHORT).show();

                    })
                    .addOnFailureListener(e -> {
                        progressDialog.dismiss();
                        Toast.makeText(AddNewActivity.this, "Upload Failed" + e.getMessage(), Toast.LENGTH_SHORT).show();

                    });
        }
    }

    private void chooseImage() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                UploadImage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}



