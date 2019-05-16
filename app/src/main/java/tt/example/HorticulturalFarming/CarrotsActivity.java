package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class CarrotsActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "SOIL PH AND FERTILITY\n" +
            " SOIL TESTING AND FERTILIZER\n" +
            "Carrot growing in the soil\n" +
            "•\tCarrots thrive when soil pH is neutral to slightly acidic, between 6 and 7.\n" +
            "•\tGood soil for growing well-shaped roots is a light sandy loam. Heavier clay soils are fine as long as the soil is well-drained and not compacted.\n" +
            "•\tGrow parsnips in sandy, loamy soils, not heavy clay or silt soils.  \n" +
            "•\tSome carrot varieties will push the tops of the roots up out of the soil. Hilling soil around these plants will keep the roots from turning green.\n" +
            "•\tImprove your soil by adding well-rotted manure or compost in spring or fall.\n" +
            "•\tDo not use any fertilizer containing a weed killer (\"Weed and Feed\"), as it may kill your vegetable plants.\n" +
            "SELECTING PLANTS\n" +
            "Carrots and parsnips both grow from small, narrow seed that can be difficult to handle. Some seed houses sell pelleted carrot and parsnip seed, meaning inert material coats the seed. This inert material is usually clay-based, and increases the size of the individual seed. They are easier to plant sparingly and precisely.\n" +
            "Carrot seed is also available as “seed tape,” a paper ribbon containing evenly spaced seeds.  \n" +
            "Although the price of pelleted seed or seed tape is higher than the modified seed, many gardeners get better results with less effort when they use these prepared seeds. If you can place the carrot seed evenly every two to four inches using prepared seed, you will save yourself the task of thinning after the plants come up.\n" +
            "If using unmodified seed, try to seed lightly and evenly down the row, although it may be difficult to see the seeds against the soil surface.\n";
    String Fertilizer = "PLANTING\n" +
            "STARTING SEEDS\n" +
            "Always direct seed these root crops into your garden. Never start them in pots. Their long taproots begin developing early. Transplanting damages and misdirects their root growth.\n" +
            "In kenya, start planting carrots beginning April 15, and parsnips beginning May 1. For a continuous supply of young carrots, make two or three plantings spaced three weeks apart. The seeds may take as long as three weeks to germinate. \n" +
            " SEEDLINGS\n" +
            "•\tNewly emerged carrot and parsnip plants are very small, with two thin grass-like leaves. The next leaves to emerge will appear frilly or fern-like.\n" +
            "•\tCarrot roots can reach their full length within three weeks of seedling emergence.\n" +
            "•\tThe tiny plants may have trouble emerging if there is a crusted soil surface, as may happen after a heavy rain or excess watering. Moistening the surface of the soil with a light spray of water may make it easier for the seedlings to come up.\n" +
            "•\tSome gardeners plant radishes in the same row as their carrots or parsnips. The radish seeds germinate quickly and their distinctive leaves mark the row. You can pull and eat the radishes as the carrots emerge from the soil, giving the carrots more room.\n" +

            "THINNING\n" +
            "•\tYou must thin out both carrots and parsnips to allow room for the roots to develop properly. \n" +
            "•\tSpacing between carrot plants\n" +
            "•\tWhen the largest seedlings are three to four inches tall, thin by pulling up extra seedlings so that the remaining plants are about two to four inches apart.\n" +
            "•\tWhile thinning, be sure to eliminate any weed seedlings as well.\n" +
            "•\tLeave wider spacing for varieties that will be larger at maturity.\n";
    String disease = "HOW TO KEEP YOUR CARROTS AND PARSNIPS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\n" +
            "•\tFor best quality and size, both carrots and parsnips require good soil moisture.\n" +
            "•\tIf they do not receive an inch of rain each week, use irrigation.\n" +
            "•\tRoots may be bitter, tough, fibrous, misshapen and undersized it they don't get enough water.\n" +
            "•\tWater deeply once a week on heavier soils, twice a week on sandier soils. An inch of water will wet a  heavy clay soil to six inches, and sandy soil to a depth of ten inches.\n" +
            "•\tUse a trowel to see how far down the soil is wet. If it is only an inch or two, keep the water running.\n" +
            " CONTROLLING WEEDS\n" +
            "•\tFrequent, shallow cultivation with a hoe will kill weeds before they become a problem.\n" +
            "•\tCultivate just deeply enough to cut the weeds off below the surface of the soil. Be careful not to damage the plants when cultivating.\n" +
            "•\tMulching with herbicide-free grass clippings, weed-free straw, or other organic material to a depth of three to four inches can help prevent weed growth, decreasing the need for frequent cultivation.\n";
    String caring = "COMMON PROBLEMS AND DISEASES\n" +
            "Skin sensitivity to parsnip leaves can be a problem. Some people develop a rash from contact with parsnip leaves, particularly on bright sunny days. Wear long pants, long sleeves and gloves when weeding or harvesting parsnips.\n" +
            "Forked, or split, roots may result from rocky, heavy, or compacted soil. A drought can also cause split roots.\n" +
            "If the plants develop healthy green tops, but limited root growth, it is usually because the plants are crowded. Excessive nitrogen fertilization can also contribute to lots of leaf growth at the expense of root growth. \n" +
            " Insects\n" +
            "Root maggots feed on and destroy the roots of many crops.  \n" +
            " Diseases\n" +
            "Aster yellows is a disease of many garden plants spread by leafhoppers, small insects that feed on plant juices. Symptoms are hairy, bitter roots and yellow tops. \n" +
            "Use good cultural control practices to reduce disease problems to a good level and allow for a successful harvest. \n" +
            "Alternaria Leaf Blight (Alternaria dauci and A. radicina)\n" +
            "Symptoms of Alternaria leaf blight first appear along leaflet margins as greenish-brown, water-soaked lesions which enlarge, turn brown to black, and often develop a yellow halo. Older leaves are more susceptible to infection. When about 40% of the leaf is infected, the leaf yellows, collapses, and dies. Petiole lesions are common, elongate, and can quickly kill entire leaves. A. radicina causes similar foliar symptoms but can also produce a dry, mealy, black decay known as black rot on carrot roots held in storage.\n" +
            " \n" +
            " Alternaria leaf blight, D. B. Langston\n" +
            "Bacterial Leaf Blight (Xanthomonas campestris pv. carotae)\n" +
            "Symptoms of bacterial leaf blight appear primarily on leaf margins as small, yellow, angular leaf spots which expand, turn brown to black with a yellow halo, and become dry and brittle.\n" +
            "Leaflets may become distorted and curled. Symptoms can extend into petioles, produce a yellow-brown, gummy exudate, and occur on flower stalks. Infected umbels can be completely blighted and seed infection can occur—use treated seed to prevent introducing this disease.\n" +
            "Root Knot Nematode (Meloidogyne hapla)\n" +
            "Root knot nematode forms galls or root thickenings of various sizes and shapes. Growth of infected carrots is patchy and uneven and severely infected carrots exhibit forking, galls, hairiness, and stubby roots. When soil populations of M. hapla are high, symptoms include stunted plants, uneven stands, premature leaf death, and branches and swellings on both lateral and tap roots. Marketable yield is reduced by deformities, size reduction, branches, and knobs. M. hapla persists in the soil and has a very wide host range so rotation can be difficult, but monocots are non-hosts so small grains and corn as well as resistant varieties of tomato and bean can be grown in rotations to reduce population size.\n" +
            " \n" +
            " Root knot nematode in carrot, R.L. Wick\n" +
            "Black Root Rot (Thielaviopsis basicola)\n" +
            "Black root rot occurs primarily in storage when conditions are not ideal and temperature and humidity are too high. The fungus causes superficial, irregular black lesions which occur in a random pattern. The discoloration, caused by masses of dark brown to black chlamydospores, is limited to the skin. The pathogen rapidly invades wounded tissue and is favored by long post-harvest periods without cooling so careful harvest and immediate cooling and storage can minimize disease impact.\n" +
            " \n" +
            " Black root rot, R.L. Wick\n" +
            "White Mold (Sclerotinia sclerotiorum)\n" +
            "White mold affects many vegetable crops but carrots are particularly susceptible, especially late in the season and during storage. The fungus may be present in soil, storage areas, or containers. Symptoms include characteristic white mycelial growth and hard, black sclerotia (overwintering structures), which can be seen on the crown of infected carrots. In storage, the disease is characterized by a soft, watery rot with fluffy white mycelia and black sclerotia present. Sclerotia can persist in soil for many years and the fungus has a very wide host range making this disease difficult to manage. Grasses and onions are non-hosts that can be used in long rotations and a commercially available biocontrol organism (trade name Contans) has been shown to be effective in parasitizing overwintering sclerotia. Contans should be incorporated into infested soils in the fall if a susceptible crop must be planted there next year.\n" +
            " \n" +
            "White mold with sclerotia, W. Brown\n" +
            "Cavity Spot and Root Dieback (Pythium spp.)\n" +
            "Infections from Pythium spp. can occur during early root development and are favored by moist soil conditions. Root dieback symptoms appear as rusty-brown lateral root formation, or forking and stunting; symptoms that can be easily confused with damage from nematodes, soil compaction or soil drainage problems. " +
            "Cavity spot often shows up later in the season near harvest. Horizontal, sunken lesions varying in size from 1 to 10 mm appear on the surface of the root and can provide an ingress for secondary fungal or bacterial infections.\n" +
            " \n" +
            "Cavity spot caused by Pythium sp., S. Livingston\n" +
            "Crown Rot (Rhizoctonia carotae)\n" +
            "Early symptoms of crown rot are horizontal dark brown lesions around the root crown. As the crop matures the tops may die in patches in the field and as the disease progresses lesions join to form large, deep, rotten areas on the top part of the root. R. carotae can also cause crater rot and violet root rot but these diseases are less common in MA. Crown rot is favored by moist conditions, so planting on ridges, harvesting early and without wounding, cleaning equipment, and maintaining clean and proper storage conditions may minimize impact.\n" +
            "Scab (Streptomyces spp.)\n" +
            "Scab can cause both raised and sunken, dry, corky lesions on the carrot root, however, symptoms are rarely severe enough to cause major losses in yield or crop marketability. Avoid planting carrots in alkaline soils, which are known to favor the incidence of scab, or in potato fields with high incidence of scab, as the disease may be caused by the same organism in carrots.\n";
    String storage = "HARVEST AND STORAGE\n" +
            "You can harvest carrots anytime they reach a usable size.Irrigate the day before harvest or dig them after rain, to ensure root hydration.\n" +
            "Push a garden fork into the soil near the plant, pushing the root to the side to loosen the soil, and pull it out of the ground. Simply pulling without freeing the carrot from the soil first can result in a broken root.\n" +
            "•\tRemove the greens and clean the roots before consumption or storage.\n" +
            "•\tStore harvested carrots in the refrigerator for immediate use.\n" +
            "•\tModern refrigerators have relatively low humidity, so the carrots will lose moisture. The normal temperature of a home refrigerator is usually above 32°F. Carrots held above freezing will begin to sprout.\n" +
            "•\tFor longer-term storage, a root cellar can be ideal, though few gardeners have one.  \n" +
            "•\tYou must process canned carrots using a pressure canner.\n" +
            "•\tYou may also pickle, process in a boiling water \n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrots);


        expandableTextView = findViewById(R.id.expand_text_view);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view4);
        care = findViewById(R.id.expand_text_view5);
        storages = findViewById(R.id.expand_text_view6);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(disease);
        care.setText(caring);
        storages.setText(storage);

    }
}
