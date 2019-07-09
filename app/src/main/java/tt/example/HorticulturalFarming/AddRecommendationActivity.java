package tt.example.HorticulturalFarming;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AddRecommendationActivity extends AppCompatActivity {

    private static final String TAG = "AddRecommendationActivi";

    public static final int IMAGE_RC = 100;
    public static final int PERMISSON_RC = 101;

    private Uri imageUri = null;

    ImageView cropImageIV;
    ProgressBar progressBar;
    EditText nameET, tempET, humidityET, rainfallET, dewpointET, soilphET;
    Button uploadImgBtn, uploadBtn;
    private String mImageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recommendation);

        initComponents();

        cropImageIV.setOnClickListener(v -> {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    openImageIntent();
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSON_RC);
                }
            } else {
                openImageIntent();
            }

        });

        uploadImgBtn.setOnClickListener(view -> uploadImage());

        uploadBtn.setOnClickListener(view -> uploadDetails());
    }

    private void openImageIntent() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);

        startActivityForResult(intent, IMAGE_RC);
    }

    private void initComponents() {

        cropImageIV = findViewById(R.id.crop_image_iv);

        progressBar = findViewById(R.id.progress);

        nameET = findViewById(R.id.crop_name_et);
        tempET = findViewById(R.id.crop_temp_et);
        humidityET = findViewById(R.id.crop_humidity_et);
        rainfallET = findViewById(R.id.crop_rainfall_et);
        dewpointET = findViewById(R.id.crop_dewpoint_et);
        soilphET = findViewById(R.id.crop_soilph_et);

        uploadImgBtn = findViewById(R.id.upload_img_btn);
        uploadBtn = findViewById(R.id.upload_btn);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (resultCode == RESULT_OK) {

            if (data != null) {
                switch (requestCode) {
                    case IMAGE_RC:
                        imageUri = data.getData();
                        cropImageIV.setImageURI(imageUri);
                }
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    public void uploadImage() {
        if (imageUri == null) return;

        StorageReference cropRef = FirebaseStorage.getInstance().getReference("crops/" + UUID.randomUUID());


        progressBar.setVisibility(View.VISIBLE);
        progressBar.setProgress(0);
        UploadTask cropUploadTask = cropRef.putFile(imageUri);
        cropUploadTask
                .addOnSuccessListener(taskSnapshot -> {
                    cropRef.getDownloadUrl()
                            .addOnSuccessListener(uri -> setImageURL(uri.toString()))
                            .addOnFailureListener(e -> Log.e(TAG, "uploadImage: DownloadURL", e));

                    progressBar.setVisibility(View.INVISIBLE);
                })
                .addOnFailureListener(e -> {
                    Log.e(TAG, "uploadImage: Upload", e);
                    progressBar.setVisibility(View.INVISIBLE);
                })
                .addOnProgressListener(taskSnapshot -> {
                    int progress = (int) (100 * (taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount()));
                    progressBar.setProgress(progress);
                });

    }

    private void setImageURL(String imageURL) {
        mImageUrl = imageURL;

        Log.d(TAG, "setImageURL: " + imageURL);
    }


    private void uploadDetails() {
        String name = nameET.getText().toString().trim();
        String temp = tempET.getText().toString().trim();
        String humidity = humidityET.getText().toString().trim();
        String rainfall = rainfallET.getText().toString().trim();
        String dewPoint = dewpointET.getText().toString().trim();
        String soilpH = soilphET.getText().toString().trim();

        if (name.isEmpty() || temp.isEmpty() || humidity.isEmpty() || rainfall.isEmpty() || dewPoint.isEmpty() || soilpH.isEmpty()) {
            Toast.makeText(this, "Fill in all the fields", Toast.LENGTH_SHORT).show();
            return;
        }

        Map crop = new HashMap();
        crop.put("name", name);
        crop.put("image", mImageUrl);
        crop.put("temp", temp);
        crop.put("humidity", humidity);
        crop.put("rainfall", rainfall);
        crop.put("dewpoint", dewPoint);
        crop.put("soilph", soilpH);

        progressBar.setVisibility(View.VISIBLE);

        FirebaseFirestore.getInstance().collection("recommendations")
                .add(crop)
                .addOnSuccessListener(documentReference -> {

                    nameET.setText("");
                    tempET.setText("");
                    humidityET.setText("");
                    rainfallET.setText("");
                    dewpointET.setText("");
                    soilphET.setText("");

                    Toast.makeText(this, "Crop Recommendation Added", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> Log.e(TAG, "uploadDetails: Upload", e));

        progressBar.setVisibility(View.INVISIBLE);

    }
}
