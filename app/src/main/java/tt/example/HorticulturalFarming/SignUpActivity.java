package tt.example.HorticulturalFarming;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
    private static final String TAG = "SignUpActivity";
    EditText editEmail, editPassword;
    TextView editLogin;
    Button btnRegister;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editLogin = findViewById(R.id.ttLogIn);
        editEmail = findViewById(R.id.email_et);
        editPassword = findViewById(R.id.pwd_et);
        btnRegister = findViewById(R.id.signup_btn);
        progressDialog = new ProgressDialog(getApplicationContext());

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        editLogin.setOnClickListener(v -> openLoginPage());

        btnRegister.setOnClickListener(view -> {
            String txt_email = editEmail.getText().toString();
            String txt_password = editPassword.getText().toString();

            if (txt_password.length() < 6) {
                Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
            } else {
                register(txt_email, txt_password);
            }
        });
    }

    private void register(String email, String password) {
        progressDialog.setMessage("Registering...");
        progressDialog.show();


        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(
                        task -> {
                            if(task.isSuccessful()){
                                startActivity(new Intent(this, DashboardActivity.class));
                                finish();
                            }else{
                                Toast.makeText(this, "Operation failed, try again..", Toast.LENGTH_SHORT).show();
                                Log.w(TAG, "register: ", task.getException());
                            }
                        }
                );
    }

    public void openLoginPage() {
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }
}