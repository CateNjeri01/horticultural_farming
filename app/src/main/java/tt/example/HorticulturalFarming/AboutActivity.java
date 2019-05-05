package tt.example.HorticulturalFarming;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tt.example.HorticulturalFarming.Adapters.AboutPageAdapter;
import tt.example.HorticulturalFarming.fragments.AboutAppFragment;
import tt.example.HorticulturalFarming.fragments.PrivacyPolicyFragment;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);

        AboutPageAdapter adapter = new AboutPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new AboutAppFragment(), "About Application");
        adapter.addFragment(new PrivacyPolicyFragment(), "Privacy Policy");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
