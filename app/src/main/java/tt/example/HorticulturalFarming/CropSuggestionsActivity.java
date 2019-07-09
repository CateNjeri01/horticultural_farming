package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.List;

import tt.example.HorticulturalFarming.Adapters.RecommendationsAdapter;
import tt.example.HorticulturalFarming.models.Recommendation;

public class CropSuggestionsActivity extends AppCompatActivity {

    private static final String TAG = "CropSuggestionsActivity";

    Button filterBtn;
    EditText tempET, rainET;
    RelativeLayout rl;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_suggestions);


        initWidgets();

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);

        getSupportActionBar().setTitle("Crop Recommendations");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        filterBtn.setOnClickListener(view -> {
            rl.setVisibility(View.GONE);
            rv.setVisibility(View.VISIBLE);

            showRecommendations();
        });
    }

    private void showRecommendations() {

        List<Recommendation> recommendations = new ArrayList<>();

        Query query = FirebaseFirestore.getInstance().collection("recommendations");

        //Filter based on the entered values

        query.addSnapshotListener((queryDocumentSnapshots, e) -> {

            if (e != null) {
                Log.e(TAG, "showRecommendations: ", e);
                return;
            }

            if (queryDocumentSnapshots.isEmpty()) {
                Toast.makeText(this, "No Suggestions yet", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "I saw some recs", Toast.LENGTH_SHORT).show();
                for (DocumentSnapshot snapshot : queryDocumentSnapshots) {
                    recommendations.add(snapshot.toObject(Recommendation.class));
                }

                RecommendationsAdapter adapter = new RecommendationsAdapter(recommendations);
                rv.setAdapter(adapter);
            }

        });
    }

    private void initWidgets() {
        rl = findViewById(R.id.recRL);
        rv = findViewById(R.id.recRV);

        filterBtn = findViewById(R.id.filterCropsBtn);
        tempET = findViewById(R.id.tempET);
        rainET = findViewById(R.id.rainET);
    }
}
