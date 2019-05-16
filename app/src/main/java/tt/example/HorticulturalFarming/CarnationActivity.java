package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class CarnationActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "PLANTING AND TALKING CARE OF THE CARNATIONS\n" +
            "The carnations are very popular flowers, both commercially and ornamentally.\n" +
            "\n" +
            "The carnations could be well used as sideways decorative plants, in rock/pebble decorated gardens and even in flower pots. The carnations grow in a large variety of colors, such as, red, brick-red, orange, violet, yellow, pink, white, cream-colored.\n" +
            "\n" +
            "The carnations require a fertile soild, slightly alkaline or neutral from a pH point of view, easily drainable, with at least 4-5 hours of sun per day.\n" +
            "\n" +
            "The soil must be moist. Avoid over-watering the plants because it can lead to the foliage turning yellow. To have to carnations bloom constantly, they must be treated with a liquid fertilizing solution (10-10-10), every 6-8 weeks.\n" +
            "\n" +
            "The wilted flowers must be removed in order to encourage continuous blooming." +
            "How to Replant a Potted Carnation\n" +
            "\n" +
            "    Select a location where the plants will receive full sun to partial shade.\n" +
            "    Prepare the soil by adding 2 to 3 inches of compost of organic matter to the top 8 inches of soil. Carnations prefer well-draining soil with a neutral or slightly alkaline soil.\n" +
            "    Dig a hole deep enough to accommodate the root ball. Space plants about 1 foot apart to ensure adequate air circulation.\n" +
            "    Loosen the potting soil, and plant the carnations in the holes. Once transplanted, spread a thin, loose layer mulch or organic material around the base of the plant. Avoid direct contact between the plant and the soil additive.\n" +
            "    Water the plant thoroughly on the day of planting. Provide at least 1 inch of water per week, but avoid getting the flower petals or foliage wet. Wet foliage may encourage fungal leaf spots.\n" +
            "    Support your growing carnation plant with a stake positioned near the base of the plant to discourage stem breakage. Loosely tie plant stem to the stake with a piece of twine or fabric strip.\n" +
            "    Cut spent blooms above the node or stem junction. Removing dead flowers often encourages new growth.\n" +
            "    At the end of the season, cut stems back to 1 to 2 inches above the ground.\n" +
            "Carnations are the traditional Mother's Day flower, according to FTD, a premier floral retailer. Like other flowers, each color of the carnation evokes a different sentiment. Pink carnations represent gratitude, and red carnations represent admiration. White carnations are traditionally worn or given as gifts in remembrance for mothers who have passed away.\n" +
            "\n" +
            "Although carnations can be grown as perennials, they are traditionally treated as annuals. When properly cared for, carnations can grow vigorously year to year.\n" +
            "\n" +
            "Gardeners enjoy adding carnations to their garden because of their variety of colors and fragrant aroma. According to Organic Gardening, dwarf varieties of carnations will grow from 9 to 12 inches tall, whereas taller varieties will reach up to 18 to 24 inches.\n" +
            "How to Replant a Potted Carnation\n" +
            "\n" +
            "    Select a location where the plants will receive full sun to partial shade.\n" +
            "    Prepare the soil by adding 2 to 3 inches of compost of organic matter to the top 8 inches of soil. Carnations prefer well-draining soil with a neutral or slightly alkaline soil.\n" +
            "    Dig a hole deep enough to accommodate the root ball. Space plants about 1 foot apart to ensure adequate air circulation.\n" +
            "    Loosen the potting soil, and plant the carnations in the holes. Once transplanted, spread a thin, loose layer mulch or organic material around the base of the plant. Avoid direct contact between the plant and the soil additive.\n" +
            "    Water the plant thoroughly on the day of planting. Provide at least 1 inch of water per week, but avoid getting the flower petals or foliage wet. Wet foliage may encourage fungal leaf spots.\n" +
            "    Support your growing carnation plant with a stake positioned near the base of the plant to discourage stem breakage. Loosely tie plant stem to the stake with a piece of twine or fabric strip.\n" +
            "    Cut spent blooms above the node or stem junction. Removing dead flowers often encourages new growth.\n" +
            "    At the end of the season, cut stems back to 1 to 2 inches above the ground.\n" +
            "\n" +
            "How to Grow From a Cutting\n" +
            "\n" +
            "    Cut a thick stem from a carnation leaving at least 2 to 3 leaf nodes using sharp, sterilized shears. Keep track of which end of the stem was originally pointed downward.\n" +
            "    Strip leaves from the stem tips.\n" +
            "    Place the cutting in a container with coarse sand. Ensure you place the stem so it was oriented as before, placing the downward part of the stem in the sand.\n" +
            "    Moisten the sand thoroughly.\n" +
            "    Push the stem about 1/3 to 1/2 of the depth into the sand.\n" +
            "    Locate the container in a location within bright, indirect sunlight. Moisten the sand daily with a water bottle.\n" +
            "    Remove the plant about one month after blooming by gently using a tough to loosen the plant from the sand. Relocate it to the garden or a pot with potting soil.\n" +
            "How to Grow From Seed\n" +
            "\n" +
            "    Sow seeds about 1/8 inch deep in well-draining potting mix.\n" +
            "    Space seeds about 12 inches apart.\n" +
            "    Apply soil firmly over seeds, and moisten well.\n" +
            "    Store the growing seeds in an area between 41 to 59 degrees F that will receive full sun in the daytime.\n" +
            "    Expect germination in about 2 to 3 weeks.\n";
    String Fertilizer = "CARNATION PRUNING\n" +
            "Prune carnations to promote the overall health of the plant. You'll need to prune carnations twice a year, once in the summer to remove spent flowers, and once at the end of the growing season, cutting the plant almost down to the ground or the \"basal growth\" area. Always work with sterilized clippers to ensure you don't spread disease around your garden.\n" +
            "Summer Pruning\n" +
            "\n" +
            "    Inspect the plant for dead or withering buds.\n" +
            "    Cut just above the leaf node of any dead areas on the plant. Avoid cutting portions of the stem already displaying new growth. (Keep at least three nodes on each stem, or it may not bloom again).\n" +
            "    Expect more blooms in a few weeks.\n" +
            "\n" +
            "Periodically inspect the plant and deadhead spent blooms by hand. Deadheading will allow the plant to force more energy into other blooming buds and will keep the cycle of new blooms continuous.\n" +
            "\n" +
            "Keep your carnation plant trim and tidy by pruning back leggy plants. Blooms spaced closer together may actually give your plant a larger look and make it appear that you have more blooms.\n";
    String disease = "MAIN DISEASES \n" +
            "Fairy-ring Leaf Spot is produced by the Mycosphaerella dianthi fungus. The disease is visible on all the plant’s organs, where round or oval spots, yellow to brown in color, with a red or violet margin, grow. On the surface of the spots a brown to black, dusty looking mold grows, which represents the fungus’ sporulation. The affected flowers no longer open or they grow irregularly.\n" +
            "\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Avoid excess watering and periodically air the greenhouse  \n" +
            "    Gathering and burning the plants which have been severely attacked\n" +
            "    Plant healthy treatments using Topsin 70 WDG (10 g/ 10 l water), Teldor 500 SC (7 ml/ 10 l water), Rovral 500 SC (10 ml/ 10 l water).\n" +
            "\n" +
            "Carnation Rust is caused by the Uromyces caryophyllinus fungus. The disease attacks the leaves and stems. The affected plants have yellow leaves and on both sides of the yellow leaves the fungus’ uredospore grow, which are oval, brown and limited by the torn apart epidermis. The affected plants have thin stems, do not bloom or if they do, the flowers are bleached.\n" +
            "carnation dianthus caryophyllus carnation rust\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Gathering and destroying the affected parts of the plants\n" +
            "    Avoid excess moisture in the crop\n" +
            "    Plant health treatments using Bumper 250 EC (20 ml/ 10 l water), Polyram (20 g/ 10 l water), Dithane M 45 (20 g/ 10 l water), Topas 250 EC (5 ml/ 10 l water).\n" +
            "\n" +
            "Dianthus Leaf Spot is caused by the Septoria dianthi fungus. The disease attacks the leaves, stems and the flowers. On the affected organs, circular or irregularly shaped spots, white to gray colored spots, narrowed by red to violet edge, appear. This disease affected both greenhouse plants and crop plants. The affected plants have dried-up base leaves, with a wrinkled and twisted look.\n" +
            "carnation dianthus caryophyllus dianthus leaf spotcarnation dianthus caryophyllus dianthus leaf spot 1\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Using healthy cuttings\n" +
            "    Gathering and destroying the plants which have been severely attacked\n" +
            "    Plant health treatments using Topsin 70 WDG (10 g/ 10 l water), Merpan 50 WP (20 g/ 10 l water), Mirage 45 EC (35 g/ 10 l water), Falcon 460 EC (20 ml/ 10 l water).\n" +
            "\n" +
            "Carnation Blight is caused by the Alternaria dianthi fungus. The disease attacks the leaves, the stems and the flowers. The affected organs have circular, gray to white spots, of 10-15 mm diameter, covered by a black mold in the center. The affected leaves gradually wilt from the base towards the edges and on the stems injuries form which surround the stems like a ring. As a result of the attack, the stems break. The plants which have been severely affected have shorter internodes and bloom less.\n" +
            "carnation dianthus caryophyllus carnation blight\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Avoid excess moisture inside the plant’s growing places\n" +
            "    Using healthy cuttings\n" +
            "    Plant health treatments using Antracol 70 WP (20 g/ 10 l water), Bravo 500 SC (20 ml/ 10 l water), Merpan 50 WP (20 g/ 10 l water), Dithane M45 (20 g/ 10 l water).\n" +
            "\n" +
            "Fusarium oxysporum f.sp dianthi in Carnations is caused by the Fusarium oxysporum f.sp dianthi fungus. The symptoms are the leaves gradually wilting and turning yellow. At the base of the stem, the tissues are brown and destroyed. As a result of the attack, the stems easily break. If the stems are sectioned on the affected areas the veins will look completely brown or will have longitudinal brown stripes. The affected roots are either brown or red. On the rotten tissues, especially on the base of the stem, the fungus grows a cotton like mycelium where the sporulation can be differentiated.\n" +
            "carnation dianthus caryophyllus fusarium oxysporum in carnationscarnation dianthus caryophyllus fusarium oxysporum in carnations 1\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Using only healthy cuttings\n" +
            "    Gathering and destroying the affected plants\n" +
            "    Plant health treatments using Dithane M45 (20 g/ 10 l water), Topsin70 WDG (10 g/ 10 l water), Falcon 460 EC (25 ml/ 10 l water), Zamir 40 EW (25 ml/ 10 l water)\n" +
            "\n" +
            "Gray Mold disease caused by the Botrytis cinereal fungus. The disease mostly attacks the flowers. Rapidly extending and turning brown spots grow on the flowers. On the surface of the affected tissues, the gray sporulation, which is characteristic to this fungus, grows.\n" +
            "carnation dianthus caryophyllus grey mold\n" +
            "\n" +
            "Prevention and control measures:\n" +
            "\n" +
            "    Gathering and destroying the affected leaves and flowers\n" +
            "    Plant health treatments using Teldor 500 SC (7 ml/ 10 l water), Rovral (10 ml/ 10 l water), Topsin 70 WDG (10 g/ 10 l water), Ridomil Gold MZ (25 g/ 10 l water)\n" +
            "\n" +
            "Pests\n" +
            "\n" +
            "Aphids, for which the following pesticides are recommended: Calypso 480 SC (2 ml/ 10 l water), Decis Mega (3 ml/ 10 l water), Karate Zeon (2 ml/ 10 l water), Fastac (2 ml/ 10 l water).\n" +
            "carnation dianthus caryophyllus aphids 1\n" +
            "\n" +
            "Acari, for which the following pesticides are recommended: Envidor 240 SC (5 ml/ 10 l water), Nissorun (5 g/ 10 l water), Milbeknock (7.5 ml/ 10 l water).\n" +
            "\n" +
            "Thrips, for which the following pesticides are recommended: Confidor Energy (25 ml/ 10 l water), Novadim Progress (20 ml/ 10 l water).";
    String caring = "PROPAGATING CARNATIONS\n" +
            "Carnations can be propagated by three ways:\n" +
            "\n" +
            "    By seeds: Seeds can be sowed, 1/8 inch deep in a well-drained mix.Space seeds 12\" apart. Make sure the compost is moist but not wet. Firm soil over seed and mist spray occasionally and keep it moist. The seeds will germinate in 2 to 3 weeks.\n" +
            "    By cuttings: Cuttings taken from the terminal growth can also be used to propagate Carnations. The cuttings, varying from four to six inches long are taken and the basal leaves of at least two to three nodes are removed. The cuttings are then inserted in pure sand. The lower leaves must not touch the surface. Cuttings become ready for transplantation in 25 to 30 days.This method is preferably used in case of perennial Carnations.\n" +
            "    By division: Carnations can also be grown by division through which we can rejuvenate older plants. Dig up an entire clump, and either pull it apart using your hands to separate the plant segments, or use two gardening forks inserted in the center of the clump, to gently pry the plant apart. Replant each new division as you would a new perennial or annual, and water it in very well.\n";
    String storage = "FACTORS INFLUENCING GROWTH OF CARNATION\n" +
            "Some of the main factors affecting the growth of Carnations are listed below:\n" +
            "\n" +
            "    Sunlight: Carnations need full sunlight, about 4-5 hours everyday.\n" +
            "    Soil: Carnations thrive in fertile, well- drained, slightly alkaline (pH 6.75) soil.\n" +
            "    Water: Carnations do not require much water, except in the hot months.You must be careful not to make the soil too wet which can produce yellow foliage.You must spray water on the plants instead of splashing.\n" +
            "    Temperatures and Lighting: The optimum temperature for growing Carnations range from 50 - 59Â°F at daytime and 41- 46Â°F at night. The production and development of flower buds are improved under long-day conditions. Extended daylight at the level of 10w/m2 for at least two weeks after pinching. The extended day length will increase plant size.\n" +
            "    Manure: Peat is an excellent organic matter that can be added when growing Carnations. Pulverized and decomposed pine bark and well-rotted cow manure also serve as good manure. A prior soil analysis may help in deciding the kind of manure. A soil rich in manure or well-fed with nitrogen is not suited to the carnation. It may cause heavy vegetative growth, fewer blooms or even lead to the splitting of the calyx (green cup-like structure that holds the petals).\n" +
            "    Mulching: Mulching should not be done when growing Carnations. Sufficient air circulation around the stems is very necessary for their appropriate growth.They must be kept free from foliage moisture always.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnation);

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
