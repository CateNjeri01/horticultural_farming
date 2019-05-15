package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class BlueBerryActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e, diseases, pests ,management;

    String berryplanting = "Blueberry plants grow slowly, and they may not seem to get much bigger from year to year. It takes a blueberry bush about 10 years to reach mature size, but this also means they will live a long, long time.\n" +
            "It will be 2 or 3 years before you start getting large harvests, but it is definitely worth the wait. The bushes are very attractive and will be a beautiful addition to your yard while you wait for fruit.\n" +
            "Care through the seasons\n" +
            "•\tMarch—Prune bushes before new growth begins, after coldest weather has passed\n" +
            "•\tApril, May—Plant new blueberry bushes\n" +
            "•\tMay, June—Apply mulch for growing season\n" +
            "•\tJuly—Harvest\n" +
            "•\tJuly through September—Apply soil amendments\n" +
            "•\tSeptember, October—Apply mulch for winter protection and enjoy fall color\n" +
            "•\tNovember, December—Put fencing around plants to keep out rabbits\n" +
            "PREPARING TO PLANT\n" +
            "Blueberry plants require acidic soil (pH 4.0 to 5.0) that is well-drained, loose and high in organic matter. Most garden soils in Kenya have higher pH and must be amended.\n" +
            "If pH is too high \n" +
            "•\tGrowth of the plant is slowed\n" +
            "•\tLeaves discolor\n" +
            "•\tPlants may die\n" +
            " Soil testing, fertilzer and mulch\n" +
            "Have your soil tested to determine pH.\n" +
            " \n" +
            "\n" +
            "This blueberry plant has signs of iron chlorosis caused by high soil pH. Younger leaves are usually the most discolored.\n" +
            "For sandy to sandy loam soils:\n" +
            "•\tIf the pH of the soil is between 5.5 and 7.0,  add sphagnum peat to the soil \n" +
            "o\tMix 4 to 6 inches of peat into the top 6 to 8 inches of soil to increase acidity\n" +
            "o\tPeat also increases the soil organic matter content \n" +
            "o\tWhen several plants are to be grown together, prepare an entire bed rather than digging holes for individual plants\n" +
            "•\tFor pH greater than 7.0 create a raised bed filled with an acidic planting mix \n" +
            "•\tTo accommodate two plants in the same bed \n" +
            "o\tCreate a raised planting bed 15 inches deep by 24 inches wide by 48 inches long \n" +
            "o\tFill with a soil mixture of sphagnum peat and loam soil at a ratio of about 2:1 (peat:soil) \n" +
            "o\tAs this soil settles and decomposes over the years, you will need to continue adding peat to the planting bed \n" +
            "o\tContinue to have your soil's pH tested every year or two, and amend as needed\n" +
            "For sandy dry soils:\n" +
            "•\tThere is no need to create a raised bed\n" +
            "•\tMake a hole in the ground 15 inches deep by 24 inches wide by 48 inches long\n" +
            "•\tFill it with the acidic soil mixture\n" +
            "Fertilizer and mulch\n" +
            "If you see light-green or red leaves in the summer or not much shoot growth, it is likely that the soil pH is no longer in the optimum range of 4.0 to 5.0, or nitrogen is needed. Choose an organic acid fertilizer, such as one recommended for azaleas and rhododendrons.\n" +
            "Throughout the life of the plants, maintain a few inches of mulch around the plants.\n" +
            "Selecting plants\n" +
            "Blueberry plants are widely available at local and online nurseries. Be certain the plants you buy are winter hardy \n" +
            "If buying plants locally, find potted plants that are at least two or three years old.\n" +
            " Caring for blueberry plants before planting\n" +
            " \n" +
            "\n" +
            "Most nurseries ship bare root plants at the appropriate time for planting in early spring. Keep dormant plants in a dark, cool, moist place until you're ready to plant.\n" +
            "Make sure the roots stay moist but not saturated, and plant as soon as possible. Soak roots in a bucket of water for a couple of hours before planting. \n" +
            "If you buy plants at a local nursery, keep potted plants well-watered in a sunny location until planting and plant as soon as possible.\n" +
            " \n" +
            "\n" +
            "Planting at least two varieties is best, as more berries of larger size will be produced if flowers are fertilized with pollen from another variety. Bumblebees and other native insects are enthusiastic pollinators of blueberries. The more insects working the plants, the more fruit you will harvest.\n" +
            "Region, weather and cultural practices may result in higher or lower yields.\n";
    String Fertilizer = "PLANTING\n" +
            "Blueberries grow best in full sun. Plants will tolerate partial shade, but too much shade causes plants to produce fewer blossoms and less fruit.\n" +
            " Choose a sunny location\n" +
            "•\tAvoid areas surrounded by trees.\n" +
            "o\tTrees provide too much shade, compete with plants for water and nutrients, and interfere with air movement around plants.\n" +
            "o\tPoor air movement increases danger of spring frost injury to blossoms and favors disease development.\n" +
            "•\tSpace blueberry plants about 3 feet apart. If the variety you purchase is listed as growing larger than that, then space them a little further apart.\n" +
            "•\tPlant young blueberry bushes in late April or early May.\n" +
            "•\tDig the holes large enough to accommodate all the roots and deep enough so you can cover the uppermost roots with 3 to 4 inches of soil.\n" +
            "•\tPack the soil firmly around the roots, then mulch the planting with 2 to 4 inches of sawdust, peat moss, oak leaf or pine needle mulch.\n" +
            "o\tThese types of mulch are acidic and will help maintain a low soil pH.\n" +
            "o\tMulch also helps maintain soil moisture, prevents weeds, and reduces soil temperature in the summer.\n" +
            "o\tReplenish mulch as needed.\n" +
            "•\tWater thoroughly after planting to ensure moisture reaches the deepest roots.\n" +
            "•\tWater the plant frequently and deeply, enough to keep the soil moist but not saturated.\n" +
            " Staking and support\n" +
            "Generally no support is required.\n" +
            "If a plant seems to be weak or growing at a non-vertical angle, a stake may be driven into the ground close to the main stem, and the stem gently tied to the stake with a wide tie such as those used for trees, or with a strip of fabric.\n" +
            "Do not use wire as it may cut into the stem.\n";
    String care = "HOW TO KEEP YOUR BLUEBERRY BUSHES HEALTHY AND PRODUCTIVE\n" +
            "\n" +
            " Weeding and caring for young plants\n" +
            " \n" +
            "\n" +
            "The bell-shaped blueberry flower is best pollinated by bumblebees.\n" +
            "In the first two years, remove flowers in the spring to encourage plant growth. This is necessary to ensure healthy, productive plants for years to come.\n" +
            "Production of flowers and fruits stunts growth when plants are too small or weak. A good-sized, healthy canopy is needed to support the fruit.\n" +
            "Blueberry plants grow slowly, which is one reason they live so long. The plants will put on plenty of fruit after the first few years, but don't be surprised if the plants stay small, as mature size is usually not reached until the plants are 8 to 10 years old.\n" +
            "Remove weeds regularly to keep your planting neat and clean and to prevent competition for water and nutrients. Mulch helps prevent weeds.\n" +
            " Controlling insects and other creatures\n" +
            "In the winter, rabbits enjoy nibbling on the stems of blueberry bushes. Protect plants by surrounding them with chicken wire or similar fencing in the winter.\n" +
            "Insects are not likely to cause problems with most home blueberry plantings. Here are some that may infest home gardens.\n" +
            "Spotted wing drosophila\n" +
            "The spotted wing Drosophila (SWD) is closely related to the common fruit flies that feed on decaying fruit.\n" +
            "•\tSWD lay their eggs in ripening berries that are still on plants and their larvae have been found in many different types of fruit, including blueberries and raspberries. \n" +
            "•\tSWD larvae burrow through the berries, making the fruit soft and unappealing. If berries are stored at room temperature, larvae can hatch after the fruit has been picked. \n" +
            "•\tDuring minor infestations, infested fruit can be made into wine or jelly. During severe infestations, the berries are too rotten to be used.\n" +
            "•\tManagement of SWD can be challenging but is best achieved through a combination of detection, sanitation and insecticides. \n" +
            "Japanese beetles\n" +
            "Japanese beetles have an exceptionally large host range, feeding on the leaves of over 300 species of plants, including apples, grapes, blueberries, raspberries, roses and plums.\n" +
            "•\tThey feed on the leaves between the veins, so when they are finished, there is a skeleton of brown fibers where the leaves used to be.\n" +
            "•\tBlueberry plants that have been severely chewed by Japanese beetles will be susceptible to winter injury.\n" +
            "•\tJapanese beetles are best controlled as adults. \n" +
            "•\tRemove the beetles by hand and put them in soapy water.\n" +
            "•\tThe best time to handpick beetles is in the evening and early morning, when they are less active.\n" +
            "•\tDon't use Japanese beetle traps. Research has shown that traps attract more Japanese beetles than they catch, and will cause more damage to plants in a garden. \n" +
            "Forest tent caterpillars\n" +
            "Forest tent caterpillars (also known as armyworms) primarily eat blueberry leaves when they are marching across the ground looking for new tree hosts. They generally move in large groups and a relatively small number of caterpillars can quickly defoliate a blueberry plant. \n" +
            "•\tBlueberries are most likely to be attacked in early to mid-June when forest tent caterpillars climb down the trees.\n" +
            "•\tWhen they defoliate blueberry plants, they destroy the crop for two years.\n" +
            "•\tThe current season's crop is lost because there are no leaves to support the fruit. \n" +
            "•\tThe following season's crop will be ruined because the plant will be making leaves in July and August instead of forming flower buds for the following year. \n" +
            " Diseases and challenges\n" +
            "Diseases are unlikely to cause significant problems on home grown blueberry plants.\n" +
            "Careful pruning will help prevent disease infection. Prune out and dispose of any part of the plant that is dead or dying.\n" +
            "Cankers\t\n" +
            "Examine the plants for cankers that first appear as small, discolored areas on the stems. As the affected areas enlarge, the margins remain reddish and the bark in the central part turns gray and then brown. \n" +
            "•\tCankers occur most frequently close to the ground but may occur higher on the stem.\n" +
            "•\tStems are usually girdled in one season by cankers.\n" +
            "•\tGirdled stems die and their brown foliage is quite obvious.\n" +
            "•\tCut out affected parts several inches below the cankered area.\n";
    String pest = "NUTRIENT-RELATED CHALLENGES \n" +
            "If you are growing blueberries in borderline acidic soil or soil you have had to amend to make it acidic, chances are you will encounter nutrient-related challenges more than any diseases or insect problems. As stated earlier, blueberry plants in soil with a pH above 5.5 will struggle to absorb the nutrients they need.\n" +
            "Signs of pH problems\n" +
            "•\tChlorosis, or discoloring of the leaves is usually the first sign of a soil pH problem\n" +
            "•\tSlowed growth\n" +
            "•\tPoor fruit production and general plant failure\n" +
            "•\tSoil amendments don't work quickly enough to fix this in one season\n" +
            "For a temporary solution \n" +
            "•\tSpray plants with a foliar chelated iron fertilizer\n" +
            "•\tSpray new leaves as they emerge\n" +
            "•\tKeep the plants mulched with a few inches of oak leaf or pine needle mulch to help maintain soil acidity\n" +
            "•\tUse a fertilizer that includes elemental sulfur\n" +
            " Pruning\n" +
            "At planting, prune only to remove any broken, dead or dying parts of branches. After the first year, prune the bushes annually in the early spring before growth starts:\n" +
            "•\tTo remove dead and diseased wood\n" +
            "•\tTo shape the bush\n" +
            "•\tTo maintain enough vigorous main stems to prevent overbearing \n" +
            "•\tTo stimulate new shoot growth \n" +
            "Fruit is produced on one-year-old wood. The largest berries are produced on the healthiest wood, so a good supply of strong, one-year-old wood is desirable.\n" +
            "•\tKeep the bush fairly open by cutting out any weak, old stems that no longer produce strong young wood.\n" +
            "•\tRemove these older stems at ground level.\n" +
            "•\tKeep four to six healthy older stems and one to two strong new shoots per mature bush. The new shoots will eventually replace the older stems.\n" +
            "•\tTake care not to prune too aggressively, as this can greatly reduce yield.\n" +
            " Harvest and storage\n" +
            "Berries will turn from green to blue and are ready for harvest when they're completely blue and are springy when gently squeezed. Taste a few berries you believe to be ripe to get a good idea of how ripe fruit looks and feels.\n" +
            "Fruit will ripen on one bush over a period of a couple weeks. Harvest ripe fruit regularly.\n" +
            "Gently pull berries off the plant. Some stems might remain attached to the berries.\n" +
            "Place berries in a firm container in the refrigerator shortly after picking. Avoid layering berries more than a couple inches deep to prevent the lower berries from being damaged.\n" +
            "Do not wash berries until ready to eat. This will prevent them from molding in storage. Blueberries last longer in the refrigerator than many other berries. Generally, plan to use the berries within a week or so.\n" +
            "Blueberries also freeze well.\n" +
            "•\tFor best freezing, wash berries and allow to dry.\n" +
            "•\tLay dry berries in one layer on a baking sheet and place in freezer.\n" +
            "•\tOnce the berries are frozen firm, place in an airtight container or freezer bag and return to freezer.\n";
    String manage = "HARVESTING\n" +
            "\n" +
            "    Blueberries will be ready for picking in late July to mid August.\n" +
            "    Don’t rush to pick the berries as soon as they turn blue. Wait a couple days. When they are ready, they should fall off right into your hand.\n" +
            "    If you plant 2-year-old blueberry bushes, they should start to bear within a year or two. (Pick off any flowers that form the first year or two after planting, to allow the bush to become established.) Be aware that full production is reached after about 6 years.\n" +
            "    Blueberries are one of the easiest fruits to freeze. Learn how to properly freeze blueberries so you can have them all winter long.\n" +
            "\n" +
            "Blueberries\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_berry);

        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        pests = findViewById(R.id.expand_text_view4);
        management = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(berryplanting);
        e.setText(Fertilizer);
        diseases.setText(care);
        pests.setText(pest);
        management.setText(manage);
    }
}
