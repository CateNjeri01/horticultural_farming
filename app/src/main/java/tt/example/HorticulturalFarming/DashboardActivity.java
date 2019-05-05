package tt.example.HorticulturalFarming;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import de.hdodenhof.circleimageview.CircleImageView;
import tt.example.HorticulturalFarming.fragments.AboutFragment;
import tt.example.HorticulturalFarming.fragments.HomeFragment;
import tt.example.HorticulturalFarming.models.User;

public class DashboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "DashboardActivity";

    private CircleImageView avatarCIV;
    private TextView usernameTV, emailTV;

    private FirebaseAuth mAuth;
    private FirebaseFirestore mDb;
    private StorageReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Home");

        //Init Firebase Variables
        mAuth = FirebaseAuth.getInstance();
        mDb = FirebaseFirestore.getInstance();
        mRef = FirebaseStorage.getInstance().getReference().child("avatars");

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View navHeaderView = navigationView.getHeaderView(0);

        avatarCIV = navHeaderView.findViewById(R.id.avatar_civ);
        usernameTV = navHeaderView.findViewById(R.id.username_tv);
        emailTV = navHeaderView.findViewById(R.id.email_tv);

        switchFragment(new HomeFragment());

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        switch (item.getItemId()) {
            case R.id.nav_home:
                switchFragment(new HomeFragment());
                if (getSupportActionBar() != null) getSupportActionBar().setTitle("Profile");
                break;
            case R.id.nav_discussion:
                Intent intent = new Intent(this, DiscussionForumActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_weather_updates:
                break;
            case R.id.nav_image_analysis:
                break;
            case R.id.nav_contact_us:
                Intent intent1 = new Intent(this, ContactUsActivity.class);
                startActivity(intent1);
                break;

            case R.id.nav_about:
                if (getSupportActionBar() != null) getSupportActionBar().setTitle("About Us");
                switchFragment(new AboutFragment());
                break;

            case R.id.nav_logout:
                logout();
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void logout() {
        mAuth.signOut();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void switchFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (fragment != null) {
            transaction.replace(R.id.container, fragment);
            transaction.commit();
        }
    }

    private void getUser(String uid) {
        if (mAuth.getCurrentUser() != null) {
            mDb.collection("users")
                    .document(uid)
                    .get()
                    .addOnSuccessListener(
                            documentSnapshot -> {
                                if (documentSnapshot.exists()) {
                                    User user = documentSnapshot.toObject(User.class);

                                    usernameTV.setText(user.getName());
                                    emailTV.setText(mAuth.getCurrentUser().getEmail());

                                    //Getting and Setting Image

                                    if (user.getImageName() != null) {
                                        StorageReference userAvatarRef = mRef.child(user.getImageName());

                                        final long MB = 1024 * 1024;

                                        userAvatarRef.getBytes(MB)
                                                .addOnSuccessListener(
                                                        bytes -> {
                                                            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                                            avatarCIV.setImageBitmap(bitmap);
                                                        }
                                                )
                                                .addOnFailureListener(
                                                        e -> {
                                                            Toast.makeText(this, "Could get the image...", Toast.LENGTH_SHORT).show();
                                                            Log.e(TAG, "onViewCreated: getting Image Failure", e);
                                                        }
                                                );
                                    }
                                }
                            }
                    )
                    .addOnFailureListener(
                            e -> {
                                Toast.makeText(this, "An error occurred", Toast.LENGTH_SHORT).show();
                                Log.e(TAG, "onViewCreated: Getting Info", e);
                            }
                    );

        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = mAuth.getCurrentUser();

        if (user == null) {
            startActivity(new Intent(this, LogInActivity.class));
            finish();
        } else {
            getUser(user.getUid());
        }

    }
}
