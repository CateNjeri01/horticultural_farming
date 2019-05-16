package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class SunflowerActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "PLANTING SUNFLOWERS" +
            "•\tSpace seeds about 6 inches apart in a shallow trench between 1 and 2 inches deep. In sandy soil, 2 inches deep is better.\n" +
            "•\tCover and keep watered until seeds sprout in 7 to 10 days.\n" +
            "•\tWhen first true leaves appear (the second set of leaves); thin plants to about 2 feet apart.\n" +
            "•\tDepending on the variety, sunflowers will mature and develop seeds in 80 to 120 days.\n" +
            "•\tSow a new row every 2 to 3 weeks to enjoy continuous blooms until the first frost.\n" +
            ".\tFind a well-drained location, and prepare your soil by digging an area of about 2-3 feet in circumference to a depth of about 2 feet.\n" +
            "PLANTING SUNFLOWER SEEDS\n" +
            "    It’s best to sow sunflower seeds directly into the soil after the danger of spring frost has passed. Ideally, the soil temperature has reached 55 to 60 degrees F (13–16°C).\n" +
            "    Give plants plenty of room, especially for low-growing varieties that will branch out. Make rows about 30 inches apart. (For very small varieties, plant closer together.)\n" +
            "    Plant the large seeds no more than 1 inch deep about 6 inches apart after the soil has thoroughly warmed, from mid-April to late May in northern regions—earlier in southern areas. You can plant multiple seeds and thin them to the strongest contenders when the plants are six inches tall.\n" +
            "    A light application of fertilizer mixed in at planting time will encourage strong root growth to protect them from blowing over in the wind.\n" +
            "    Experiment with plantings staggered over 5 to 6 weeks to keep enjoying continuous blooms.\n" +
            "    If you see birds scratching around for the seeds, spread netting over the planted area until seeds germinate.";
    String Fertilizer = "CARING FOR SUNFLOWERS\n" +
            " *   While the plant is small, water around the root zone, about 3 to 4 in. from the plant. To protect the plant, it may help to put snail or slug bait around the stem.\n" +
            "  *  Once the plant is established, water deeply though infrequently to encourage deep rooting. Unless the weather is exceptionally wet or dry, water once a week with several gallons of water.\n" +
            "  *  Feed plants only sparingly; over fertilization can cause stems to break in the fall. You can add diluted fertilizer into the water, though avoid getting the fertilizer near the plant’s base; it may help to build a moat in a circle around the plant about 18 inches out.\n" +
            " *   Tall species and cultivars require support. Bamboo stakes are a good choice for any plant that has a strong, single stem and needs support for a short period of time.\n";
    String disease = "•\tSUNFLOWERS PESTS AND DISEASES\n" +
            "•\tSunflowers are virtually as care free as their smiling faces suggest. However, they are sometimes infected with fungal diseases such as mildews and rusts. Downy Mildew causes mottling and pale areas on upper leaf surfaces and a fuzzy mold growth on their undersides. Eventually the leaves wither and die. The oldest leaves are usually infected first. Downy mildew is most likely to occur on cool damp nights and warm humid days. It spreads by means of tiny spores carried to plants and soil by wind and rain or transmitted by garden tools. It will not kill a mature plant; it just mars its appearance.\n" +
            "•\t\n" +
            "Rust appears on upper leaf surfaces first as yellow or white spots that turn brown or black. Puffy blisters then appear on the undersides. The disease may spread to stems and flowers causing distorted growth. Rust sometimes spreads to the cultivated sunflowers from weeds such as wild mustard, shepherd's-purse, pigweed, and lamb's-quarters.\n" +
            "•\t\n" +
            "If fungal diseases are spotted early, spraying with a general garden fungicide as directed on the product label can protect healthy foliage. Remove and destroy seriously infected plants. Keep the area weeded and clean up plant debris from the garden in the fall. Disinfect tools by dipping them in a solution of 1 part household bleach to 4 parts water. Keep your hands clean, and do not handle plants when they are wet.\n" +
            "•\t\n" +
            "A small gray sunflower moth sometimes lays its eggs in developing sunflower blossoms. Its larvae are greenish-yellow with 5 brown stripes down their backs. They feed in the flower and destroy seeds, creating a mass of webbing and debris. Pick the worms from the plants and mash them between your fingers or drop them into a plastic bag for the trash. If lots of plants are infested, spray or dust the flowers with a product containing Bacillus thuringiensis (Bt) as soon as you see the larvae. " +
            "The larvae will eat the bacterium and soon die. Because sunlight and rain rapidly inactivate Bt, respray as directed on the product label.\n";
    String caring = "FERTILIZER APPLICATION\n" +
            "Sunflower needs good fertilization. Use of 60 kg per acre of D.A.P (Diammonium Phosphate) or 3 tonnes per acre of well rotted farmyard manure or compost, applied 2 to 3 weeks before sowing is recommended. The fertilizer should however be mixed properly first with the soil before planting to avoid damaging the seeds, which leads to poor emergence.\n" +
            "Apply CAN at 100 kg/acre around the stems of sunflower when plants are 40cm tall (avoid contact with the plant).\n" +
            "WEED CONTROL\n" +
            "Sunflower is very sensitive to weed competition especially at the early growth stage and they can cause up to 50% yield loss. Weeding can be done either mechanically or chemically. The crop should be kept weed free 4 to 6 weeks after planting. Weed can also be managed by the use of Pre emergence herbicides such as Duol Gold, Pendimethalin (Stomp) and Metalachlor.\n" +
            "\n" +
            "THINNING\n" +
            "Thinning should also be done to one plant per hole around the same period as weeding but when the soil is wet.\n";
    String storage = "HARVEST AND STORAGE\n" +
            "    For indoor bouquets, cut the main stem just before its flower bud has a chance to open to encourage side blooms.\n" +
            "    Cut stems early in the morning. Harvesting flowers during middle of the day may lead to flower wilting. \n" +
            "    Handle sunflowers gently. The flowers should last at least a week in water at room temperature.\n" +
            "    Arrange sunflowers in tall containers that provide good support for their heavy heads, and change the water every day to keep them fresh.\n" +
            "HARVESTING SUNFLOWER SEEDS\n" +
            "\n" +
            "    To harvest seeds, keep an eye out for ripeness. The back of the flower head will turn from green to yellow and the bracts will begin to dry and turn brown; this happens about 30 to 45 days after bloom and seed moisture is about 35%. Generally, when the head turns brown on the back, seeds are ready for harvest.\n" +
            "    Cut the head off the plant (about 4 inches below the flower head) and remove the seeds with your fingers or a fork.\n" +
            "    To protect the seeds from birds, you can cover the flowers with a light fabric (such as cheesecloth) and a rubber band.\n" +
            "    Alternatively, you can cut the flower head early and hang the heads upside down until the seeds are dry; hang indoors or in a place that’s safe from birds and mice.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunflower);

        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        care = findViewById(R.id.expand_text_view4);
        storages = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(disease);
        care.setText(caring);
        storages.setText(storage);
    }
}
