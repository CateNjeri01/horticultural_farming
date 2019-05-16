package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class PineappleActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "PLANTING PINEAPPLES\n" +
            "Buying a Pineapple Plant \n" +
            " When growing pineapples, remember that their roots do not like to stay wet. In fact they like similar soil conditions as cacti: well drained and on the dry side, but with an acidic pH of 4.5-6.5. To determine when to water, the soil should be dry and you should check inside the junctions where the leaves meet the plant; if there is water in those little pockets then skip watering, if not then water over the top of the plant. Fertilize monthly with a balanced liquid fertilizer (5-5-5, 10-10-10, etc.) mixed according to the manufacturer’s directions, and showered over the plant just like a normal watering.\n" +
            "Starting Pineapples From Seed \n" +
            "\n" +
            "To start a pineapple from seed, you will first have to obtain the seed. Occasionally there will be seeds in a store-bought pineapple. Buy a yellow-ripe fruit. As you cut the fruit, look for the small black seeds about three-eighths of an inch in from the outside edge. Rinse the seeds. Germinate the seeds by lightly wrapping them in a wet paper towel and placing it in a plastic zipper bag. Keep the bag in a constantly warm (65-75 degrees) place. It takes about six months for the seeds to sprout, at which time the baby plants can be carefully planted in temporary growing containers (1-2 quart size) where they can be babied until they are large enough to plant in the garden or a permanent larger pot.\n" +
            "Starting Pineapple From a Cutting \n" +
            "\n" +
            "Starting a pineapple from a green top is possibly the cheapest and easiest way to begin. Buy a well ripened fruit with the healthiest looking top you can find. Some rough leaves are okay, but try to find the best one of the lot. Simply remove the top by grasping the fruit in one hand and the top in the other and twisting it off in one steady motion (like wringing out a towel). Remove the lower half dozen leaves or so from the bottom of the green shoot, then set it aside and allow it to “cure,” or dry out, for about a week. Plant the cured pineapple top in a 8 or 10” pot filled with a coarse potting mix, and fertilize it with a balanced liquid fertilizer (shower the liquid right over the top).\n" +
            "How to Grow a Pineapple Plant Outdoors \n" +
            "\n" +
            "Pineapple plants require a bit of space. If grown in the ground, allow five feet between plants. In containers, whether inside or out, three to five feet will be good. They also grow best in lots of sun (at least 6 hours). ";
    String Fertilizer = "TAKING CARE OF PINEAPPLES PLANTS \n" +
            "Soil\n" +
            "Pineapple plant can grow in any type of soil, provided that it is well-drained and rich in organic nutrients. For early and good harvest, plant it in sandy loam soil with good drainage. The pH of the soil should be between 4.5 - 6.5. In case of soil or potting mixture with higher pH value, you can mix sulfur (appropriate amount) in order to achieve the desired acidity. Supplement the soil with farmyard compost or organic fertilizers.\n" +
            "Container\n" +
            "If you are growing pineapple plants in pots or containers, you can choose a small one (about 8 - 12 inch diameter) as pineapple have a shallow root system. Heavy pots like ceramic ones are the best option, as the foliage may cause leaning of the plants in lighter containers.\n" +
            "Light\n" +
            "Native to the tropical regions, pineapple plants grow best in optimum light conditions. In order to ensure that the plants receive maximum sunlight, you can plant them in the sunny area of the garden or south direction of the house. They require sunlight exposure for at least for 6 hours a day for better growth.\n" +
            "Temperature\n" +
            "Pineapple plants grow well in tropical and subtropical climatic condition. The favorable temperature range is between 60 - 75 degrees F. For the tropical climatic condition, the plants can be left outdoors throughout the year. Otherwise, protect the plants from frost.\n" +
            "Watering\n" +
            "Once pineapple plants are well-established, irrigate them once in a week. Over watering should be strictly avoided, otherwise it can lead to root rotting problem. Along with watering the planting soil, mist the leaves occasionally. Doing so helps in maintaining adequate humidity for the plants.\n" +
            "Winter Care\n" +
            "Protecting pineapple plants from extreme low temperature and frosting is imperative to avoid unwanted damage. So, if your area is subjected to extreme cold in winter, ensure that you make arrangements for protection. Those planted outside can be covered with plastic sheets, while the potted ones should be brought inside.\n" +
            "Fertilizers\n" +
            "Supplement the soil with farmyard compost in spring and summer season, when the pineapple plants are performing at their best. You can add solid or liquid fertilizer once in a month. On the contrary, do not fertilize in fall and winter, as they remain inactive during these seasons.\n";
    String disease = "DISEASES AND PESTS" +
            "Fungi associated diseases\n" +
            "Phytophthora heart (top) rot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Plants of all ages are attacked, but three to four month old crown plantings are most susceptible.\n" +
            "    Fruiting plants or suckers on ratoon plants may be affected.\n" +
            "    The colour of the heart leaves changes to yellow or light coppery brown. Later, the heart leaves wilt (causing the leaf edges to roll under), turn brown and eventually die.\n" +
            "    Once symptoms become visible, young leaves are easily pulled from the plant, and the basal white leaf tissue at the base of the leaves becomes water-soaked and rotten with a foul smell due to the invasion of secondary organisms. The growing point of the stem becomes yellowish-brown with a dark line between healthy and diseased areas.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Chlamydospores of the two species are the primary inoculum and they can survive in the soil or in infected plant debris for several years.\n" +
            "    They germinate directly to produce hyphae that are able to infect roots and young leaf and stem tissue, or indirectly to produce sporangia.\n" +
            "    Phytophthora pathogens are soil inhabitants and require water for spore production and infection. As free water is required for producing sporangia and releasing motile zoospores, infection and disease development is exacerbated in soils with restricted drainage.\n" +
            "\n" +
            "Phytophthora root rot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    The symptoms above ground are similar to those caused by nematodes, mealy bug wilt and low levels of soil oxygen and are not diagnostic. Leaves change in colour from a healthy green through various shades of red and yellow.\n" +
            "    Leaf tips and margins eventually become necrotic, the root system is dead and plants can easily be pulled from the ground.\n" +
            "    Fruits from infected plants colour prematurely become small and unmarketable. If symptoms are recognized early and control measures are taken plants can recover. If roots are killed right back to the stem, they often fail to regenerate\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Losses can be severe in poorly drained fields. Plants on even relatively well-drained soils can be affected during prolonged wet weather.\n" +
            "    Losses from root rot can be serious in high rainfall areas where prolonged rains extend into the winter months.\n" +
            "    The disease can eliminate the ratoon crop.\n" +
            "    Rough leaf varieties and some low acid hybrids are more susceptible than Smooth Cayenne.\n" +
            "\n" +
            "Base (butt) rot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Symptoms are seen only on crowns, slips and suckers before or immediately after planting. A grey to black rot of the soft butt tissue develops, leaving stringy fibers and a cavity at the base of the stem. If affected material is planted, partial decay of the butt severely reduces plant growth.\n" +
            "    When butt decay is severe, plants fail to establish, wilt rapidly and leaf tissue dies. Unlike Phytophthora heart rot, the young leaves remain firmly attached to the top of the stem. Infected plants can easily be broken off at ground level.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The fungus is important in the breakdown of pineapple residues after cropping and survives as chlamydospores in soil and decaying pineapple residues.\n" +
            "    The fungus commonly infects plants through fresh wounds occurring where the planting material has been detached from the parent plant and destroys the soft tissue at the base of the stem.\n" +
            "    Material removed during showery weather and stored in heaps is particularly prone to infection. Tops (crowns) used for planting are particularly susceptible\n" +
            "    Conidia are produced under conditions of high humidity and can be dispersed by wind. Losses of planting material and plantings from diseased material can be severe at times\n" +
            "\n" +
            "Fruitlet core rot (green eye)\n" +
            "Damage symptoms\n" +
            "\n" +
            "    This is an internal fruit disease. Smooth Cayenne fruits do not usually show any external symptoms. However, fruit of the rough-leaf (Mauritius) may produce fruitlets that fail to colour – a condition often referred to as „green eye‟.\n" +
            "    Severely affected fruitlets may become brown and sunken as the fruit ripens. Internal symptoms consist of a browning of the centre of the fruitlets starting below the floral cavity and sometimes extending to the core. The browning, which remains quite firm, varies in size from a speck to complete discolouration of one or more fruitlets\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Penicillium funiculosum infects the developing fruit at some stage between initiation and open flower. Infection is favoured by cool temperatures (16–20oC) during the five weeks after flower initiation, during which time the fungus builds up in leaf hairs damaged by mites. Similar cool temperatures are required for infection from about 10–15 weeks after flower induction.\n" +
            "    Symptoms of fruit let core rot on a fruit cylinder in damaged leaf hairs. Fusarium guttiforme enters the fruit through open flowers or injury sites. The risk of disease caused by this fungus is higher when flowers are initiated and fruit mature under warm conditions.\n" +
            "\n" +
            "Fusariosis\n" +
            "Damage symptoms\n" +
            "\n" +
            "    It is sporadic and affects all parts of the pineapple plant but is most conspicuous and damaging on fruit.\n" +
            "    Fruits exhibit stem rosetting and curvature of the plant because portions of the stem are girdled or killed.\n" +
            "    Rough leaf pineapple cultivars are more susceptible than smooth-leaf varieties\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Infections of the inflorescence and fruit occur primarily via injuries caused by insects, particularly the pineapple fruit caterpillar (Thecla basilides) and by infected planting materials\n" +
            "\n" +
            "Green fruit rot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Green fruit in contact with the soil are liable to be infected.\n" +
            "    A water-soaked rot develops internally behind affected fruit lets with no external symptoms, As the disease progresses, a general, water-soaked rot of green fruit with a distinct brown margin develops in green fruit.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The pathogen lives in the soil and requires free water for spore production and fruit infection. Ratoon crop fruit lying close to or touching soil are most affected.\n" +
            "    Spores may be splashed by rain on to fruit near the ground\n" +
            "\n" +
            "Inter fruitlet corking\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Fruits affected by inter fruitlet corking often show shiny patches on the shell early in their development, where the trichomes (hairs) have been removed by mite feeding.\n" +
            "    Externally, corky tissue develops on the skin between the fruitlets, but usually only „patches‟ of eyes are affected.\n" +
            "    Fine, transverse cracks may also develop on the sepals and bracts.\n" +
            "    In moderate to severe cases, corkiness surrounding fruitlets prevents their development and one side of the fruit will be malformed.\n" +
            "\n" +
            "Leathery pocket\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Fruits do not usually show any external symptoms. Internally, the formation of corky tissue on the walls of the fruitlets makes them leathery and brown.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    See fruitlet core rot. Leathery pocket occurs sporadically. Penicillium funiculosum infects the developing fruit at some stage between initiation and open flower.\n" +
            "    Infection is favoured by cool temperatures (16–200C) during the five weeks after flower initiation, during which time the fungus builds up in leaf hairs damaged by mites.\n" +
            "    Similar cool temperatures are required for infection from about 10–15 weeks after flower induction\n" +
            "\n" +
            "Water blister\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Symptoms include water blister, which is also referred to as black rot or soft rot. This causes a soft, watery rot of the fruit flesh and makes the overlying skin glassy, water-soaked and brittle.\n" +
            "    The skin, flesh and core disintegrate and the fruit leaks through the shell. In advanced cases, this leaves a fruit shell containing only a few black fibres. This shell collapses under the slightest pressure.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Infection occurs through shell bruises and growth cracks but mainly through the broken fruit stalks.\n" +
            "    The disease is most active in warm, wet weather and is most severe from January to April, when the summer crop is harvested. (The correlation between rainfall before harvest and disease after harvest has resulted in the name „water blister‟).\n" +
            "    When fresh fruits are marketed with the crowns left on, this eliminates a major point of entry for the fungus.\n" +
            "\n" +
            "White leaf spot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    The first symptom is a small, brown spot on the leaf, usually where the leaf margin has been rubbed by another leaf during strong winds.\n" +
            "    These spots lengthen rapidly during wet weather. During prolonged wet periods, spots may reach more than 20 cm in length and spread to the leaf tip.\n" +
            "    Fine weather rapidly dries the affected area leaving cream coloured or almost white, papery spots; hence the name „white leaf spot‟. The margins of the spot often remain brown.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    Chalara paradoxa is common in pineapple plantations. The fungus will only invade wounds and is most active in warm, wet weather.\n" +
            "\n" +
            "Fruit rot by yeast and candida species\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Yeasts ferment sugar solution, producing alcohol and releasing carbon dioxide. The first symptom is a bubbling exudation of gas and juice through the crack or injury where infection occurred.\n" +
            "    The shell then turns brown and leathery and, as the juice escapes, the fruit becomes spongy.\n" +
            "    Internally, the decaying flesh turns bright yellow and develops large gas cavities. Finally, all that remains of the fruit is the shell and spongy tissue\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    In spring, rapid changes in fruit growth, resulting from the shift from cold and dry to warm and wet weather, can result in the pineapple skin cracking between fruit lets.\n" +
            "    Fruit affected by even minor frost damage are prone to cracking as they ripen in spring. Yeasts immediately invade the juice weeping from those wounds, and these fruits are severely damaged or destroyed as they ripen. The disease may occur before or after harvest\n" +
            "\n" +
            "Nematodes associated diseases\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Root-knot nematodes produce distinct terminal swellings on the roots, stopping further root development. The root lesion nematode invades the outer root tissues, causing black areas (lesions) of dead or injured plant cells on the root surface.\n" +
            "    These lesions can completely encircle the root. Reniform nematodes reduce the number of lateral and fine feeder roots; the remainder elongate normally so that plants retain good soil anchorage. Root-knot nematodes cause stunting, yellowing and dieback of plants.\n" +
            "\n" +
            "Bacteria and phytoplasmas associated diseases\n" +
            "Marbling\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Infected fruits do not show any external symptoms. Internally, the flesh is red-brown and granular and has a woody consistency.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The disease occurs when flowers are initiated and when fruit mature under warm, wet conditions.\n" +
            "    The bacteria enter through the open flower and natural growth cracks on the fruit surface. Infected fruit are usually low in both acid and sugars\n" +
            "\n" +
            "Pink disease\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Infected fruits do not show any external symptoms, even when fully ripe. Internally, the flesh may be water-soaked or light pink and have an aromatic odour, although these symptoms may not be obvious immediately. When sterilized by heat during canning, infected tissue darkens to colours ranging from pink to dark brown.\n" +
            "    In some fruits, only one or a few fruitlets may be infected. In highly translucent, low- brix fruit, the entire cylinder can be invaded.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The bacteria infect through the open flower during cool weather. Disease incidence increases in dry conditions before flowering, followed by rainfall during flowering.\n" +
            "    The bacteria are thought to be carried by nectar feeding insects and mites to open flowers from infected, decaying fruit near flowering fields\n" +
            "\n" +
            "Virus associated diseases\n" +
            "Mealybug wilt disease\n" +
            "Damage symptoms\n" +
            "\n" +
            "    The early symptoms are a slight reddening of leaves about halfway up the plant. The leaf colour then changes from red to pink and leaves lose rigidity, roll downwards at the margin and the tip of the leaf dies.\n" +
            "    The root tissue also collapses and the plant appears wilted. Plants can recover to reduce symptomless leaves and fruit that are markedly smaller than fruit from healthy plants.\n" +
            "    Symptoms are most obvious in winter when plant growth and vigour are reduced.\n" +
            "    Disease development and incidence is affected by plant age at the onset of mealy bug infestation, with younger plants displaying symptoms two to three months following feeding, while older plants may take up to 12 months to develop symptoms.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The disease is thought to be caused by viruses transmitted by mealy bugs with the pink mealy bug (Dysmicoccus brevipes) being the main vector.\n" +
            "    The disease is probably introduced in planting material that may not show obvious disease symptoms. Once established, the viruses are transmitted when the mealy bugs feed on young leaves. Mealy bugs are sedentary insects that are moved from plant to plant by attendant ants or by wind.\n" +
            "    Ants actively tend mealy bugs. The coastal brown ant (Pheidole megacephala) is common and active, but many other species can be involved in raising mealy bugs. Mealy bugs produce honeydew, which is harvested by ants for food. Ants also protect mealy bugs from predators and move them around and between plants. The removal of spiders from fields by ants often allows large populations of mealy bugs to develop, increasing the risk of severe mealy bug wilt outbreaks. The incidence is variable and sometimes high. The amount of wilt in a field is related to the number of mealy bugs present, the length of time they feed and the activity of ants.\n" +
            "\n" +
            "Yellow spot\n" +
            "Damage symptoms\n" +
            "\n" +
            "    Infection occurs on young crowns when they are still on the fruit or during the first few months after planting. Small (2–5 mm), round, yellow spots appear on the upper surface of the leaves of young plants. These spots fuse and form yellow streaks in the leaf tissue, which soon become brown and die.\n" +
            "    The virus spreads to the leaves in the plant heart, causing the plant to bend sideways. Infection eventually kills the plant so that the virus is not transmitted to subsequent plantings. If the crown is infected while still on the fruit, the fruit dies from the top downwards. Infections can occur through open blossoms causing the development of large, blackened cavities in the side of the fruit.\n" +
            "\n" +
            "Survival and spread\n" +
            "\n" +
            "    The viruses are transmitted to pineapple plants by small flying insects (thrips). Infection occurs mostly on plants during early growth, and crowns on developing fruit are occasionally infected.\n" +
            "    As infection is always fatal, vegetative propagation does not spread the virus to subsequent plantings.\n" +
            "    Tospoviruses have a wide range of hosts among weed and crop plants. The disease is rarely seen\n";
    String caring = "CARING FOR PINEAPPLES" +
            "Soil Preparation\n" +
            "Pineapple plants prefer sandy, loamy soil that has a neutral to slightly acidic pH. Prepare soil for pineapple plants by mixing a small amount of organic compost or manure into the soil's top 12 inches, ideally about one week before planting. The compost helps the soil retain water and vital nutrients, aiding pineapple plants' root development. Applying a thin layer of natural mulch, such as wood chips or bark, after planting helps to improve the nutrient quality of the top layer of soil.\n" +
            "\n" +
            "Fertilizer\n" +
            "\n" +
            "Nitrogen is one of the most vital building blocks for young pineapple plants. A dry fertilizer that contains 6 to 10 percent nitrogen, 6 to 10 percent potash, 6 to 10 percent phosphoric acid and 4 to 6 percent magnesium works well. Young pineapple plants should be fertilized every two months or so during the growing season. If the soil has a high pH level, which means it is alkaline, then an occasional soil drench of chelated iron near the base of each plant can lower the soil's pH level and benefit the plants.\n" +
            "\n" +
            "Foliar Spray\n" +
            "\n" +
            "Pineapple plants also can absorb fertilizer through a foliar spray, which is sprayed directly on their leaves. Following foliar spray fertilizer instructions carefully is essential because overspraying can cause leaf burn. Choose a fertilizer foliar spray that contains 6 to 10 percent nitrogen, 6 to 10 percent potash, 6 to 10 percent phosphoric acid and 4 to 6 percent magnesium, as well as iron if possible. A foliar spray may be applied every two to two and one-half months. Micronutrient sprays also are available and contain zinc and manganese. Those sprays should be given to pineapple plants only two or three times per year.";
    String storage = "HARVESTING:\n" +
            "It is difficult to tell when the pineapple is ready to be harvested. A good, ripe fruit has a dull, solid sound. For fresh consumption, fruits are harvested at ‘one- or two-eyes ripe’ meaning that the bottom one or two eyes have turned color. However, the use of this harvest index depends on cultivar as well as the destination of the market. At 127 days after flower induction, the fruits normally reach the stage of 25% shell color i.e. a quarter of the fruit shows an attractive yellow-orange color. Harvesting is usually done between seven and 14 days after the fruit has yellowed. Fruits are normally harvested with a long knife, locally known as ‘parang’ and placed into a basket carried on the back of the harvester. When the peduncle is cut during harvesting, about 3-5 cm of it is left attached to the fruit. It is important to harvest and handle the fruit carefully since any injury can affect the fruit quality and shorten the storage life. Any diseased or abnormal fruits are rejected in the field. Crowns of fruits for local sale are sometimes removed during harvesting and left on top of the plants in the field or are placed in bags to be collected later for planting, but for export markets, they are always retained. From the collection centre, the fruits are manually loaded onto lorries, which transport them to the market place, or to the packinghouse for export. The fruit should be stored at 7.23° C or above, but should be stored for no longer than 4 – 6 weeks.\n" +
            "\n" +
            "Pineapple is a non-climacteric fruit which does not improve in quality including sugar accumulation and flavor once they are harvested. Pineapples harvested at more advanced maturity stages (ripened on the plant) have much better flavor and sweetness than the less mature fruit. Immaturity and poor quality are indicated by a hollow thud.\n" +
            " \n" +
            "In the worldwide Codex Alimentarius Standard for Pineapple, it is stated that the total soluble solid (TSS) content for harvesting must be higher than 12°Brix. InHawaii, the regulation allows only pineapple with total soluble solids (TSS) of not less than 12°Brix to be harvested and marketed. Minimum TSS content of 12°Brix is also used inQueensland,Australiaas a requirement for harvesting.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pineapple);


        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        care = findViewById(R.id.expand_text_view4);
        storages = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(Planting);
        e.setText(Fertilizer);
        diseases.setText(caring);
        care.setText(disease);
        storages.setText(storage);
    }
}
