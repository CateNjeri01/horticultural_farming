package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class RosesActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "SELECTING AND PREPARING SITE\n" +
            "    Plant roses where they will receive a minimum of 5 to 6 hours of full sun per day. Morning sun is especially important because it dries the leaves, which helps prevent diseases. Roses grown in partial sun may not die at once, but they weaken gradually, producing subpar blooms and overwintering poorly.\n" +
            "    Remember that light changes as the angle of the sun shifts throughout the season. If you live in the upper half of the U.S., choose a site that will offer full sun year-round. The more sun you have, the more flowers your plants will produce. In the lower half of the U.S., choose spots with a little bit of afternoon shade. This protects blossoms from the scorching sun and helps your flowers last longer.\n" +
            "    If you live in a colder climate, consider growing roses close to the foundation of your home. This provides plants with some degree of winter protection. Walkways are also good spots provided there is full sun.\n" +
            "    Roses need a soil that drains well but holds onto moisture long enough for the roots to absorb some. One of the worst mistakes you can make is to not provide adequate drainage. Roses do not like wet, cold feet. \n" +
            "    Roses like loose, loamy soil leaning more toward sandy. Too much clay and the roots can become waterlogged. If you are not starting out with a loose, loamy soil, you will need to do some amending. \n" +
            "    If you’re planning multiple roses, do not crowd. Provide good air circulation to avoid powdery and downy mildew. \n" +
            "    Roses prefer a near-neutral pH range of 5.5–7.0. A pH of 6.5 is just about right for most home gardens (slightly acidic to neutral).\n" +
            "        An accurate soil test will tell you where your pH currently stands. Acidic (sour) soil is counteracted by applying finely ground limestone, and alkaline (sweet) soil is treated with ground sulfur";
    String Fertilizer = "PLANTING ROSES\n" +
            "    Wear sturdy gloves to protect your hands from prickly thorns. Have a hose or bucket of water and all your planting tools nearby. \n" +
            "    Soak bare-root roses in a bucket of water for 8-12 hours before planting.\n" +
            "    Prune each cane back to 3-5 buds per cane. Any cane thinner than a pencil should be removed.\n" +
            "    If planting container grown roses, loosen the roots before planting.\n" +
            "    When you plant the rose, be sure to dig a much bigger hole than you think you need (for most types, the planting hole should be about 15 to 18 inches wide) and add plenty of organic matter such as compost or aged manure.\n" +
            "    Soak the newly planted rose with water.\n" +
            "    Mound up loose soil around the canes to protect the rose while it acclimates to its new site.\n" +
            "    Some old-timers recommend placing a 4-inch square of gypsum wallboard and a 16-penny nail in the hole to provide calcium and iron, both appreciated by roses.\n" +
            "    Don’t crowd the roses if you plan to plant more than one rose bush. Roses should be planted about two-thirds of the expected height apart. Old garden roses will need more space, while miniature roses can be planted closer. \n";
    String disease = "TAKING CARE OF ROSES\n" +
            "Watering Roses\n" +
            "    Diligently water your roses. Soak the entire root zone at least twice a week in dry summer weather. Avoid frequent shallow sprinklings, which won’t reach the deeper roots and may encourage fungus. In the fall reduce the amount of water, but do not allow roses to completely dry out.\n" +
            "    Roses love water—but don’t drown them. That is, they don’t like to sit in water, and they’ll die if the soil is too wet in winter. The ideal soil is rich and loose, with good drainage. One of the worst mistakes you can make is to not provide adequate drainage.\n" +
            "    Use mulch. To help conserve water, reduce stress, and encourage healthy growth, apply a 2- to 4-inch layer of chopped and shredded leaves, grass clippings, or shredded bark around the base of your roses. Allow about 1 inch of space between the mulch and the base stem of the plant. " +
            "Feeding Roses\n" +
            "\n" +
            "    Artificial liquid fertilizers tend to promote plant growth that is soft and tender, and this type of foliage can attract aphids and other pests. Instead, rely on compost and natural fertilizers to feed your plants before and throughout the blooming cycle.\n" +
            "    Once a month between April and July, you could apply a balanced granular fertilizer (5-10-5 or 5-10-10). Allow ¾ to 1 cup for each bush, and sprinkle it around the drip line, not against the stem. See our fertilizer guide for more information.\n" +
            "    In May and June, you could scratch in an additional tablespoon of Epsom salts along with the fertilizer; the magnesium sulfate will encourage new growth from the bottom of the bush.\n" +
            "    Banana peels are a good source of calcium, sulfur, magnesium, and phosphates—all things that roses like. (Note that it will take longer for your roses to reap the benefits from bananas than it would with pure soil amendments.) Here are three ways to serve them up: \n" +
            "        Lay a strip of peel at the base of each bush.\n" +
            "        Bury a black, mushy banana next to each bush.\n" +
            "        Chop up the peels, let them sit for two weeks in a sealed jar of water, and pour the mixture under each bush.\n" +
            "\n" +
            "Pruning Roses\n" +
            "\n" +
            "    When pruning, be judicious. If you prune too hard in autumn, plants can be damaged beyond recovery. Instead, wait until spring, when plants begin to leaf out for the new season. (Roses are often not the earliest plants in the garden to respond to spring’s warming temperatures, so be patient.) Give the plant time to show its leaf buds then prune above that level.\n" +
            "    Destroy all old or diseased plant material. Wear elbow-length gloves that are thick enough to protect your hands from thorns or a clumsy slip, but flexible enough to allow you to hold your tools. Always wear safety goggles; branches can whip back when released.\n" +
            "    Don’t cut back or move roses in summer, as they might suffer and die in the heat. Large rose canes can be cut back by as much as two thirds, and smaller ones to within 6 to 12 inches of the ground.\n" +
            "    Use pruning shears for smaller growth. Use loppers, which look like giant, long-handle shears, for growth that is more than half an inch thick. A small pruning saw is handy, as it cuts on both the push and the pull.\n" +
            "    Deadhead religiously and keep beds clean. Every leaf has a growth bud, so removing old flower blossoms encourages the plant to make more flowers instead of using the energy to make seeds. Remove any debris around the rose bush that can harbor disease and insects.\n" +
            "    Late in the season, stop deadheading rugosas so that hips will form on the plants; these can be harvested and dried on screens, away from sunlight, then stored in an airtight container.\n" +
            "    Stop deadheading all your rose bushes 3 to 4 weeks before the first hard frost so as not to encourage new growth at a time when new shoots may be damaged by the cold.\n" +
            "    Not all types of roses are pruned the same way or at the same time of year. Learn more here: How to Prune Roses.\n" +
            "\n" +
            "Winterizing Roses\n" +
            "\n" +
            "    Do not prune roses in the fall. Simply cut off any dead or diseased canes.\n" +
            "    Clean up the rose beds to prevent overwintering of diseases. One last spray for fungus with a dormant spray is a good idea.\n" +
            "    Stop fertilizing 6 weeks before the first fall frost but continue watering during dry fall weather to help keep plants healthy during a dry winter.\n" +
            "    Add mulch or compost around the roses after a few frosts but before the ground freezes. Where temperatures stay below freezing during winter, enclose the plant with a sturdy mesh cylinder, filling the enclosure with compost, mulch, dry wood chips, pine needles, or chopped leaves (don’t use maple leaves for mulch, as they can promote mold growth).\n";
    String caring = "PESTS AND DISEASES\n" +
            "Good gardening practices, such as removing dead leaves and canes, will help reduce pests. If problems develop, horticultural oil and insecticidal soap can help control insects and mildews.\n" +
            "\n" +
            "Possible rose pests and problems:\n" +
            "\n" +
            "    Japanese Beetles\n" +
            "    Aphids\n" +
            "    Black Spot: Rose plant leaves with black spots that eventually turn yellow have black spot. This is often caused by water splashing on leaves, especially in rainy weather. Leaves may require a protective fungicide coating, which would start in the summer before leaf spots started until first frost. Thoroughly clean up debris in the fall, and prune out all diseased canes.\n" +
            "    Powdery Mildew: Leaves, buds, and stems will be covered with a white powdery coating. Mildew develops rapidly during warm, humid weather. Prevent mildew by pruning out all dead or diseased canes in the spring.\n" +
            "    Botrytis Blight: This gray fungus will cause the flower buds to droop, stay closed, or turn brown. Prune off all infected blossoms and remove any dead material. Fungicide application may be necessary.\n" +
            "    Spider Mites\n" +
            "    Thrips\n" +
            "    Rust\n" +
            "    Stem Borers\n" +
            "    Deer: Roses are a delectable tidbit, so try planting lavender near your roses. Not only will you have the makings of a nice potpourri, but the scent of lavender will discourage browsers. You can also spread human or dog hair around the garden area or check our list of deer-resistant plants to protect your roses.\n" +
            "\n" +
            "In general, avoid rose issues by buying disease-resistant varieties and cleaning up debris, weeds, fallen leaves and any diseased plant material as soon as possible";
    String storage = "HARVESTING\n" +
            "Disinfect harvesting tools using chlorine solution before cutting the stems to avoid disease spread such as crown gall. For newly planted crop, harvesting starts in the 52nd day after planting. Cut stems at a height of 1cm above two leaf nodes above the cut point. Harvest stems that are 43cm, 53cm and 63cm and above, dependent on market orders. Remove and dispose off week stems from the crop stand. Care should be taken to avoid bruising the flower heads, bruised flowers are unmarketable.  Wrap the flower heads using nets to avoid bruising during transportation to cold stores or pack-house.\n" +
            "Post-harvest handling\n" +
            "Harvested stems should be dipped in post-harvest solution and taken to pre-cooling facility. Stems of same length should be put in one bucket containing the post- harvest solution to ease sorting in the pack-house.\n" +
            "Quality control check– starts in the field, post-harvest solution must be of the required standard to ensure flower quality is maintained all along the chain. At cold store entrance, the quality controller should sample and inspect the stems against pests and diseases, score the disease and pest severity and write a report to production manager to execute the right measures.\n" +
            "Sorting and grading- Done in the flower pack-house, it involves sorting flowers in terms of stem length. All stems that are broken are removed and disposed together with diseased ones, those with stem botrytis or botrytis of the flower head.\n" +
            "Bunching: Bunched according to stem size, each bunch may contain 5, 10 or 12 stems depending on the customer order. Bunch may have mixed varieties as per customer demand, mostly for the mixed ones they contain fillers.\n" +
            "Sleeving and packing: Bunched stems are sleeved using clear funnel shaped polythene sleeves and packed in cartoons ready for transportation.\n" +
            "Transportation: Roses are very sensitive to withering, cold chain should be maintained all along. Transporting vehicles should have cold facilities to ensure the flowers reach customers in desired quality, this also helps in achievement of the pre-tested vase-life.\n" +
            "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roses);

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
