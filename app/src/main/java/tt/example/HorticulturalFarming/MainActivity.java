package tt.example.HorticulturalFarming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CardView card_cropDetails, card_weather, card_forum, card_about, card_contact, card_imageAnalysis;

    TextView addREecTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiateViews();

        card_cropDetails.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CropDetailsActivity.class);
            startActivity(intent);
        });
        card_forum.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DiscussionForumActivity.class);
            startActivity(intent);
        });
        card_weather.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeatherUpdatesActivity.class);
            startActivity(intent);
        });
        card_contact.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactUsActivity.class);
            startActivity(intent);
        });

        card_about.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        });
        addREecTV.setOnClickListener(v -> startActivity(new Intent(this, AddRecommendationActivity.class)));
        card_imageAnalysis.setOnClickListener(view -> startActivity(new Intent(this, CropSuggestionsActivity.class)));
    }

    //initiate views

    public void initiateViews() {

        card_cropDetails = findViewById(R.id.cropsCard);
        card_weather = findViewById(R.id.weatherCard);
        card_forum = findViewById(R.id.forumCard);
        card_contact = findViewById(R.id.contactCard);
        card_imageAnalysis = findViewById(R.id.AnalysisCard);
        card_about = findViewById(R.id.AboutCard);
        addREecTV = findViewById(R.id.addRecTV);

    }

}
