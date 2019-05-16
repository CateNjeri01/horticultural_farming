package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class OnionsActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "SOIL PH AND FERTILITY\n" +
            " Soil testing and fertilizer\n" +
            "•\tOnions grow best in well-drained soil with pH between 6.0 and 7.0, and high organic matter.\n" +
            "o\tApply phosphorus (P) and potassium (K) according to soil test recommendations.  Many Kenya soils have enough phosphorus.\n" +
            "o\tUnless your soil test report specifically recommends additional phosphorus, use a low- or no-phosphorus fertilizer.\n" +
            "•\tYou can increase your soil’s organic matter content by adding well-rotted manure or compost in spring or fall. Do not use fresh manure as it may contain harmful bacteria and may increase weed problems. \n" +
            "•\tOnions require a good supply of available nitrogen, but too much nitrogen can result in late maturity, large necks that are difficult to cure, soft bulbs, green flesh and poor storage quality.\n" +
            "•\tSide dress with fertilizer after root systems are well-developed.\n" +
            "o\tDo this once or twice during the growing season, with urea (45-0-0) at a rate of 0.25 to 0.5 pound per 25 feet of row.\n" +
            "o\tSpread the fertilizer alongside the row of onions, about six inches away from the plants, and scratch it into the soil.\n" +
            "•\tDo not use “Weed and Feed” type fertilizers on vegetables. They contain weed killers that will kill vegetable plants.\n";
    String Fertilizer = "PLANTING\n" +
            " Direct seeding\n" +
            "Direct seed as soon as the soil is workable.\n" +
            " \n" +
            "Red onion seedlings\n" +
            "Sow seeds in a two-inch wide band, one-fourth to one-half inch deep, in rows 12-18 inches apart. After seedlings emerge, thin to three to four inches apart.\n" +
            " Transplanting\n" +
            "Some seed companies sell onion transplants. They can tolerate light frosts, and you can plant them when temperatures reach 50° F.\n" +
            " \n" +
            "Planting small onion bulbs\n" +
            "You can also raise your own transplants by starting seed indoors 10-12 weeks before planting outside. \n" +
            "For May plantings, start seeds in February. Sow seeds three-fourths of an inch deep, and keep evenly moist. \n" +
            "Loosen plants when ready to transplant.\n" +
            " Trim roots to half an inch and tops to four inches in length. Plant two inches deep, three to four inches apart in rows 12-16 inches apart.\n" +
            "You can also plant onions from sets, small bulbs grown the previous year. \n" +
            "Most of the sets available from local stores in Kenya are of the short-day type. \n" +
            "If using sets, plant them as soon as the soil is workable in the spring.\n";
    String disease = "HOW TO KEEP YOUR ONION PLANTS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\n" +
            "•\tOnions are shallow-rooted and require constant moisture for good growth.\n" +
            "•\tIf the planting does not receive one inch of rain each week, soak the soil thoroughly at least once a week.\n" +
            "•\tAn inch of water will wet a sandy soil to a depth of ten inches, a heavy clay soil to six inches.\n" +
            "•\tIf your soil is sandy, it is important to water more often than once a week.\n" +
            "•\tUse a trowel to see how far down the soil is wet. If it is only an inch or two, keep the water running.\n" +
            "•\tStop watering when bulbs have reached full size and the tops begin to fall.\n" +
            " Controlling weeds\n" +
            "•\tUsing a hoe or hand tool, make a shallow cut to kill weeds just below the soil level before they become a problem.\n" +
            "•\tDo not hoe or chop too deeply.\n" +
            "•\tMulching with herbicide-free grass clippings, weed-free straw, or other organic material to a depth of three to four inches can help prevent weed growth, decreasing the need for frequent cultivation.\n" +
            " Insects\n" +
            "Insects are not a major problem with onions, although onion maggots can be a potential pest.\n " +
            "Onion maggots bore into plant stems, causing the plants to turn yellow and wilt.\n";
    String caring ="COMMON DISEASES \n"+
            "DOWNY MILDEW\n" +
            "This disease can ruin a crop rapidly in cool, humid conditions. It often appears in warm areas in spring and late winter, flaring up where conditions are favourable. Pinpointing its origin can be difficult, however.\n" +
            "\n" +
            "The fungus survives the off-season in plants of the Allium genus (onions, leeks, chives and hundreds of other wild species) that can grow during this time.\n" +
            "\n" +
            "Spores landing on the plants do not need rain or irrigation to germinate; dew is sufficient. The spores can germinate in temperatures as high as 25°C, with 7°C to 16°C being most favourable. Spores are released in cycles of about two weeks.\n" +
            "\n" +
            "After infection, the leaves become yellowish and the downy fungus is visible on the leaf surface. This matures to a purple colour.\n" +
            "\n" +
            "Downy mildew does not usually kill the plant, but will greatly reduce yield and quality.\n" +
            "\n" +
            "Systemic products are now available to control the disease.\n" +
            "\n" +
            "When growing onions commercially in an area where downy mildew was an annual event, we would carry out preventative spraying using a very high rate of 2 000ℓ/ ha water with a wetting agent. We used dithiocarbamate products to try to prevent the downy mildew, but with only limited success.\n" +
            "\n" +
            "The arrival of the first systemic products changed all this. " +
            "I vividly recall the first trial I did with metalaxyl; I used a knapsack for the experiment and to my astonishment, obtained complete control wherever I sprayed.\n" +
            "\n" +
            "PURPLE BLOTCH\n" +
            "Alternaria porri favours warm, moist conditions. Late varieties on the Highveld and in northern areas are vulnerable as they will still be growing when the rainy season starts.\n" +
            "\n" +
            "This is a difficult disease to control. Although it can be seed-borne, it usually starts off from crop residue. A rotation of several years will be required after an outbreak. A common source of infection is the pile of infected onions discarded near the packing shed. Diseased onions should be buried.\n" +
            "\n" +
            "Purple blotch starts off as water-soaked spots on the leaves; these become oval or elongated and turn brown, red or purple. They are usually 2cm to 3cm long, sometimes with faint concentric rings on the outer edge.\n" +
            "\n" +
            "The disease often targets older leaves first, and these fold over from the damage. Infection is far more likely when there is thrip and hail damage.\n" +
            "\n" +
            "The literature usually suggests spraying dithiocarbamates as a preventative measure, but I have had no success with this method. I recommend using systemic products at the first sign of the disease.\n" +
            "\n" +
            "BOTRYTIS LEAF BLIGHT\n" +
            "Botrytis squamosa favours cool, moist conditions. I often come across it on leeks as well. It starts in a similar way to purple blotch, with elongated white spots. However, these occur in greater numbers and are found all over the leaf.\n" +
            "\n" +
            "They are also smaller – no more than a few millimetres in size – and the spots later become slightly darker in the centre. Hail and thrip damage increase the likelihood of this disease.\n" +
            "\n" +
            "The control measures are the same as for purple blotch.\n" +
            "\n" +
            "PINK ROOT\n" +
            "Phoma terrestris is easy to identify. The onions fail to grow as expected, and the roots show a pink colour in a plant removed from the soil.\n" +
            "\n" +
            "The disease often occurs where onions are grown repeatedly in the same soil. Some soils are more prone to pink root than others." +
            " The best course of action is to plant resistant varieties." +
            "Several kinds of rot can infect onions, including Fusarium basal rot, Botrytis neck rot and bacterial soft rot. To avoid these diseases, use only healthy transplants or sets, manage weeds in the garden and take care not to injure the onion bulbs. Resistant varieties are available for Fusarium basal rot.\n" +
            "Use good cultural control practices to reduce disease problems to a good level and allow for a successful harvest. \n" +
            "Practice crop rotation. Plant in an area where you have not grown onions, chives, leeks, shallots or garlic for the past four years.\n" +
            "";
    String storage= " HARVEST AND STORAGE\n" +
            "•\tHarvest onions when about half the tops are falling over and dry. Undercut and lift bulbs with a spading fork.\n" +
            "•\tYou can leave onions on the ground for several days if the weather will be dry and warm, or bring them indoors to cure.\n" +
            "•\tCuring is essential if you plan to store your onions.\n" +
            "•\tKeep the onions in a warm (75°F - 90°F), well-ventilated area for two to four weeks, until outer bulb scales are dry and the neck is tight. Poor curing will result in decay during storage.\n" +
            "•\tWhen properly dry, you can braid the onions or cut the tops off.\n" +
            "•\tStore onions in a cool, dry area. Do not let them freeze. They will start to sprout if kept above 40° F.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onions);


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
