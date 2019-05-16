package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class LettuceActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "BEFORE PLANTING\n" +
            "Although they may form a long taproot, the smaller horizontal roots close to the surface absorb nearly all the water and nutrients used by the plant. If the soil becomes dry or is low in nutrients, the plants will struggle to grow and their quality will be poor.\n" +
            "SOIL TESTING AND FERTILIZER\n" +
            "•\tThe best pH range for lettuce and chicories is between 6.0 and 6.8.\n" +
            "o\tApply phosphorus (P) and potassium (K) according to soil test recommendations.  \n" +
            "o\tMany Kenya soils have enough phosphorus. Unless your soil test report specifically recommends additional phosphorus, use a low- or no-phosphorus fertilizer. \n" +
            "•\tImprove your soil by adding well-rotted manure or compost in spring or fall. Do not use fresh manure as it may contain harmful bacteria and may increase weed problems. \n" +
            "•\tThe soil should be well drained and moisture retentive. Till the soil deeply, and then smooth the surface. \n" +
            "•\tUse a complete fertilizer such as a 10-10-10, at the rate of two pounds per 100 square feet. \n" +
            "•\tWhen the plants are about four inches tall, apply a side-dressing of the same fertilizer at a rate of one pound for each 25 feet of row. \n" +
            "•\tDo not use any fertilizer containing a weed killer (\"Weed and Feed\"), as it may kill your vegetable plants.\n" +
            "SELECTING PLANTS\n" +
            " Lettuce types\n" +
            "•\tNon-heading: loose-leaf, including oakleaf and lolla.\n" +
            "•\tSoft heads: butterhead and bibb.\n" +
            "•\tRuffled heads: French crisp, summer crisp, or Batavia.\n" +
            "•\t Tall, compact heads: cos or romaine.\n" +
            "•\tDense, solid head: crisphead or iceberg.\n" +
            "•\t Loose-leaf varieties are easiest to grow.  \n" +
            " Chicories: endive, escarole, radicchio and Italian dandelion\n" +
            "Chicories are close relatives of lettuce, and you can grow them in similar ways. The coffee substitute called chicory comes from the dried roots of these plants. Try these varieties to add color and texture to your garden and flavor to your salads.\n" +
            "•\tEndive is a versatile salad and cooking green. Mild and sweet, with slight bitterness, curly endive is a common salad green.\n" +
            "•\tEscarole is a form of endive with broader, smoother leaves. \n" +
            "o\tRecipes usually call for cooked escarole. \n" +
            "•\tBelgian endive is an expensive winter specialty. \n" +
            "o\tIn fall, dig up Belgian endive roots and store them in a root cellar. Give them complete darkness to produce small dense heads of pale leaves. \n" +
            "o\tIt is very difficult for a home gardener to grow Belgian endive successfully. \n" +
            "•\tRadicchio forms dense, bitter heads. \n" +
            "o\tPlant in summer for fall harvest. Treat it the same as endive or lettuce. \n" +
            "o\tRadicchio needs about 60 to 70 days to mature, much longer than lettuce or endive. \n" +
            "o\tAlthough radicchio has some cold hardiness, it may not form a head before winter comes. \n" +
            "•\tItalian dandelion is another form of radicchio, a bitter green for salads or cooking. It is easy to grow. \n" +
            "o\tDirect seed Italian dandelion in spring, summer or fall. \n";
    String Fertilizer = "PLANTING\n" +
            " Starting seed indoors\n" +
            " \n" +
            "Lettuce seedlings\n" +
            "Lettuce and chicory seed are very small and difficult to see.\n" +
            "Starting seeds indoors gives you the chance to handle the seed in controlled conditions while it is still cold outside, as well as during the heat of the summer.\n" +
            "Indoor air temperatures, easily managed fertility and water, and bright lights on a timer will produce strong plants. You can space young plants correctly in the garden without stooping to hand thin.\n" +
            " Direct seeding\n" +
            "To direct seed lettuce, it is important that you prepare the soil ahead of time.\n" +
            "•\tA cloddy, clumpy seedbed will reduce seed germination and emergence.<br>\n" +
            "•\tSeeds of these plants are very small. <br>\n" +
            "•\tIt is easy to seed these crops too heavily or too deeply. <br>\n" +
            "•\tThe raw, untreated seed is difficult to see and handle.\n" +
            "Consider buying pelleted seed.\n" +
            "•\tInert clay-based material coats pelleted seeds and increases the size of the seed.<br>\n" +
            "•\tThey are easier to plant sparingly and precisely.<br>\n" +
            "•\tThe seed coating can also help with germination by taking up water and conducting it to the seed.\n" +
            "Although the price of pelleted seed is higher than the unmodified seed, many gardeners get better results with less effort when they use prepared seeds.\n" +
            "Place the prepared seeds evenly every two to four inches. You will waste less seed and reduce the need to thin the plants as they grow.  \n" +
            "If using unmodified seed, seed lightly and evenly down the row.\n" +
            "•\tSow seeds in the spring as soon as the soil is workable. <br>\n" +
            "•\tFor a fall crop, sow seed about three months before the average first fall frost date. <br>\n" +
            "•\tPlant seeds 1/4 to 1/2 inch deep, in rows 18 to 30 inches apart. <br>\n" +
            "•\tThin the seedlings when they are still small. Try to do this without damaging the remaining plants. <br>\n" +
            "•\tClip off unwanted plants with a pair of small shears to avoid disturbing the other plants. <br>\n" +
            "•\tFinal plant spacing depends on the variety. Rows should be at least 18 inches apart. <br>\n" +
            "•\tLoose-leaf lettuces can fill a wider spacing in fall, when the plants are likely to grow well and are less likely to bolt.<br>\n" +
            "•\tWhen bolting, the plant sends up a flowering stalk and stops growing.\n" +
            " Transplanting\n" +
            " \n" +
            "Lettuce seedlings\n" +
            "•\tPurchase transplants from a garden center or grow your own by planting seeds indoors in early April or about four weeks before transplanting.<br>\n" +
            "•\tFor fall crops, plant seed in July.<br>\n" +
            "•\tHarden seedlings by reducing water and temperature for two to three days before transplanting.\n" +
            " Plant spacing for lettuce, endive, radicchio and Italian dandelion\n" +
            "Plant spacing for lettuce, endive, radicchio and Italian dandelion\n" +
            "Plant\t\tHarvest stage\tSpacing\n" +
            "Italian dandelion\t\tTo allow full growth\t2 to 3 inches\n" +
            "Leaf lettuce, frilly endive\t\tTo pick at baby-leaf size\t5 inches\n" +
            "Leaf lettuce, frilly endive\t\tFor full-size plants\t10 to 12 inches\n" +
            "Radicchio, head lettuce\t\tMini head: 4 to 5 inch diameter\t6 to 8 inches\n" +
            "Radicchio, head lettuce\t\tFor full-size plants\t10 to 12 inches\n" +
            "Endive\t\tTo self-blanch\t8 inches\n" +
            "Endive\t\tTo allow full growth\t10 to 12 inches\n" +
            " Blanching\n" +
            "Blanching endive will grow white leaves in the heart of the plant and prevent excessive bitterness.\n" +
            "About a month after transplanting, or six weeks after direct seeding, carefully tie the outer leaves up around the heart of the plant with string or rubber bands.\n" +
            "Blanching takes about two weeks.\n" +
            "If you space the plants closely, they will develop more upright growth and will self-blanch to some degree.\n" +
            " Bolting\n" +
            "Both lettuce and the chicories do best in cool weather. Ideal conditions are a nighttime low temperature of 50°F, and up to a 68°F daytime high temperature.\n" +
            "Along the Lake Superior shore and in other cool parts of the state, you can grow lettuce and endive during most of the summer.\n" +
            "These plants may bolt in response to long days, high light intensity, and heat. Bolting causes extreme bitter flavor.\n" +
            "While lettuce breeders continue to grow varieties that are slow to bolt, there is always a chance that a planting will flower. Bolting ends the possibility of harvest.\n";
    String disease = "HOW TO KEEP YOUR LEAFY GREENS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\n" +
            "•\tWatering is important to grow these salad crops, as they have small, shallow root systems. \n" +
            "•\tOne inch of rainfall per week is adequate. \n" +
            "•\tIf your soil is sandy, it is better to water more often than once a week. \n" +
            "•\tAn inch of water will wet a sandy soil to a depth of ten inches, a heavy clay soil to six inches. \n" +
            "•\tUse a trowel to see how far down the soil is wet. If it is only an inch or two, keep the water running. \n" +
            "•\tWhen rainfall or watering follows a dry spell, the plants will suddenly resume growth. This leads to “tipburn,” or the browning of the leaves. \n" +
            "•\tLettuce, endive and radicchio will be crisper if you water them often in the days prior to harvesting.\n" +
            " CONTROLLING WEEDS\n" +
            "•\tFrequent, shallow cultivation with a hoe or hand tool will kill weeds before they become a problem. \n" +
            "•\tScratch the soil just deeply enough to cut the weeds off below the surface of the soil. Be careful not to damage the plants when cultivating.\n" +
            "•\tMulching with herbicide-free grass clippings, weed-free straw, or other organic material to a depth of 3 to 4 inches can help prevent weed growth, decreasing the need for frequent cultivation.\n" +
            " INSECTS\n" +
            "•\tUse a lightweight floating row cover to keep insects out without causing too much heat. \n" +
            "•\t Snails and slugs may cause holes in the leaves. \n" +
            "•\tWet weather usually increases pest pressure.\n" +
            "•\tDo not apply insecticides to plant parts that you will eat.\n" +
            "CAUTION: Mention of a pesticide or use of a pesticide label is for educational purposes only. Always follow the pesticide label directions attached to the pesticide container you are using. Remember, the label is the law.<br>\n" +
            "When treating fruits or vegetables, make sure the plant you wish to treat is listed on the label of the pesticide you intend to use. Also be sure to observe the number of days between pesticide application and when you can harvest your crop.\n";
    String caring = "•\tDISEASES AFFECTING LETTUCE PLANTS\n" +
            "•\t Diseases affecting lettuce plants are either bacterial or fungal. Fungal lettuce diseases, such as damping off or sclerotinia drop (white mold), are caused by soil borne fungi that thrive in cool, damp soil and are primarily lettuce seedling diseases. Treating these lettuce diseases is achieved by spacing the plants apart to provide airflow and by reducing the amount of irrigation the seedlings receive. If you live in an area of more consistent precipitation and cooler temperatures, try planting fungal disease resistant lettuce such as ‘Optima’ to prevent lettuce seedling diseases from taking hold. Bottom rot, another fungal lettuce disease caused by RHIZOCTONIA SOLANI, attacks more mature plants. Lesions appear on the plant at the midrib and leaf blade, causing rotting during warm, wet conditions. Bacterial leaf spot appears as small, angular lesions and progresses to larger lesions and necrotic areas, which dry out and eventually collapse. \n" +
            "•\tSPORULATING DOWNY MILDEW, caused by Bremia lactucae, also causes necrotic lesions but affects the older leaves of the lettuce first. The bacterium Rhizomonas suberifaciens afflicts the roots, causing them to become very brittle and resulting in small head sizes. Lettuce Disease Control Of course, there are a variety of pests that assault lettuce plants and many will spread common lettuce diseases as they move from plant to plant. Check around the lettuce plant for uninvited guests to potentially eliminate disease of any kind as the cause for deterioration. Most pests can be eliminated by the use of insecticidal soap, introduction of beneficial insects, planting nectar-rich plants (like cilantro or sweet alyssum), spreading organic bait and the use of row covers. If you have established that the frail, fading lettuce is not the result of pests but of disease, the following tips for lettuce disease control may help:\n" +
            "•\t Treating lettuce diseases may be a matter of sowing disease or fungal resistant varieties, planting the appropriate variety for your climate at the correct time of year, appropriate spacing and irrigation. For some diseases affecting lettuce plants, weed control is essential as is crop rotation. Planting lettuce in raised beds may also be effective in warding off some pathogens.\n" +
            "•\t And lastly, a chemical control measure may be used. Of course, always follow the manufacturer’s instructions for application.\n";
    String storage = " HARVESTING\n" +
            "•\tHarvest single leaves as soon as they reach a usable size. \n" +
            "•\tIf you harvest individual leaves at the \"baby\" stage, leaving most of the small leaves on the plant, multiple harvests are possible. \n" +
            "•\tYou can also remove the whole plant by cutting it off at or just above the soil surface. \n" +
            "•\tFor the spring crop, flavor is best if you harvest the plants before the weather becomes hot and dry. \n" +
            "•\tHeat will slow growth and the leaves will become tough and bitter as the plant bolts. \n" +
            "•\tFor the fall crop, the cooler the weather, the better the flavor. \n" +
            "•\tFreezing temperatures stop growth.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lettuce);

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
