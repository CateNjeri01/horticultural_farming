package tt.example.HorticulturalFarming.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import tt.example.HorticulturalFarming.Adapters.AboutPageAdapter;
import tt.example.HorticulturalFarming.CropDetailsActivity;
import tt.example.HorticulturalFarming.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);


        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        ViewPager viewPager = view.findViewById(R.id.view_pager);

        AboutPageAdapter adapter = new AboutPageAdapter(getFragmentManager());
        adapter.addFragment(new AboutAppFragment(), "About Application");
        adapter.addFragment(new PrivacyPolicyFragment(), "Privacy Policy");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);


        return view;

    }

}


