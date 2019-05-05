package tt.example.HorticulturalFarming;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import tt.example.HorticulturalFarming.fragments.AllPostFragment;
import tt.example.HorticulturalFarming.fragments.MarketPostFragment;
import tt.example.HorticulturalFarming.fragments.TrendingPostFragment;




public class DiscussionForumActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private AllPostFragment allPostFragment;
    private MarketPostFragment marketPostFragment;
    private TrendingPostFragment trendingPostFragment;

    private FirebaseAuth mAuth;


    private BottomNavigationView.OnNavigationItemSelectedListener bnvListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
            switch (Item.getItemId()) {
                case R.id.bm_all_posts:
                    replaceFragment(allPostFragment);
                    return true;
                case R.id.bm_market_posts:
                    replaceFragment(marketPostFragment);
                    return true;
                case R.id.bm_trending_posts:
                    replaceFragment(trendingPostFragment);
                    return true;
                default:
                    return false;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussionforum);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        mAuth = FirebaseAuth.getInstance();

        allPostFragment = new AllPostFragment();
        marketPostFragment = new MarketPostFragment();
        trendingPostFragment = new TrendingPostFragment();

        bottomNavigationView.setOnNavigationItemSelectedListener(bnvListener);

        replaceFragment(new AllPostFragment());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, fragment);
        fragmentTransaction.commit();

    }

    public void floatClick(View view) {
        Intent intent = new Intent(DiscussionForumActivity.this, AddNewActivity.class);
        startActivity(intent);

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
