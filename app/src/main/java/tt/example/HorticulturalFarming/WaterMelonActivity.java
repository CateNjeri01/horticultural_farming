package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class WaterMelonActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care;
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
String disease = "DISEASE IN WATERMELON \n" +
        "Watermelons are generally pretty tough numbers, but once in a while they develop problems that can seem insurmountable. Treating watermelon problems is often a simple matter, but the first thing you’ve got to do is figure out what’s causing your problems. Look for these common watermelon diseases this summer:\n" +
        " ANTHRACNOSE – This seed-borne fungus is hard to detect initially, as it may only appear as small spots on your plants and fruits. As it grows, these spots expand and turn black or gray and new sunken areas may appear on your fruit. Crop rotation combined with an aggressive treatment of neem oil will help preserve this and future harvests from anthracnose. \n" +
        "BACTERIAL FRUIT BLOTCH – The bacterium Acidovorax avenae subspecies citrulli is often responsible for seedlings and young plants and fruits with water-soaked spots that spread and become necrotic. The leaves may brown, but the most dramatic sign is on fruit. The rind may crack and ooze a sticky, yellow liquid. Copper fungicide can control symptoms if it’s applied as soon as symptoms of bacterial fruit blotch are detected.\n" +
        " DOWNY MILDEW – Downy mildew is notable for the angular leaf spots it creates as it works its way through watermelon leaves. They may start as yellow areas, but soon turn brown with purple spores on the undersides of infected leaves. Fortunately, downy mildew won’t attack fruit, but it can reduce yields by weakening your plants. Neem oil can control this nasty mildew. \n" +
        "GUMMY STEM BLIGHT – Older tissues are generally affected more often than new ones when gummy stem blight fungus is involved. Black, wrinkled spots on leaves and dark or sunken areas on stems and fruits are the first signs of disease. Under humid or wet conditions, affected plants rapidly collapse. Control is difficult, but copper fungicides can be effective if used as soon as gummy stem blight appears. Powdery Mildew – One of the most common diseases of plants in general, powdery mildew doesn’t spare watermelons. Leaves will appear to have a white powdery substance on them when the infection is active, though fruits aren’t generally affected. As the powdery mildew moves through the plant, leaves brown and die, leaving fruits to sunburn and weakening plants. Neem oil is an excellent treatment, but increasing air circulation around your watermelon plant by pruning can be equally effective.\n";
String caring = "CARE AND MAINTENANCE\n" +
        "\n" +
        "Watermelons need consistent water and fertility to produce fruits. Add at least 1 inch of water a week — more during hot, dry weather.\n" +
        " If you aren’t using plastic mulch, hand weed around plants. Add a small handful of an organic fertilizer, such as 5-5-5 around each plant at transplant time, when the vines start to run, and at first flowering. " +
        "Towards fall, as the nights dip into the 50Fs, help the existing fruits ripen by cutting off the tips of the vines, new flowers, and any young fruit. This will send more energy into the existing fruits.\n" +
        " Place the existing watermelons on a piece of wood or pail to keep the fruits off the ground where diseases and critters might attack.";

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_melon);


        expandableTextView = findViewById(R.id.expand_text_view);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view4);
        care = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(Fertilizer);
        care.setText(caring);

    }
}
