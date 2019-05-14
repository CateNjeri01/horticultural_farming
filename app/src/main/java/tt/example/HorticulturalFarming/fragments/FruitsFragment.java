package tt.example.HorticulturalFarming.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tt.example.HorticulturalFarming.ApplesActivity;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.WaterMelonActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class FruitsFragment extends Fragment {
CardView Apples,Watermelon;

    public FruitsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fruits, container, false);

      Apples = view.findViewById(R.id.Apples);
       Watermelon= view.findViewById(R.id.Watermelon);
        Apples.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ApplesActivity.class);
            getActivity().startActivity(intent);
        });

        Watermelon.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), WaterMelonActivity.class);
            getActivity().startActivity(intent);
        });
        return view;
    }

}
