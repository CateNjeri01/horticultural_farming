package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class CucumberActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care;


    String Planting = "SOIL PH AND FERTILITY\n" +
            "•\tFor best yield and quality, the soil pH should be between 6.0 and 6.5, which is slightly acidic.\n" +
            "•\tThe soil should be moisture retentive yet well drained.\n" +
            "•\tForming raised beds will ensure good drainage, which these crops need. \n" +
            "•\tImprove your soil by adding well-rotted manure or compost in spring or fall. Do not use fresh manure as it may contain harmful bacteria and may increase weed problems.\n" +
            "•\tDo not use “Weed and Feed” type fertilizers on vegetables. They contain weed killers that will kill vegetable plants.\n" +
            "SELECTING PLANTS\n" +
            " Male and female plants\n" +
            "Cucumber plants have separate male and female flowers on the same plant. Male flowers usually appear first, each attached to the plant by a slender pedicel, or stem. Female flowers grow close to the main vine. Between the flower and the vine is a small round ovary, the unfertilized fruit.\n" +
            "An insect must move the pollen from the male flowers to the female flowers. Bees are common cucumber pollinators. Some newer varieties of cucumber will set fruit that develops normally, even if there is no pollination of the female flowers. These fruits will be seedless or nearly so.\n" +
            "Other varieties have only female flowers, each of which can produce a fruit. These varieties can have high yields. You must grow the all-female varieties with another cucumber variety having traditional flowering habit to provide pollen.\n" +
            "PLANTING\n" +
            " Starting seeds\n" +
            "The best way to start cucumbers is direct seeding. Use a soil thermometer and sow seeds after the last frost date, once the soil is at least 70° F at the one-inch depth.\n" +
            "Earlier planting is possible with the use of black plastic mulch, which raises soil temperature. Apply black plastic mulch to the soil once you prepare it in the spring. Cut holes or slits in the mulch, and plant the seeds.\n" +
            "Sow seeds about one-half inch deep. For vining types that will spread out in the garden, sow seeds two inches apart. Allow about two or three feet of space on either side of the row for the vines to spread.\n" +
            "A \"hill\" of three or four seeds sown close together is another way to plant cucumbers in the garden. Allow five to six feet between hills. You can plant bush types, with very short vines, in closely spaced rows or hills, with only two to three feet between rows or hills.\n" +
            "After emergence, thin seedlings to stand 8 to 12 inches apart. You may also train the vines to climb a three- to four-foot trellis, allowing you to space garden rows more closely, and producing perfectly straight fruit.\n" +
            "After the seedlings have emerged, position the row covers over the plants, securing the edges with soil or staples. Spun row covers raise air temperature around the plants and protect them from cold nights. Row covers prevent both pests and beneficial insects needed for pollination from the plants, so you must remove them from the plants once flowering begins, unless the variety is seedless.\n" +
            " Transplanting\n" +
            "•\tCucumber seeds will not germinate in cold soil. Plants started indoors and set out into cold soil will also not grow very well. \n" +
            "•\tSince the plants cannot survive freezing temperatures, plan to set the plants out after the last frost date.\n" +
            "•\tStart seeds indoors no earlier than four weeks before the last frost date.\n" +
            "•\tStart the seeds in peat pots that you can plant directly into the soil.\n" +
            "•\tBefore the plant begins to outgrow its container, transplant it carefully. Do not damage the cucumber’s taproot.\n";
    String Fertilizer = "HOW TO KEEP YOUR CUCUMBER PLANTS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\n" +
            "•\tLong taproots and branching surface roots help cucumber plants reach soil moisture even in dry weather.\n" +
            "•\tVine crops are heavy water feeders, so you should constantly check soil moisture.\n" +
            "•\tCucumbers need about one inch of water from rainfall or irrigation each week during the growing season.\n" +
            "•\tAlways soak the soil thoroughly when watering.\n" +
            "•\tWater sandy soils more often, but with lower amounts applied at any one time.\n" +
            "•\tWater the plants with drip hose, soaker hose or a careful watering of the soil, so that the leaves stay dry. Do not use a sprinkler or spray the plants with a hose.\n" +
            "•\tTrellised plants growing vertically may require watering more often.\n" +
            " CONTROLLING WEEDS\n" +
            "•\tFrequent, shallow cultivation with a hoe or hand tool will kill weeds before they become a problem.\n" +
            "•\tThe roots of vine crops are close to the surface of the soil, so it is important not to cultivate too deeply or too close to the plants.\n" +
            "•\tScratch the soil surface with a hoe just deeply enough to cut the weeds off below the surface of the soil.\n" +
            "•\t Continue cultivating as long as you can do so without injuring the plants, usually when the vines begin to spread between the rows.\n" +
            "•\tWhen cultivation is no longer possible, pull large weeds by hand.\n" +
            "•\t If you use mulch such as straw or compost to help control weeds, do not apply it until the soil is above 75°F. These mulches can slow soil warming.\n";
    String disease = "COMMON PROBLEMS\n" +
            "Poor fruit set could e due to not enough pollination. Cold, rain or cloudy weather can reduce pollination.\n" +
            "Bitterness in cucumbers is sometimes a problem. Typically, fruits are bitterer closer to the skin, and bitterest at the blossom end. Concentrations of the bitter compound, cucurbitacin, vary among varieties. There are some non-bitter varieties available to home gardeners. Bitter varieties are more attractive to cucumber beetles, so planting non-bitter varieties has the benefit of less pests.\n" +
            "The first blossoms often drop from the vines. This is not a problem, since the first flowers to appear on the vines are male. The female flowers, which open later, have a swelling at the base that forms the fruit, also known as the ovary. After bees pollinate these female flowers, the fruit develops.\n" +
            " Insects\n" +
            "Striped cucumber beetles damage plants by eating leaves as well as flowers, stems, and fruit. They may also help cause bacterial wilt. Although the spotted cucumber beetle can be a pest, it is much less common in Kenya.\n" +
            " Diseases\n" +
            "•\tMany diseases can infect cucumbers and other plants in the cucurbit family.\n" +
            "•\tDamage can include brown spots, tattered holes in leaves, sunken brown lesions on vines and rotted fruit.\n" +
            "•\tVirus diseases can not only harm cucumber plants, but also spread to other plants in the garden, including many weeds, tomatoes, lettuce and spinach. They can also overwinter in perennial weeds outside the garden, and re-infect garden plants the following year.\n" +
            "•\tCucumber seedlings are susceptible to damping off especially when planted into cold, wet soils. \n" +
            "•\tPowdery mildew, a fungal disease that causes powdery white spots to form on leaves and vines, can infect cucumber. If this disease has been a problem in the past, plant powdery mildew resistant or tolerant varieties, and create good air movement around the plants by controlling weeds and using proper plant spacing.\n" +
            "•\tSeveral fungal leaf spot and fruit rot diseases can affect cucumber. \n" +
            "•\tIn some years, bacterial wilt can cause wilting and hurt plant growth.\n";
    String caring = "HARVEST AND STORAGE\n" +
            "HARVEST\n" +
            "•\tPick cucumbers when they reach the size you prefer. For pickles, try to harvest at a uniform size.\n" +
            "•\tPickling cucumbers often have very good flavor for salads as well.\n" +
            "•\tHarvest slicers or salad cucumbers at any size before they are over-large, with large seeds and yellowish skins.\n" +
            "•\tIf you leave very large cucumbers on the vine, plant yield will decline.\n" +
            "•\tHarvest often, but be careful not to disturb the vine, as they often send out new roots from joints in the vine. Disturbing the vine can break these roots.\n" +
            "•\tDo not pick fruit when the vines are wet, because of the danger of spreading diseases.\n" +
            "Storage\n" +
            "•\tGood storage conditions for cucumbers, humid and 55°F, do not exist in most kitchens.\n" +
            "•\tA cool basement might work as a place to hold cucumbers in perforated plastic bags.\n" +
            "•\tCucumbers will keep for about a week in the refrigerator.\n" +
            "•\tThe time-honored way to preserve cucumbers is by pickling.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucumber);


        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        care = findViewById(R.id.expand_text_view4);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(disease);
        care.setText(caring);

    }
}
