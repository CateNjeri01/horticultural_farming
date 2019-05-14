package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class StrawBerryActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e;

    String Planting = "PLANTING AND CARING FOR YOUNG PLANTS\n" +
            "Strawberries require sun to produce fruit. Ten or more hours of sunlight each day is ideal,but they need a minimum of six hours of direct sunlight each day.\n" +
            "Before planting, a soil test will help you find out if you need to add any nutrients to your soil.\n" +
            "It's a good idea to work some well-rotted compost into the soil before planting. Compost helps add nutrients to the soil, improves drainage and increases microbial activity, all of which will benefit the plants.\n" +
            " Buying plants\n" +
            " Dormant transplants might look dead, but will sprout quickly once planted.\n" +
            "Although most garden centers sell strawberry plants in spring, many of the best varieties for Kenya are available only from online or mail-order sources.\n" +
            "•\tNurseries generally ship dormant, bare root plants at the appropriate time for planting in your region. The plants arrive looking small and brown; they have not started growing yet.\n" +
            "•\tKeep the plants moist and cool, and plant them as soon as possible.\n" +
            "•\tYou will see fresh green growth appearing within a week or so.\n" +
            "•\tIf you buy potted plants from a garden center, look for vigorous plants without any discolored or dead leaves.\n" +
            "•\tKeep the soil in the pot moist until planting.\n" +
            " Choosing a site, plant spacing and depth\n" +
            "Site selection\n" +
            "By choosing the right site to grow strawberries, you can lower disease and insect pest pressure.\n" +
            "•\tChoose a site located away from trees and buildings that cast shade for more than a few hours each day.\n" +
            "o\tTrees will compete for water and nutrients as well as cast shade, so the strawberry bed should lay beyond the root zone of large trees. The root zone is roughly the same size as the canopy of a tree.\n" +
            "•\tStrawberries should be planted in well-drained soil that does not accumulate standing water following a heavy rainstorm.\n" +
            "•\tPlanting on higher ground minimizes frost damage, while increasing air circulation around the strawberry plants.\n" +
            "•\tGood air circulation allows the berries to dry out faster, reducing the incidence of some diseases.\n" +
            "Plant spacing\n" +
            "If planting a large number of strawberries plant in rows. This makes it easier to control weeds, runners and pests.\n" +
            "There are many methods of row planting that work well for strawberries, but by far the most common method is the matted row system: \n" +
            "•\tSpace plants 18 to 24 inches apart\n" +
            "•\tSpace rows 3 to 4 feet apart \n" +
            "June-bearing plants especially will send out many runners throughout the season and fill in the space between plants, so it's important to go with the recommended spacing, otherwise your plants will quickly become overcrowded.\n" +
            "Strawberries in the landscape\n" +
            " \n" +
            "Strawberries don't need to be planted in rows when incorporated into the home landscape.\n" +
            "Day neutral types work well at the front of a perennial border or along a sidewalk or driveway. Because they produce fewer runners than June-bearing types, maintenance is minimal.\n" +
            "Strawberry plants may also be grown as a ground cover.\n" +
            "•\tTo grow a strawberry ground cover, space the mother plants in a grid, either 1 x 1 foot or 2 x 2 feet.\n" +
            "•\tThe planting will require regular weeding, especially in the first year, but maintenance should be minimal after the plants are established.\n" +
            "•\tStrawberries grown as a ground cover may not produce quite as much fruit as those grown in rows, but the plants will add a beautiful touch to your landscape.\n" +
            "Planting depth\n" +
            "Plant dormant strawberry transplants in spring as soon as the soil is warm enough to easily get a trowel into it. Potted plants should be planted soon after purchase, after risk of frost is past.\n" +
            "It is important to plant dormant transplants at the right depth.\n" +
            "•\tIf the crowns are planted too shallow they lose water and can die.\n" +
            "•\tIf the crowns are planted too deeply the leaves may not be able to emerge from the soil.\n" +
            "•\tIf planting a growing plant bought from a nursery or garden center, simply plant at the same depth the plant was in the container.\n" +
            " \n" +
            "Dormant transplants have no growth, but sprout quickly when exposed to light and warm temperatures. Plant center of the crown (red line) at the soil line with the roots fully buried and growth visible.\n" +
            " \n" +
            "Transplants can be planted into a trench as seen here, or into holes dug for each plant.\n" +
            " \n" +
            "This transplant has been planted at the proper depth. The roots are fully below the soil line and the growth points are visible above the soil.\n" +
            " Watering\n" +
            "•\tAfter planting, firm the soil around the plant and water thoroughly.\n" +
            "•\tStrawberries perform best when they are given the equivalent of 1 inch of rainwater per week.\n" +
            "•\tUse a rain gauge to monitor rainfall and water with a soaker hose or drip system if needed.\n" +
            "•\tOne good soaking each week should be enough in most soil types.\n" +
            "•\tAlways water early in the day so that leaves have a chance to dry before nightfall. This will help prevent leaf diseases.\n";
    String Fertilizer = "HOW TO KEEP STRAWBERRIES HEALTHY AND PRODUCTIVE\n" +
            " Pinching flowers and training runners\n" +
            "Spring of planting year\n" +
            "After planting, pinch off any flower buds that appear for the first few weeks. This allows the plant to produce leaves and roots so when the flowers are pollinated and begin to produce fruit there is enough energy in the plant to develop large, juicy strawberries.\n" +
            "Summer\n" +
            " \n" +
            "\n" +
            "Place or remove runners throughout the season, or they will quickly take over your garden.\n" +
            "As runners begin to appear, place them where you want the plants to fill in and gently press the end of the runner into the soil. This will encourage the daughter plant to root where you want it to. If the plants are running too much, simply cut them off with a scissors or pruning shears.\n" +
            "After harvest\n" +
            "•\tContinue to water plants. \n" +
            "•\tThin out plants, leaving remaining plants about 6 to 8 inches apart. \n" +
            "•\tRemove older, woody plants and leave the younger plants for next year. \n" +
            "•\tFertilize with compost around the plants to keep them growing through the season.\n" +
            "Day neutral plants flower and fruit throughout the summer. If plants are not growing well, applying compost along the side of the plants will give them a boost of nitrogen. Other organic fertilizers such as blood meal can be used too.\n" +
            "Fall\n" +
            "June-bearing strawberry plants continue to grow and produce runners until the frost kills the leaves. Keep removing runner plants if there is a lot of crowding.\n" +
            "After the plants have entered dormancy due to cold temperatures, and the temperatures are staying below 40°F, straw mulch should be applied about 4 to 6 inches over the top of the plants. This mulch will protect the plants from extreme winter cold so they will emerge again next spring.\n" +
            "Most day neutral varieties are not quite hardy enough to over-winter in Kenya, but it may be worth a try. Cover these with straw just as you would June-bearing plants.\n" +
            "Winter\n" +
            " \n" +
            "Winter is the time strawberry plants will rest, so there isn't much for you to do. A good snow cover on top of the straw mulch will help insulate the plants from bitter cold temperatures, so enjoy watching that snow pile up!\n" +
            "After raking straw mulch off in the spring, keep the straw mulch between and under plants to help retain soil moisture, prevent weeds, and give the berries a nice clean surface on which to ripen.\n" +
            "Spring of the second year and beyond\n" +
            "Straw mulch applied to protect plants from winter cold should be removed when the snow and ice melts completely.\n" +
            "This winter mulch makes a great summer mulch too. Rake the straw off the plants and leave it between them to help conserve water and keep weeds down as the temperatures begin to rise.\n" +
            " Fertilizing and weeding\n" +
            "Fertilizing\n" +
            "•\tIf June-bearing plants do not produce many runners by mid-July this usually means the plants need more nitrogen.\n" +
            "•\tYou can apply compost or an organic fertilizer, such as blood meal, around the plants to increase nitrogen for plant growth.\n" +
            "•\tBefore plants begin to grow in the spring of the second year, you may need to add more compost or organic nitrogen to encourage plant growth and fruit development.\n" +
            "Weeding\n" +
            "•\tBecause strawberries are poor competitors, keep all weeds out of the strawberry bed.\n" +
            "•\tHand-weeding is recommended for home gardeners.\n" +
            "•\tCareful cultivation with a hoe is effective for managing weeds in strawberry plantings, but be careful not to dig too deeply, as you could damage the plant's shallow root system.\n" +
            " Harvesting and protecting plants in winter\n" +
            "Harvest and storage\n" +
            " \n" +
            "Berries should be red before picking.\n" +
            "Strawberries ripen from the tip towards the leafy stem end. Some varieties have \"white shoulders\" because the leaves cover the fruit and do not allow for the red color to develop. But most will be completely red when ripe. They might not all be large, but a deep red, homegrown strawberry will always have a big flavor.\n" +
            "Look through the plants daily once you see the red color developing and harvest ripe fruit.\n" +
            "Strawberries do not store for very long in the refrigerator. For best results, pick the fruit when it is dry and place fruit in refrigerator immediately. This will help extend the storage life of the berries.\n" +
            "Winter protection\n" +
            "The crown of a strawberry plant may be killed at 15°F, therefore winter protection is essential.\n" +
            "•\tAfter 2 or 3 frosts have hardened off the plants, cover them with 4 to 6 inches of weed-free straw \n" +
            "•\tStraw is especially valuable in late fall or early spring when bitter cold temperatures might occur without snow cover\n" +
            "•\tSnow is an excellent insulator and will be sufficient protection where snow cover is reliable \n" +
            "Rake straw away in spring when growth begins, but leave some at the base of the plants to act as the summer mulch.\n" +
            "If frost is predicted after flowering begins, either re-cover the plants with straw or protect them with spun-bonded polyester fabric row covers.\n" +
            " Renovation\n" +
            "•\tRenovation helps control diseases and insect pests by disrupting their life cycles.\n" +
            "•\tRegardless of the size and shape of your strawberry patch it is best to mow or cut the foliage back before August 1.\n" +
            "•\tA new canopy will develop by mid-August.\n" +
            "First, mow plants and remove clippings.\n" +
            "This helps to control diseases by removing older leaves that are infected by leaf spot or fruit rot pathogens. This helps to control insects by removing their food source and potential breeding sites.\n" +
            "Thin rows\n" +
            "If plants are grown in rows, renovation is a good time to thin widening rows back to their original width. This will improve airflow through the patch and reduce the time that the leaf surfaces are wet, which can reduce disease severity.\n" +
            "To have a good crop in the following year requires healthy thriving plants from post-renovation to dormancy in the fall. Pay attention to the health of your plants in this time period.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straw_berry);



        expandableTextView = findViewById(R.id.expand_text_view);
        e = findViewById(R.id.expand_text_view1);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
    }
}
