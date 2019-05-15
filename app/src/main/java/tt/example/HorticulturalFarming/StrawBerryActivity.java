package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class StrawBerryActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e, diseases, pests ,management;

    String strawPlanting = "PLANTING AND CARING FOR YOUNG PLANTS\n" +
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
      String care = "BEST PRACTICES FOR AVOIDING STRAWBERRY DISEASES AND PESTS\n" +
              "These practices seek to produce the healthiest plants by avoiding situations that favor the development of diseases or contribute to insect infestations.\n" +
              "WATERING\n" +
              "When watering plants, avoid getting the leaf surfaces wet by using a drip system or a soaker hose. If a sprinkler system is used, water plants in the mornings on a sunny day to allow leaf surfaces to dry quickly, to reduce fungal diseases.\n" +
              "SITE ROTATION\n" +
              "If possible, rotate strawberries to different areas of the garden every 3 to 4 years. Land that has been planted in strawberries for 4 years or more can build up a population of root-rotting diseases. Move the patch to avoid this.\n" +
              "WINTER INJURY\n" +
              "Straw mulch reduces winter injury and plants that have less winter injury have reduced disease.\n" +
              "Straw mulch is equally important in the spring and summer as it reduces fruit and flower diseases by covering the soil and reducing spore movement carried by raindrop splash.\n" +
              "When removing straw in spring, leave 1/2 to 1\" of straw between rows to keep fruit off the soil and reduce weeds.\n" +
              " INSECTS AND OTHER CREATURES\n" +
              "There are many different insect pests of strawberries. Some of these pests will be present every year, and some you will never see, depending on the history of your garden and surrounding landscape.\n" +
              "Most insect damage can be reduced by following the best practices mentioned above and:\n" +
              "•\tRemove leaf litter to reduce the number of insect overwintering sites.\n" +
              "•\tRemove weeds and keep lawns mowed as they can provide habitat for adults to feed and overwinter.\n" +
              "•\tRenovate the patch to remove potential habitat and reduce insect numbers.\n" +
              "•\tFrequently harvest crops to ensure ripe fruits are not in gardens for too long.\n" +
              "•\tRemove and destroy any old fruit that remains on stems or that has fallen to the ground.\n" +
              "The most common insect pests of strawberries in Kenya are tarnished plant bugs, strawberry bud weevils, slugs and flower thrips.\n" +
              "•\tThe tarnished plant bug feeds on developing flowers, causing deformed berries.\n" +
              "•\tThe strawberry clipper clips off flower buds in spring, thus reducing harvest.\n" +
              "•\tSlugs feed on ripe fruit, leaving small, deep holes in the fruit and irregular holes in foliage.\n" +
              "•\tFeeding by thrips causes berries to appear bronzed and seedy.\n" +
              "•\tSpotted wing drosophila is a particular problem of ever-bearing strawberries and other soft fruits in Kenya.\n" +
              "Rodents and birds may cause more trouble in home strawberry plantings than insects. Large holes in ripe fruit are a good sign that these creatures are enjoying your strawberries. Pick fruit as soon as it is ripe to prevent damage.\n";
      String pest = "DISEASES OF STRAWBERRIES\n" +
              "Strawberries are susceptible to fruit rots and leaf diseases. Fungi causing fruit rots infect the flowers and fruit as early as bloom time. Leaf diseases often have little effect on plant growth.\n" +
              "To keep fungi to a minimum:\n" +
              "•\tPlant in full sun. \n" +
              "•\tKeep plants from being crowded. \n" +
              "•\tWater early in the day to reduce the amount of water on the flowers and fruit. \n" +
              "•\tUse straw mulch under the plants. \n" +
              " Gray mold, leaf blight, leaf scorch and leaf spot\n" +
              "Identify and manage fungal diseases\n" +
              "Gray mold, leaf blight, leaf scorch and leaf spot are caused by different fungi, but are managed mostly in the same way. \n" +
              "Choose sites with full sun, good soil drainage and air circulation. Fungi require long periods of continuous wetness to infect plants. Any practice that promotes quick drying of leaves and fruit will reduce disease.\n" +
              "•\tRemove weeds to improve air circulation around plants.\n" +
              "•\tPlant in rows or narrow beds, no wider than 12-18 inches, to promote good air movement in and around plants. Patches grow with time as new runners are produced. Use renovation to maintain narrow beds.\n" +
              "•\tRenovate strawberry beds every year after harvest. \n" +
              "•\tFollowing renovation, rake and remove old leaves.\n" +
              "•\tIrrigate with drip irrigation or a soaker hose. If overhead sprinkling is your only option, water early in the morning on a sunny day so leaves dry quickly after irrigation.\n" +
              "•\tApply nitrogen fertilizers after renovation. Avoid early spring applications of nitrogen which encourage overly lush growth that reduces airflow and promotes a moist microclimate optimal for the growth of fungal diseases.\n" +
              "•\tFungicides are either not necessary or not available to home growers to control these diseases.\n" +
              "•\tCultural control practices usually reduce disease to a manageable level.\n" +
              "________________________________________\n" +
              "GRAY MOLD\n" +
              "Gray mold (Botrytis cinerea) is the most common fruit rot disease of strawberries in kenya. The disease is most prevalent when there is prolonged cool, wet weather during flowering.\n" +
              " \n" +
              "•\tThe gray mold fungus overwinters on dead strawberry leaves, infected straw, mummified fruit and weeds.\n" +
              "•\tInfection is most severe in rainy or humid conditions where flowers remain wet for more than 12 hours.\n" +
              "•\tCan begin anywhere on the fruit but is most common on the stem end, where the fruit comes in contact with infected flower parts or anywhere the fruit is touched by another infected berry.\n" +
              "•\tMore commonly, infections grow in the young fruit and remain dormant until the fruit begins to ripen.\n" +
              "•\tThe fungus rots the fruit and produces powdery, gray spores on the surface of the fruit.\n" +
              "•\tRot spreads to adjoining berries wherever the healthy and rotten fruit touch.\n" +
              "•\tFruit remain attached to the plant but dry down to a shriveled mummified berry.\n" +
              "•\tNew spores are produced on mummy berries during wet weather.\n" +
              "•\tThe gray mold will colonize young leaves and remain dormant within them.\n" +
              "•\tWhen leaves die naturally, they can become an important source of gray mold spores in the Infections may attack blossoms, which then do not develop into fruit.\n" +
              "•\tstrawberry patch.\n" +
              "•\tPlants damaged by winter injury may develop Botrytis crown rot, where leaf and flower stems rot and turn brown at the point where they attach to the crown of the plant.\n" +
              " \n" +
              "Gray mold on strawberries\n" +
              "Management\n" +
              "•\tHoneoye is the only variety recommended in Kenya that has shown partial resistance to gray mold.\n" +
              "•\tIn patches with a history of gray mold, remove and discard all straw in early spring approximately when lilac flower buds appear.\n" +
              "•\tPlace fresh straw or other organic mulch between beds to reduce rain splash and weeds and improve air movement around berries.\n" +
              "•\tAvoid wounding plants. Wounds facilitate entry of the disease.\n" +
              "•\tSee more on how to manage this disease above.\n" +
              "Harvest recommendations\n" +
              "•\tHarvest frequently and remove infected fruit from the field throughout the harvest season.\n" +
              "•\tTake care to keep diseased fruit separate from healthy fruit as gray mold can spread rapidly even after harvest.\n" +
              "•\tHandle berries with care and refrigerate soon after picking.\n" +
              "FUNGICIDES\n" +
              "Fungicides may be needed to protect fruit from gray mold fruit rot in years where rainy wet weather persists while plants are in bloom. In this case, fungicides should be applied during blossom to prevent fruit rot.\n" +
              "Read and follow all label instructions. If the season is one characterized by prolonged periods of wet or humid weather, continue spraying at the interval described on the fungicide label until petal drop.\n" +
              "If possible watch the weather and spray before rain is predicted. Fungicides with copper or Captan as active ingredients will reduce gray mold fruit rot in strawberry when applied properly. Fungicide sprays applied to green fruit and during fruit harvest do little to reduce disease and are not recommended.\n" +
              "CAUTION: \n " +
              "Mention of a pesticide or use of a pesticide label is for educational purposes only. Always follow the pesticide label directions attached to the pesticide container you are using. Remember, the label is the law.\n" +
              "Be sure that the plant you wish to treat is listed on the label of the pesticide you intend to use. Also be sure to observe the number of days between pesticide application and when you can harvest your crop.\n" +
              "________________________________________\n" +
              "LEAF BLIGHT\n" +
              "•\tThe leaf blight fungus (Phomopsis obscurans) infects all green parts of the plant and rarely causes a soft rot on ripening and ripe fruit.\n" +
              "•\tLeaves are most severely infected in shaded patches that have heavy dew or in years with frequent rain. \n" +
              "•\tThis fungus requires long periods of continuous wetness to infect plants. \n" +
              "•\tAny practice that promotes quick drying of leaves and fruit will reduce disease.\n" +
              "Symptoms\n" +
              " Mature leaf blight on strawberry\n" +
              "•\tSolid reddish-purple spots on leaves.\n" +
              "•\tSpots develop tan center as they grow.\n" +
              "•\tSpots enlarge to V-shaped lesions with dry brown centers and reddish-purple borders.\n" +
              "•\tSevere infection can turn whole leaf brown.\n" +
              "•\tBlack specks produce fungus spores.\n" +
              "•\tReddish-purple spots can appear on stems.\n" +
              "•\tMushy pink spots on fruit become dark brown and dry.\n" +
              "________________________________________\n" +
              " \n" +
              "LEAF SCORCH\n" +
              "•\tIn addition to leaves, leaf scorch (Diplocarpon earlianum) can infect petioles, runners, fruit stalks and berry caps.\n" +
              "•\tIf unchecked, plants can be significantly weakened reducing the growth of all plant parts.\n" +
              "•\tSeverely infected plants are weakened and can die from other stresses such as drought or extreme temperatures.\n" +
              " \n" +
              "\n" +
              "Leaf scorch on strawberry leaves\n" +
              "•\tThe leaf scorch fungus overwinters on infected leaves and on leaf debris within the patch.\n" +
              "•\tThe fungus can remain dormant for long periods in dry leaves, but it produces spores quickly in the presence of moisture.\n" +
              "•\tSpores are spread by wind or by splashing water. Spores will germinate and new leaf spots will form if leaves remain wet for 12 hours or longer.\n" +
              "•\tOnce mature, leaf spots will produce spores throughout the growing season in response to wet conditions. These spores are spread mainly by splashing water.\n" +
              "•\tHot dry weather halts disease progress.\n" +
              "•\tSevere infection in summer and fall can mean fewer strawberries the following year.\n" +
              "•\tInfections on fruit and flower stalks can girdle the stalk and kill the fruit and flower.\n" +
              "Symptoms\n" +
              "•\tDark purple, angular to round spots appear on the upper surface of the leaf.\n" +
              "•\tAs the disease progresses the tissues around these spots turn reddish or purple.\n" +
              "•\tIn severe cases, the infected area dries to a tan color and the leaf curls upward looking scorched.\n" +
              "•\tLesions remain reddish purple and do not turn tan or gray in the center.\n" +
              "________________________________________\n" +
              "Leaf spot\n" +
              "•\tLeaf spot (Mycosphaerella fragariae) was once one of the most common and destructive fungal diseases of strawberry.\n" +
              "•\tSevere infection on susceptible varieties can result in death of leaflets and defoliation of plants.\n" +
              "•\tMany new strawberry varieties have resistance to leaf spot and the disease is no longer as common or as problematic as it once was. \n" +
              "•\tThe leaf spot fungus can infect leaves, petioles, runners, fruit stalks, berry caps and fruit.\n" +
              " \n" +
              "\n" +
              "Leaf spot on strawberry leaves\n" +
              "•\tThe fungus overwinters on infected living leaves and in leaf debris.\n" +
              "•\tSpores are produced in the spring and spread to healthy tissue by splashing rain or irrigation.\n" +
              "•\tCool temperatures (68 to 77 F) and long periods of leaf wetness (more than 12 hours) are required for new infections to develop.\n" +
              "•\tConsecutive wet days with temperatures between 50 and 86 F favor disease development.\n" +
              "•\tThe disease will progress as long as temperature and moisture are in acceptable ranges.\n" +
              "•\tMany strawberries commonly grown in Kenya can tolerate some leaf spot infection.\n" +
              "•\tAlthough leaf spots may be observed on foliage, the damage is typically not severe enough to reduce yield.\n" +
              "SYMPTOMS\n" +
              "•\tSmall purple spots on leaves or stems.\n" +
              "•\tThe centers of leaf spots turn gray and then white with age.\n" +
              "•\tAs the disease progresses multiple leaf spots merge together creating a reddish purple area with multiple round white centers.\n" +
              "•\tIn severe cases, the leaves turn brown and die.\n" +
              "•\tFruit infections are not common, but appear as small, sunken, leathery, black spots on unripe and ripe fruit.\n" +
              "•\tSeeds within the infected area of the fruit turn black.\n" +
              " Black root rot\n" +
              "Strawberry black root rot, or BRR, is the most common root disease in Kenya.\n" +
              "This disease is a complex problem involving several different pathogens (Rhizoctonia fragariae, Pythium spp., Fusarium spp.) along with a variety of plant stresses such as winter injury. It is common in older strawberry patches or patches stressed by poor growing conditions like soil compaction or poor drainage.\n" +
              "Plants infected with BRR decline overtime, producing significantly lower yields than uninfected plants.\n" +
              "•\tDisease develops when plants are:\n" +
              "o\tStressed by drought, water-logged soils, winter injury, poor nutrition, and root feeding by lesion nematodes (Pratylenchus penetrans) or insects; and\n" +
              "o\tOne or more of the black root rot fungi, Pythium spp., Rhizoctonia spp., and Fusarium spp., are found in soils. \n" +
              "•\tRoot tips and young feeder roots may be completely rotten and fall off.\n" +
              "•\tInfection in older roots is limited to the outer tissues of the root, leaving a white core that is unaffected.\n" +
              " \n" +
              "\n" +
              "Strawberry plant with black root rot\n" +
              "Symptoms\n" +
              "The first symptoms of BRR are often missed. Infected plants have poor growth and produce fewer and smaller fruit. As the disease becomes more severe, plants are clearly stunted.\n" +
              "•\tPlants may wilt and the edges of leaves turn brown or have a 'scorched' appearance.\n" +
              "•\tPlants continue to decline and often die after the high stress of fruit production.\n" +
              "•\tIn larger patches, disease often starts in low lying areas or areas with poor drainage. Each year the area of infected plants expands.\n" +
              "•\tPlants with BRR are often described as 'rat tail' because most of the finer feeder roots are rotted away leaving only the thick anchor roots.\n" +
              "•\tThe remaining young roots have random gray to reddish brown sunken blotches. These lesions can expand to cover large areas of the root.\n" +
              "•\tThe infected roots are soft and mushy. When touched, the outer layer often falls away, leaving only a thin strand from the core of the root.\n" +
              "Plants displaying the above symptoms should be carefully dug up and washed, keeping intact as much of the root system as possible. A healthy plant will have young roots that are creamy white with multiple fine root hairs and older roots will have a dark brown to black woody outside layer but a white interior.\n" +
              "MANAGEMENT\n" +
              "Prevention of black root rot is based on good site selection and proper plant care.\n" +
              "•\tThere are no strawberry varieties that are resistant to black root rot.\n" +
              "•\tChoose a variety that is hardy in Kenya to reduce winter injury and stress on the plant.\n" +
              "•\tPurchase new plants from a reputable supplier. Roots of young strawberry plants should be white and fleshy.\n" +
              "•\tFor new patches, choose a location where strawberries have not been present for the past 2-4 years.\n" +
              "•\tChoose a location with good drainage or improve drainage before planting through adding organic matter to soil and redirecting water away from the area.\n" +
              "•\tStrawberries can also be planted on raised beds where drainage creates a soil environment less favorable to some root rotting fungi.\n" +
              "•\tAdd organic matter like high quality compost, peat or straw to the soil prior to planting. This will improve drainage and encourage growth of beneficial microorganisms in the soil.\n" +
              "•\tUse a soil test to determine optimum fertilizer applications for the site.\n" +
              "•\tRenovate patches of June-bearing strawberries each year after harvest to maintain a healthy growing patch.\n" +
              "•\tTo avoid winter injury, apply two to three inches of straw in the fall after several frost events below 20 F and above 30 F.\n" +
              "•\tIn existing patches with black root rot, consider starting with new plants in a new location. Do not relocate old plants to the new location as the BRR pathogens will be carried on the roots of infected plants.\n" +
              "•\tThere are no fungicides registered for use by home gardeners that are effective in controlling BRR.\n" +
              " Leather rot\n" +
              "Leather rot occurs sporadically in Kenya. The disease infects flowers and fruit at all stages. Infected strawberries have a distinctively unpleasant odor and a strong, bitter taste. Infection of a few ripe berries that are processed into jam can ruin the whole jar with this off-taste.\n" +
              "The leather rot fungus (Phytophthora cactorum) is a water mold (oomycete). Water molds thrive in wet conditions and produce three types of spores.\n" +
              "•\tOospores are tough resting spores that form in mummified berries and can survive many years in soil. These germinate when soils are saturated to produce sporangia and zoospores.\n" +
              "•\tZoospores are swimming spores that move through a film of water on the plant or soil to reach susceptible fruit and flowers. Zoospores only need two hours of moisture on the plant surface to start an infection.\n" +
              "•\tOnce infected, sporangia are produced on fruit and are splashed by rain or irrigation to infect other fruit.\n" +
              "•\tThe leather rot fungus thrives in areas where water stands for awhile after a rain event.\n" +
              " \n" +
              "Symptoms\n" +
              "•\tInfections on green fruit are typically tan to brown areas or green outlined by a brown margin.\n" +
              "•\tAs the disease progresses these unripe berries become completely brown and have a rough leathery texture.\n" +
              "•\tInfection of ripe fruit may cause little to no color change, or the infected area may become pale, purple or brown.\n" +
              "•\tRot on ripe fruit becomes dry and leathery over time.\n" +
              "•\tBoth ripe and unripe infected fruit eventually dry down into fruit mummies.\n" +
              "MANAGEMENT\n" +
              "•\tChoose a location with good drainage or improve drainage before planting through adding organic matter to soil and redirecting water away from the area. Strawberries can also be planted on raised beds to improve drainage.\n" +
              "•\tUse straw mulch to keep berries from contacting soil and any puddled water. Mulch will also reduce splashing of spores from the soil up onto fruit and flowers.\n" +
              "•\tWater through drip irrigation or a soaker hose. If overhead sprinkling is your only option, water early in the morning on a sunny day so leaves dry quickly after irrigation.\n" +
              "•\tPick fruit frequently and remove over ripe and diseased berries from the field.\n" +
              "•\tThere are no fungicides available to home gardeners that are effective in preventing leather rot.\n" +
              " Anthracnose fruit rot\n" +
              "Anthracnose fruit rot is a fungal disease that causes fruit rot and flower blight in warm wet weather. \n" +
              "The anthracnose fruit rot fungus, Colletotrichum acutatum (rarely C. fragariae and C. gloeosporioides), is usually introduced to a site on infected planting material.\n" +
              "•\tThe fungus overwinters on infected plants, plant debris and mummified fruit.\n" +
              "•\tSpores are produced in a sticky mass on any infected plant part during warm (68° F) wet weather.\n" +
              "•\tSpores are spread by water via splashing or wind-driven rain, and by people or equipment moving through the field.\n" +
              "•\tThey are not airborne so they do not spread over long distances in the wind.\n" +
              "•\tThe fungus can attack all plant parts, but fully open flowers and ripening fruit are most susceptible to the disease.\n" +
              "•\tUnder warm, wet conditions, the fungus will produce spores on infected fruit which spread to neighboring plants causing new infections.\n" +
              " Progression of anthracnose fruit rot\n" +
              "Symptoms\n" +
              "•\tPink and red fruit develop light-brown lesions that turn darker brown and sunken.\n" +
              "•\tRotted areas of the fruit remain firm and dry.\n" +
              "•\tPale orange to salmon colored spore masses cover the lesion during warm humid conditions.\n" +
              "•\tUltimately the fruit dries down to a hard, black, shriveled mummy.\n" +
              "•\tBlossoms can be infected at any stage of development.\n" +
              "•\tInfected blossoms quickly die, dry out and turn brown.\n" +
              "•\tThe brown discoloration often extends down the flower stalk.\n" +
              "Management\n" +
              "•\tThere are no varieties resistant to anthracnose fruit rot that are hardy in Kenya.\n" +
              "•\tPurchase plants from a reputable supplier. Inspect all plants for symptoms of disease. Plant only healthy symptom free plants.\n" +
              "•\tBecause spores are spread by splashing water, avoid the use of overhead irrigation and use drip irrigation or a soaker hose. If overhead irrigation cannot be avoided, water early in the morning on a sunny day to keep the time that the foliage is wet to a minimum.\n" +
              "•\tMaintain one to two inches of straw mulch between the rows or walking alleys to reduce splash dispersal of disease spores.\n" +
              "•\tRemove infected berries from the planting during harvest to reduce spread of the disease to developing fruit.\n" +
              "Fungicides\n" +
              "•\tIf anthracnose has been a problem in the past and weather is warm and wet during flowering and fruit production, fungicides can be applied to reduce infection.\n" +
              "•\tAnthracnose is not easily controlled by fungicides and gardeners should expect a reduction in disease but not complete protection.\n" +
              "•\tFungicides with copper, Captan or Bacillus subtilis listed as the active ingredient provide some protection from anthracnose fruit rot.\n" +
              "•\tAll label instructions must be read and followed when applying a pesticide\n";
String manage= "MANAGEMENT\n" +
        "•\tAlthough some varieties have been reported to show resistance to powdery mildew, these have not proven to be reliably disease-free in kenya.\n" +
        "•\tPurchase plants from a reputable supplier. Inspect all plants for symptoms of disease. Plant only healthy symptom free plants.\n" +
        "•\tRenovate strawberry beds every year after harvest. \n" +
        "•\tFollowing renovation, rake and remove old leaves.\n" +
        "\n" +
        "\n" +
        "FUNGICIDES\n" +
        "Fungicide sprays may be necessary to protect plants after summer renovation if powdery mildew has been identified in the patch before renovation. Several fungicides are available to control powdery mildew. \n" +
        "Choose products with an active ingredient of myclobutanil, sulfur, potassium bicarbonate, or horticultural oil. Apply products according to the label instructions. Repeated applications will be necessary as long as conditions favorable for disease continue.\n " +
        "Do not use sulfur on fruit intended for canning.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straw_berry);



        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        pests = findViewById(R.id.expand_text_view4);
        management = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(strawPlanting);
        e.setText(Fertilizer);
        diseases.setText(care);
        pests.setText(pest);
        management.setText(manage);
    }
}
