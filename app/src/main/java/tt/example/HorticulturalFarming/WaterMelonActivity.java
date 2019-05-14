package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class WaterMelonActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e;
String Planting = "PLANTING \n" +
        "Watermelons need a long growing season (at least 80 days) and warm ground for seeds to germinate and grow. Soil should be 70 degrees F or warmer at planting time. Sow seeds 1 inch deep and keep well watered until germination. To get a jumpstart in cooler climates, cover the planting area with black plastic to warm up the soil and start seeds indoors two or three weeks before they are to be set out in the garden. Don't start seeds any earlier, because large watermelon seedlings transplant poorly. Plant 3 seeds in 3- or 4-inch peat pots or large cell packs, and thin to the best plant. Sow watermelon seeds 1/2 inch deep. Place in a sunny south-facing window or under lights to germinate. Make sure the area is warm?day and night?ideally 80 degrees F. Use a Seedling Heat Mat if necessary.";
String Fertilizer = "FERTILIZER: \n" +
        " Application of nitrogenous fertilisers is based on soil type. Soils with high organic matter require 80kg N/ha, while light soils require 140kg N/ha.\n" +
        "\n" +
        "The nitrogenous fertiliser should be applied and incorporated into the soil at planting time. " +
        "Phosphorus and potassium applications are based on soil tests, and both should also be applied at the time of planting. "+
        "Depending on the environmental conditions, 450-600mm of water is required within a growing season."+
        "Wait until the vines begin to spread out before fertilizing watermelon. If using a granular fertilizer, choose a balanced one like a 10-10-10 or 5-5-5. " +
        "These three numbers mean that there are balanced amounts of nitrogen, potassium and phosphate in the fertilizer. Follow the manufacturer’s directions for the correct dosage. Most granular fertilizers are applied at a rate of 1 1/2 pounds per 100 square feet. Scatter the fertilizer around the plants and water it in well. Make sure that the fertilizer does not come in contact with the plant, as this may cause the plant to burn. A water-soluble type fertilizer also works well. A second application of fertilizer can be used after the blossoms appear and the fruit begins to set. This will ensure that the plants are getting the energy they need to produce high quality fruit.";
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_melon);


        expandableTextView = findViewById(R.id.expand_text_view);
        e = findViewById(R.id.expand_text_view1);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
    }
}
