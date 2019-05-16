package tt.example.HorticulturalFarming.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tt.example.HorticulturalFarming.ApplesActivity;
import tt.example.HorticulturalFarming.BlueBerryActivity;
import tt.example.HorticulturalFarming.BrocolliActivity;
import tt.example.HorticulturalFarming.CabbageActivity;
import tt.example.HorticulturalFarming.CarrotsActivity;
import tt.example.HorticulturalFarming.CucumberActivity;
import tt.example.HorticulturalFarming.GrapesActivity;
import tt.example.HorticulturalFarming.LettuceActivity;
import tt.example.HorticulturalFarming.OnionsActivity;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.StrawBerryActivity;
import tt.example.HorticulturalFarming.WaterMelonActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class VegetablesFragment extends Fragment {
CardView brocolli, cucumber, onions, carrots,cabbage,lettuce;

    public VegetablesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_vegetables, container, false);

        brocolli = view.findViewById(R.id.broccoli);
        cucumber = view.findViewById(R.id.cucumber);
        onions = view.findViewById(R.id.onions);
        carrots = view.findViewById(R.id.carrots);
        cabbage = view.findViewById(R.id.cabbage);
        lettuce = view.findViewById(R.id.lettuce);

        brocolli.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BrocolliActivity.class);
            getActivity().startActivity(intent);
        });

        cucumber.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CucumberActivity.class);
            getActivity().startActivity(intent);
        });
        onions.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), OnionsActivity.class);
            getActivity().startActivity(intent);
        });

        carrots.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CarrotsActivity.class);
            getActivity().startActivity(intent);
        });

        cabbage.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CabbageActivity.class);
            getActivity().startActivity(intent);
        });
        lettuce.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), LettuceActivity.class);
            getActivity().startActivity(intent);
        });

        return view;
    }

}
