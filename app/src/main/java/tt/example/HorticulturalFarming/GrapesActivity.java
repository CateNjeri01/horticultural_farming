package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class GrapesActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e, diseases, pests ,management;

    String grapes_planting = "PLANTING, GROWING AND MAINTAINING GRAPE VINES\n" +
            "Care for your grape vines from planting and throughout the seasons, year after year. \n" +
            " Preparing vines for planting\n" +
            "In Kenya, spring planting is recommended to give the young vines the most time to get established before their first winter.\n" +
            " \n" +
            "\n" +
            "When planting bare root vines, soak roots in a bucket of water for 3-4 hours before planting.\n" +
            "If you order from catalogs or online sources your plants will arrive as dormant, bare root plants. When you receive the plants, keep them in a cool place with the root system moist. You should plant the vines as soon as possible.\n" +
            "Before planting bare root vines \n" +
            "•\tSoak the roots in water for 3-4 hours.\n" +
            "•\tAt planting, remove all canes except the most vigorous one.\n" +
            "•\tPlant vines with the lowest bud on the cane just above the soil surface.\n" +
            "•\tTrim off any broken or excessively long roots.\n" +
            "•\tDig a hole large enough to you can spread the root system out. \n" +
            "•\tThen cover the roots completely with soil.\n" +
            "Mulching is not usually recommended for grapes because mulch will keep the soil temperature too cool. Grape vines grow best in warmer soil.\n" +
            "Initial watering\n" +
            "After planting, water the vines regularly throughout the first year. The root system needs to grow and establish to allow for shoot growth in the first year.\n" +
            " \n" +
            "These vines were pruned in early spring before growth started. \n" +
            "SUPPORT\n" +
            "Grapevines need some type of support or they will trail along the ground. The support can be an arbor covering a patio for shade, or can be as simple as a post in the ground to support the trunk of the vine.\n" +
            "Grapevines can also be grown along an existing fence. Virtually any type of support structure will do, provided it is sturdy. Grape vines grow quickly and get quite heavy.\n" +
            "Grapevines can be trained and pruned to just about any form and shape.\n" +
            " Feeding and weeding\n";
    String Fertilizer = "FERTILIZER AND MULCH\n" +
            "The first two or three years, each early spring, apply compost around the base of the vines. Grape vines grow vigorously and might need a nutrient boost each year. You may not have to do this as the vines mature; it all depends on what you observe. Do the vines look vigorous and healthy? Maybe you don't need any fertilizer.\n" +
            "Unlike many other plants, it is best not to mulch around the base of your vine as the mulch can keep the soil too cool. Grapevine roots like to be warm.\n" +
            "WEEDING\n" +
            "Keep grass and other plants from growing under grapevines. This allows the soil to heat up early in the spring and maintain higher soil temperatures to encourage growth.\n" +
            "When plants grow under vines, the soil temperature stays cooler. With grapes, this will delay growth in the spring.\n" +
            "Keep the ground under the vines clear of other plants throughout the growing season by hoeing gently under the vines.\n" +
            " PRUNING\n" +
            "Pruning grapes depends on how you decide to grow them in your garden and how much space you have.\n" +
            " \n" +
            "\n" +
            "A fence, arbor or any other sturdy structure will work for a trellis to grow grapes in your yard.\n" +
            "Fences are ideal to use as support for vines. Vines can also be contained to one stake in the ground. If you have an arbor or pergola, grapevines can be grown over the top to produce shade.\n" +
            "Remember, flowers and fruit are located on buds that developed the previous year. Therefore you need to encourage new growth, but not too much. There are many ways to prune and train vines—let your imagination loose!\n" +
            "Year one\n" +
            "For the first year, pruning is the same no matter how you plan to train your vine. The key is to develop a strong root system and straight trunk.\n" +
            "•\tDepending on the size of the vine that you buy, prune the vine back to one straight cane.\n" +
            "•\tTie this cane to a stake or to the fence and encourage it to grow straight. You might have to tie it multiple times during the first year to keep it straight.\n" +
            "•\tWhen the vine gets to the top of the fence—this might be the year you planted, or it might be in the spring of the following year—remove an inch or two of terminal growth to force the vine to branch.\n" +
            "•\tTrain two branches, one in each direction, by tying them to the fence in opposite directions to form permanent branches running along the top of your fence.\n" +
            "•\tRemove any buds that start to grow lower on the trunk. This will make managing the vine much easier.\n" +
            " These vines in a vineyard are just finishing the growing season. The vertical, copper-colored canes are this year's growth. will be pruned back in the spring, leaving one or two buds per spur.\n" +
            "After year one\n" +
            "Once the trunk has reached as high as you want, and the lateral trunks have been formed, prune the vine each spring before growth begins so the developing canes have enough air movement around them to reduce diseases.\n" +
            "There are many different methods and techniques for training vines. You can experiment with pruning vines to see how they work in your landscape.\n" +
            "•\tRemember, fruit is produced on the current season's growth, which grows from last season's wood.\n" +
            "•\tHeavy pruning provides the best fruit.\n" +
            "•\tLight pruning results in large yields of poor-quality fruit.\n" +
            "•\tVery heavy pruning produces too much leafy growth and very little or no fruit.\n" +
            "•\tTable, juice, and jelly varieties can have 40 to 60 buds per vine after pruning, but wine varieties should have only 20 to 30 buds per vine after pruning.\n" +
            "Pruning old, neglected vines\n" +
            "Have you moved into a house and inherited some old, overgrown grapevines? Don't dig them out just yet; they can probably be saved!\n" +
            "You want to prune old and neglected vines in stages. Your goal is to get the vine back to a single trunk with well-placed canes. Prune when the vine is dormant, just before growth begins in spring.\n" +
            "1.\tSelect a new trunk from canes growing from the base of the vine.\n" +
            "2.\tCut the chosen new trunk to back to the desired height.\n" +
            "3.\tChoose two canes on each side to bear fruit this season and tie them to a trellis as they grow. If there are no lateral canes, wait until the next season and choose two new shoots to become the cordons, removing others lower down.\n" +
            "4.\tRemove other old wood. You might be cutting out a LOT of old wood.\n" +
            "5.\tContinue pruning and training as with a new vine.\n";
    String care = "MANAGING DISEASES, INSECTS AND OTHER PESTS\n" +
            "Most insect and other problems can be reduced by planting vines in a sunny location with good air circulation.\n" +
            "Weather conditions, winter hardiness of the variety, infection from the previous year, history of pesticide use, and surrounding vegetation can affect a vine's susceptibility for a particular year. \n" +
            " Insects and other creatures\n" +
            "The good news is that insects are rarely seen as problems with grapes grown in gardens in our climate.\n" +
            " Japanese beetles make lacework out of grapevine leaves.\n" +
            "The exception to this is Japanese beetles. These insects chew holes in the leaves leaving them with a lace-like appearance. Look for beetles and their damage beginning in late June or early July through August.\n" +
            " \n" +
            "\n" +
            "Japanese beetles are large (1/2\") and distinctly colored, making them easy to spot.\n" +
            "Having Japanese beetles on a plant attracts more beetles, so it's important to prevent accumulation.\n" +
            " The best control for home gardens is to check your plants often, at least twice a week and ideally in the morning when they're less active, and knock beetles into a pail of soapy water.\n" +
            "Monitor frequently and throughout the growing season for any other potential pest outbreaks.\n" +
            " As with diseases, cleaning up dead leaves and berries and cleaning under the vines will help.\n";
    String pest = "CREATURES THAT LIKE TO EAT GRAPES\n" +
            "Other insects such as yellow jackets and multicolored Asian lady beetles may feed on ripening grapes, damaging the fruit and promoting fungal disease infection. The best prevention is harvesting grapes as soon as they are ripe.\n" +
            "Whereas insects might not pose a significant problem with home-grown grapes, other creatures can. Birds are attracted to the ripening berries and can eat them all before you are ready to harvest. The only foolproof method of protection is netting to cover the ripening fruit on the vine. Deer and raccoons may need to be kept out with a fence if they prove to be a problem.\n" +
            " Diseases and other challenges\n" +
            "Diseases flourish in high humidity. Good air circulation in very important for preventing most diseases. This means annual pruning to keep the canopy from getting too dense.\n" +
            "Equally important is raking and removing leaves each fall as well as picking up and composting fallen fruit. After pruning, remove cuttings away from the vines. These practices will remove some of the places disease can overwinter to infect the following spring.\n" +
            "Diseased portions of a vine should be removed and discarded at first sign of disease, to prevent spread to the rest of the vine.\n" +
            "POWDERY MILDEW\n" +
            "This fungus can infect all parts of the grapevine.\n" +
            "•\tThe first sign of infection appears as a white powdery layer on leaves or fruit.\n" +
            "•\tLeaves infected while they are still growing become distorted and stunted.\n" +
            "•\tIf grapes are infected when they are small, the skin stops growing but the pulp continues to expand and the berry splits.\n" +
            "•\tIf infection occurs during fruit ripening, purple or red varieties fail to color properly and look blotchy at harvest.\n" +
            " \n" +
            "\n" +
            "DOWNY MILDEW \n" +
            "This fungus can infect any actively growing parts of the vine.\n" +
            "•\tWhen lesions form on leaves, the affected areas become brown and wither.\n" +
            "•\tSeverely infected leaves curl and drop from the vine.\n" +
            "•\tWhen parts of the vine are infected, they frequently become distorted, thickened, or curled with a white downy appearance.\n" +
            "•\tIf the infection is severe enough, parts of the vine will wither and die.\n" +
            "•\tIf grapes are infected, they fall off the vine.\n" +
            "High relative humidity promotes infection from both powdery and downy mildews. Infected shoots should be pruned and destroyed. Pruning in late winter should increase air circulation, as the vine grows during the year with the goal of reducing the chance of heavy infection. Make sure all leaves and rotted fruit are removed from around the vine to reduce infection.\n" +
            "Fruit rots\n" +
            "These fungal diseases can cause complete crop loss in warm, humid climates. Infection can be seen on leaves, petioles, shoots and grapes.\n" +
            "For black rot, grapes are susceptible from bloom until they begin to ripen.\n" +
            "•\tInfected berries first appear light brown.\n" +
            "•\tBlack spore-producing bodies develop on its surface.\n" +
            "•\tLater, the berries shrivel and turn hard and black to become mummified.\n" +
            "Botrytis fruit rot can grow on dead blossom parts in the cluster.\n" +
            "•\tBefore grapes begin to ripen, it moves from berry to berry within the bunch.\n" +
            "•\tBotrytis occurs most commonly on ripening berries, where infection and rot spread rapidly throughout the clusters.\n" +
            "Herbicide damage\n" +
            "Grapes are very susceptible to 2,4-D herbicide, which is widely used to control dandelions in lawns.\n" +
            "Exposure to herbicide causes deformed leaves and causes flower clusters to fall off. Avoid using this herbicide anywhere near grapevines.\n" +
            "You might want to ask your neighbors to not use it either.\n" +
            "\n";
    String manage = "WHEN TO HARVEST GRAPES\n" +
            "\n" +
            "If you have a large crop of grapes that you’re growing for wine making purposes – you’ll want to get a little bit technical and actually measure the sugar content (BRIX) of your grapes using a refractometer or hygrometer (available at brewmaster stores).\n" +
            "\n" +
            "For those of us who are just picking a few grapes in the backyard, we can rely on our senses to get a good handle on whether or not our grapes are ready to harvest.\n" +
            "\n" +
            "TASTE is actually the best way to judge your grapes. Each variety has it’s own unique flavor, so it helps if you know what your variety is “suppose to” taste like.  If you don’t know, ideally your grapes should be sweet and not too tart.  The best day to pick grapes is when they are at their sweetest before they begin to overdevelop and shrivel.\n" +
            "\n" +
            "grapes\n" +
            "\n" +
            "Above all other methods, tasting grapes from various clusters on your vine is the best way to judge their ripeness.  Here are some other methods.\n" +
            "\n" +
            "LOOK at your grapes carefully.  They should be a full, deep color all around.  Green grapes will lighten and almost turn yellowish. But take note, grapes will turn the right color even before they’ve fully developed their sweetness – so don’t go by looks alone. Grapes often need another 1 to 3 weeks to develop their full sweetness after they’ve turned the right color.\n" +
            "\n" +
            "green grapes\n" +
            "\n" +
            "FEEL the grapes, they should be plump, thick and feel like they are full of juice.  They should not look like they’re starting to shrivel – you’ve waited too long if that’s happening.\n" +
            "\n" +
            "hold grapes\n" +
            "\n" +
            "SEED COLOR is another indicator.  Just like in apples, seeds of ripe grapes turn from white to tan to brown.\n" +
            "\n" +
            "WILDLIFE eating your grapes is also a sure sign that your grapes are ready. Racoons, squirrels and birds will eat grapes when they’re ripe – if they’re feasting – you can too!\n" +
            "\n" +
            "Remember, once picked, grapes will not change in sweetness or colour so it’s important to harvest when they are just right.\n" +
            "\n" +
            "holding grapes \n" +
            "\n" +
            "Contrary to popular belief, you do not need to wait until the first frost to harvest your grapes.  Having said that, you can still harvest grapes after some light frost. You might even find that the frost sweetens the grapes a little.\n" +
            "How to Harvest Grapes\n" +
            "\n" +
            "It is best to pick grapes on a warm, sunny day as the grapes will have the highest sugar content and will store better if they do not have any surface moisture.hold and cut grapes - watermarked\n" +
            "\n" +
            "To pick:\n" +
            "\n" +
            "Hold a cluster of grapes in one hand and snip the whole cluster off the vine with sharp garden pruners or scissors. Breaking off the cluster is difficult and will damage the plant, it’s best to use a sharp cutting tool.\n" +
            "\n" +
            "hold and snip grapes\n" +
            "\n" +
            "Gently place each bunch in a pail or bucket.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grapes);

        expandableTextView = findViewById(R.id.expand_text_view2);
        e = findViewById(R.id.expand_text_view1);
        diseases = findViewById(R.id.expand_text_view3);
        pests = findViewById(R.id.expand_text_view4);
        management = findViewById(R.id.expand_text_view5);

        expandableTextView.setText(grapes_planting);
        e.setText(Fertilizer);
        diseases.setText(care);
        pests.setText(pest);
        management.setText(manage);
    }
}
