package tt.example.HorticulturalFarming;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LogInActivity";
    EditText edEmail, edPassword;
    Button btnLogin;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    TextView txt_register;
    Toolbar logInToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        initiateViews();

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);
        btnLogin.setOnClickListener(this);
        txt_register.setOnClickListener(this);


        if (getSupportActionBar() == null) setSupportActionBar(logInToolbar);
        getSupportActionBar().setTitle("                         LOG IN ");
    }


    public void initiateViews() {
        logInToolbar = findViewById(R.id.toolbarSignUp);

        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        txt_register = findViewById(R.id.txt_sign_up);

        btnLogin = findViewById(R.id.btnLogIn);

    }

    private void adminLogin() {
        String email = edEmail.getText().toString().trim();
        String password = edPassword.getText().toString().trim();
        //vibrator.vibrate(300);

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;

        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;

        }

        progressDialog.setMessage("Please wait...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(
                        task -> {
                            if (task.isSuccessful()) {
                                Toast.makeText(LogInActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(this, DashboardActivity.class));
                                finish();
                            } else {
                                Toast.makeText(LogInActivity.this, "Invalid email or password...", Toast.LENGTH_SHORT).show();
                                Log.w(TAG, "adminLogin: ", task.getException());
                            }

                            progressDialog.dismiss();

                        });
    }

    @Override
    public void onClick(View v) {

        if (v == btnLogin) {
            adminLogin();
        }

        if (v == txt_register) {
            startActivity(new Intent(this, SignUpActivity.class));
        }
    }

    public void LogIn(View view) {
        Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

}
