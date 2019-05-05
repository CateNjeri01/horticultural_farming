package tt.example.HorticulturalFarming;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.ByteArrayOutputStream;
import java.util.List;

import tt.example.HorticulturalFarming.models.User;


public class EditProfileActivity extends AppCompatActivity {
    EditText txtUsername, txtPhone;
    Button btnSubmit;
    ImageView imageViewUploadProfile;

    private FirebaseAuth mAuth;
    private StorageReference mRef;
    private FirebaseFirestore mDb;


    private ProgressDialog progressDialog;
    public static final int RC_EXTERNAL_STORAGE = 22;
    public static final int RC_CHOOSE_IMAGE = 10;
    public static final int RC_CROP_IMAGE = 19;


    private boolean imageSelected = false;

    private static final String TAG = "EditProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


        mAuth = FirebaseAuth.getInstance();
        mRef = FirebaseStorage.getInstance().getReference().child("avatars");
        mDb = FirebaseFirestore.getInstance();

        txtUsername = findViewById(R.id.username_et);
        txtPhone = findViewById(R.id.contact_et);
        btnSubmit = findViewById(R.id.submit_btn);

        imageViewUploadProfile = findViewById(R.id.profile_pic_iv);


      imageViewUploadProfile.setOnClickListener(view -> changeProfileImage());
        btnSubmit.setOnClickListener(view -> doUploads());

        progressDialog = new ProgressDialog(this);

    }

    private void uploadToFirestore(String imageName) {

        String name = txtUsername.getText().toString().trim();
        String contact = txtPhone.getText().toString().trim();

        User user = new User(name, contact, imageName, null, null);

        //Adding to Firestore
        if (mAuth.getCurrentUser() != null) {
            mDb.collection("users")
                    .document(mAuth.getCurrentUser().getUid())
                    .set(user)
                    .addOnSuccessListener(
                            aVoid -> {
                                Toast.makeText(this, "Account Setup was Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(this, DashboardActivity.class));
                            }
                    )
                    .addOnFailureListener(
                            e -> {
                                Toast.makeText(this, "Sorry! Account Setup Failed, Try Again Later..,", Toast.LENGTH_SHORT).show();
                                Log.e(TAG, "uploadToFirestore: Failed", e);
                            }
                    );
            progressDialog.dismiss();
        }


    }


    private void doUploads() {


        progressDialog.setTitle("Registering User");
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCanceledOnTouchOutside(true);
        progressDialog.show();

        //Uploading Image to FirebaseStorage
        if (imageSelected) {

            Bitmap bitmap = ((BitmapDrawable) imageViewUploadProfile.getDrawable()).getBitmap();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);

            byte[] bytes = baos.toByteArray();

            if (mAuth.getCurrentUser() != null) {
                String refName = mAuth.getCurrentUser().getUid() + ".jpg";

                StorageReference profilePicRef = mRef.child(refName);

                profilePicRef.putBytes(bytes)
                        .addOnSuccessListener(
                                taskSnapshot -> {
                                    Toast.makeText(this, "Profile Image Uploaded", Toast.LENGTH_SHORT).show();
                                    uploadToFirestore(taskSnapshot.getMetadata().getName());
                                }
                        )
                        .addOnFailureListener(
                                e -> {
                                    Toast.makeText(this, "Image Upload Failed", Toast.LENGTH_SHORT).show();
                                    Log.e(TAG, "doUploads: image upload failure", e);
                                    progressDialog.dismiss();
                                }
                        );

            }
        } else {
            uploadToFirestore(null);
        }

    }

    private void changeProfileImage() {

        if (storagePermissions()) {
            openImageChoosingActivity();
        } else {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, RC_EXTERNAL_STORAGE);
        }

    }

    private boolean storagePermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        } else {
            return true;
        }
    }

    private void openImageChoosingActivity() {

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, RC_CHOOSE_IMAGE);

    }

    public void openCroppingIntent(Uri uri) {

        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", true);
        intent.putExtra("outputX", 512);
        intent.putExtra("outputY", 512);
        intent.putExtra("aspectX", 512);
        intent.putExtra("aspectY", 512);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", true);

        PackageManager packageManager = getPackageManager();

        List<ResolveInfo> croppingApps = packageManager.queryIntentActivities(intent, 0);

        if (croppingApps.size() > 0) startActivityForResult(intent, RC_CROP_IMAGE);
        else
            Toast.makeText(this, "Please Install a cropping Activity to Use this", Toast.LENGTH_SHORT).show();

    }


    private void populateProfileIV(Intent data) {
        Bundle bundle = data.getExtras();
        Bitmap bitmap = bundle.getParcelable("data");
        imageViewUploadProfile.setImageBitmap(bitmap);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            switch (requestCode) {

                case RC_EXTERNAL_STORAGE:
                    openImageChoosingActivity();
                    break;
                default:
                    super.onRequestPermissionsResult(requestCode, permissions, grantResults);

            }
        } else {

            Toast.makeText(this, "Requested Permission Denied, Sorry..?!..?", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK && data != null) {

            switch (requestCode) {

                case RC_CHOOSE_IMAGE:
                    imageSelected = true;
                    Uri imageUri = data.getData();
                    imageViewUploadProfile.setImageURI(imageUri);
                    Snackbar.make(findViewById(R.id.activity_editProfile), "Crop the Image?", Snackbar.LENGTH_LONG)
                            .setAction("Crop the Image", (View v) -> {
                                imageSelected = false;
                                openCroppingIntent(data.getData());
                            })
                            .show();
                    break;

                case RC_CROP_IMAGE:
                    imageSelected = true;
                    populateProfileIV(data);
                    break;

                default:
                    super.onActivityResult(requestCode, resultCode, data);

            }
        }

    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = mAuth.getCurrentUser();

        if (user == null) {
            startActivity(new Intent(this, LogInActivity.class));
            finish();
        }

    }

}

