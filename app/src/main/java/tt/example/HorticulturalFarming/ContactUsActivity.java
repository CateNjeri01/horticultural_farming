package tt.example.HorticulturalFarming;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;
import tt.example.HorticulturalFarming.fragments.ChatsFragment;
import tt.example.HorticulturalFarming.fragments.UserProfileFragment;
import tt.example.HorticulturalFarming.fragments.UsersFragment;
import tt.example.HorticulturalFarming.models.User;


public class ContactUsActivity extends AppCompatActivity {
    private static final String TAG = "ContactUsActivity";
    FirebaseAuth firebaseAuth;
    CircleImageView profile_image;
    TextView username;
    FirebaseUser firebaseUser;

    private StorageReference mRef;
    private FirebaseFirestore mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        mRef = FirebaseStorage.getInstance().getReference().child("avatars");
        firebaseAuth = FirebaseAuth.getInstance();
        mDb = FirebaseFirestore.getInstance();

        /**Setting up action bar**/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#212121")));

        profile_image = findViewById(R.id.proImage);
        username = findViewById(R.id.username);

        firebaseUser = firebaseAuth.getCurrentUser();

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new ChatsFragment(), "Messages");
        viewPagerAdapter.addFragment(new UsersFragment(), "Users");
        viewPagerAdapter.addFragment(new UserProfileFragment(), "Chat Bot");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments;
        private ArrayList<String> titles;

        ViewPagerAdapter(FragmentManager fm) {
            super(fm);
            this.fragments = new ArrayList<>();
            this.titles = new ArrayList<>();
        }


        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            titles.add(title);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }

    private void status(String status) {
        mDb.collection("users")
                .document(firebaseUser.getUid())
                .update("status", status);
    }

    @Override
    protected void onResume() {
        super.onResume();
        status("online");
    }

    @Override
    protected void onPause() {
        super.onPause();
        status("offline");
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = firebaseAuth.getCurrentUser();

        if (user == null) {
            startActivity(new Intent(this, LogInActivity.class));
            finish();
        } else {
            updateUI(user.getUid());
        }
    }

    private void updateUI(String uid) {
        mDb.collection("users")
                .document(firebaseUser.getUid())
                .get()
                .addOnSuccessListener(
                        documentSnapshot -> {
                            User user = documentSnapshot.toObject(User.class);

                            username.setText(user.getName());

                            if (user.getImageName() != null) {
                                StorageReference avatarRef = mRef.child(user.getImageName());
                                final long MB = 1024 * 1024;
                                avatarRef.getBytes(MB)
                                        .addOnSuccessListener(
                                                bytes -> {
                                                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                                    profile_image.setImageBitmap(bitmap);
                                                }
                                        )
                                        .addOnFailureListener(e -> Log.e(TAG, "onBindViewHolder: ", e));
                            }
                        }
                );


    }
}

