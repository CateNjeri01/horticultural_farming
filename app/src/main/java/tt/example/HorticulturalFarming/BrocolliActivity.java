package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class BrocolliActivity extends AppCompatActivity {

    ExpandableTextView expandableTextView ,e , diseases,care;

    String Planting = "SOIL PH AND FERTILITY\n" +
            "\n" +
            "•\tGrow broccoli in well drained yet moisture-retentive, fertile soil with pH of 6 to 7.\n" +
            "o\tApply phosphorus (P) and potassium (K) according to soil test recommendations.  \n" +
            "o\tMany Kenyan+ soils have enough phosphorus. Unless your soil test report specifically recommends additional phosphorus, use a low- or no-phosphorus fertilizer.\n" +
            "•\tIt is not worth growing broccoli unless the plants absorb water and nutrients steadily during their growth.\n" +
            "•\tImprove your soil by adding well-rotted manure or compost in spring or fall.\n" +
            "•\tDo not use fresh manure as it may contain harmful bacteria, and may increase weed problems. \n" +
            "•\tSide-dress when the plants are about four inches tall.\n" +
            "•\tDo not use any fertilizer containing a weed killer (\"Weed and Feed\"), as it may kill your vegetable plants.\n";
    String Fertilizer = "SELECTING PLANTS" +
            "“Sprouting,” or “Calabrese” broccoli is a large-headed green vegetable in the form of a small tree, grown on a plant with large blue-green, upright leaves. Other broccolis include Chinese broccoli (kailaan, choy sum) and broccoli raab (cima di rapa, rapini).\n" +
            " \n" +
            "\n" +
            "\n" +
            "\n" +
            "Windsor broccoli plant\n" +
            "Some broccoli varieties are good for spring planting, growing quickly and producing heads before the hot summer weather. For spring-planted broccoli, choose a variety with heat tolerance and a short growth cycle (50 to 60 days to harvest).\n" +
            "Most grow best as a mid-summer planting for fall harvest. For the fall crop, choose varieties with a longer growth cycle of 60 to 85 days so that the heads are forming in cooler temperatures.\n" +
            "While summer heat harms the quality of the developing head, heat while the leafy broccoli plant is growing is fine. By the time heads form on plants started in July, the weather will have started to cool down.\n" +
            "Planting\n" +
            "\n" +
            " Planning your broccoli crop\n" +
            "For spring-planted broccoli, start seeds indoors in early to mid-April.  \n" +
            "For the fall crop, you can start seeds indoors or out, in early to late July.\n" +
            "Whether you plant in spring or summer, a row cover will shield the plants from wind and insects during the first weeks of growth. In spring, use a cover material that will give protection against cold. In summer, use a lightweight material so that temperatures do not get too hot under the cover. \n" +
            "If strong winds loosen a floating row cover, it can do more damage than the plants would suffer without it. Anchor the row cover firmly with soil and/or pins at the edges. You can also support the row cover with wire hoops.  \n" +
            " Starting seeds indoors\n" +
            "•\tStart broccoli seeds indoors in early April or July.\n" +
            "•\tUse sterile, soilless seedling mix. Press the seeds one-fourth to one-half inch deep.\n" +
            "•\tDo not use bottom heat. The seeds will germinate and the plants will grow well in regular summer temperatures.\n" +
            "•\tSeeds should germinate in about two weeks. Turn on bright grow lights above them once the seedlings emerge.\n" +
            "•\tUse fertilizer on developing seedlings when the first true leaf appears. Use a half-strength starter solution once a week. After two true leaves are present, use fertilizer twice a week.\n" +
            "•\tWhen the plants have four or five true leaves, after about four weeks, reduce watering. Place plants outside where they will receive wind protection and a couple hours of sunlight.\n" +
            "•\tGradually expose them to more sunlight and wind over the next week. Keep them well watered.\n" +
            "•\tDig small holes with a trowel, or dig a long narrow trench with a shovel. Place the seedlings eight to 10 inches apart, and fill the soil around them so that the plant is at the same level it was in its pot.\n" +
            "•\tWater the plants in, or use a liquid starter solution high in phosphorus and low in nitrogen and potassium. Apply a row cover.\n" +
            " Direct seeding\n" +
            "•\tDirect seed broccoli in July.\n" +
            "•\tPlant seed shallowly, one-fourth to one-half inch deep, dropping three seeds every eight to 10 inches.\n" +
            "•\tKeep the soil moist during emergence.\n" +
            "•\tOnce the plants emerge, thin so that one seedling remains every eight to 10 inches.\n" +
            "•\tTake care of the seedlings, as they experience extreme heat, wind, drought and insects when they are most vulnerable. Water them as needed.\n";
    String disease = "HOW TO KEEP YOUR BROCCOLI PLANTS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\n" +
            "•\tLike other plants in this species, broccoli needs good soil moisture. To produce sweet, flavorful, firm, non-bitter heads, the plants must not experience water stress.\n" +
            "•\tIf the plants do not receive consistent rainfall or irrigation, they may form small, disappointing, off-flavored heads.\n" +
            "•\tIf the planting does not receive one inch of rain each week, soak the soil thoroughly at least once a week. If your soil is sandy, water more often than once a week.\n" +
            "•\tAn inch of water will wet a sandy soil to a depth of ten inches, a heavy clay soil to six inches.\n" +
            "•\tUse a trowel to see how far down the soil is wet. If it is only an inch or two, keep the water running.\n" +
            " CONTROLLING WEEDS\n" +
            "•\tFrequent, shallow cultivation with a hoe or other tool will kill weeds before they become a problem.\n" +
            "•\tHoe just deeply enough to cut the weeds off below the surface of the soil. Do not damage the plants when cultivating.\n" +
            "•\tMulching with herbicide-free grass clippings, weed-free straw, or other organic material to a depth of three to four inches can help prevent weed growth, decreasing the need for frequent cultivation.\n" +
            " Insects\n" +
            "•\tFlea beetles chew small holes in leaves. Seedlings are most vulnerable to injury from this feeding. \n" +
            "•\tImported cabbage worm, cabbage looper, and diamondback moth larvae feed on the leaves. Young seedlings and transplants are most vulnerable to injury from this feeding. \n" +
            "•\tCabbage maggots feed on the roots, injuring the plants, sometimes killing them.\n" +
            " Diseases\n" +
            "A variety of diseases affect broccoli, including Alternaria leaf spot, black rot, black leg, and clubroot. \n" +
            "Since many diseases arrive on infected seed, always purchase clean, disease-free seed from a reliable source. Remove diseased plant material from the garden and destroy it, or bury it where found.\n" +
            "Use good cultural control practices to reduce disease problems and have a successful harvest. \n" +
            "Practice crop rotation. Avoid planting broccoli where you grew related crops--Brussels sprouts, cauliflower, collards, kale, turnip, rutabaga, cabbage, mustard, bok choy, or kohlrabi--during the previous four years.\n" +
            " HARVEST\n" +
            "•\tHarvest broccoli when heads reach a usable size, while they are still tight and before flower buds have opened. Broccoli flower buds\n" +
            "•\tCut the head off the plant, taking a short stalk.\n" +
            "•\tLeave the lower portion in the garden.\n" +
            "•\tMany smaller heads—“side shoots”—will begin to form after removing the central head. Harvest these side shoots when they reach usable size.\n" +
            "•\tBroccoli has some cold tolerance. It will continue to grow after the first light frosts in the fall.\n" +
            "•\tNo matter the weather, harvest promptly once it is mature, as it does not keep its quality.\n" +
            "•\tIf you miss the chance to harvest, and flowers are beginning to open, immediately cut the head.\n";
    String caring = "BROCCOLI GROWING TIPS\n" +
            "There are, however, tips to yield better and bigger broccoli heads. \n" +
            "•\tFirst, you need to add compost as topdressing when the central flower/head measures an inch in diameter. Just sprinkle around the plant’s base but never against the stem. \n" +
            "•\tSecond, always ensure ample moisture by giving the plant 1-2 inches of water per week during dry weather. However, you must never water the head as you can encourage flowering, which is definitely not desired in broccoli cultivation. \n" +
            "•\tThird, you have to mulch to maximize moisture retention as well as to prevent weed growth. Growing broccoli also means that you may want to install cardboard collars to prevent cutworms from eating the plant and row covers for protection against the cold.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brocolli);


        expandableTextView = findViewById(R.id.expand_text_view);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view4);
        care = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(disease);
        care.setText(caring);
    }
}
