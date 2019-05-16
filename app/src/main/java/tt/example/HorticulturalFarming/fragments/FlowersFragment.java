package tt.example.HorticulturalFarming.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tt.example.HorticulturalFarming.BrocolliActivity;
import tt.example.HorticulturalFarming.CarnationActivity;
import tt.example.HorticulturalFarming.CarrotsActivity;
import tt.example.HorticulturalFarming.CucumberActivity;
import tt.example.HorticulturalFarming.OnionsActivity;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.RosesActivity;
import tt.example.HorticulturalFarming.SunflowerActivity;
import tt.example.HorticulturalFarming.TuberousBenogiasActivity;


public class FlowersFragment extends Fragment {
 CardView roses,carnation,sunflower,tuberous;
    public FlowersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_flowers, container, false);

        roses = view.findViewById(R.id.roses);
        carnation = view.findViewById(R.id.carnation);
        sunflower = view.findViewById(R.id.sunflower);
        tuberous = view.findViewById(R.id.tuberous);

        roses.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RosesActivity.class);
            getActivity().startActivity(intent);
        });

        carnation.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CarnationActivity.class);
            getActivity().startActivity(intent);
        });
        sunflower.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SunflowerActivity.class);
            getActivity().startActivity(intent);
        });

        tuberous.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TuberousBenogiasActivity.class);
            getActivity().startActivity(intent);
        });

        return view;
    }
}
