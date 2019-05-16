package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class TuberousBenogiasActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "PLANTING\n" +
            "Tuberous begonias (‘Go Go Yellow’) planted in a shady, protected site\n" +
            "You can buy tuberous begonia plants in spring at garden centers or you can start tuberous begonias from tubers (see next section).  Once you have plants, choose a site for tuberous begonias that is somewhat protected from wind, where the soil is well-drained, and plants will be shaded during most of the day. Early morning and late afternoon sun will not harm them, but they need good indirect or dappled light at other times.\n" +
            "Although tuberous begonias must be grown in well-drained soil, they are not drought tolerant, so it's important to water them when it hasn’t rained. If they're growing in the shade of trees or in containers under a roof, you must pay even more attention to keeping the soil properly moist. Allow the soil in containers to become slightly dry before watering. Moss-lined wire hanging baskets work particularly well to provide adequate drainage.\n" +
            "Tuberous begonias are fairly heavy \"feeders\", so fertilize with a dilute balanced fertilizer throughout the growing season for best bloom and growth.\n";
    String Fertilizer = "STARTING BEGONIA TUBERS\n" +
            "A tuberous begonia tuber sprouting in a container.\n" +
            "In late winter or early spring, purchase tubers or start those you have stored. Tubers started in February should begin to bloom in June; those started in March or early April should bloom in July.\n" +
            "Plant the tubers in a flat of peat moss or vermiculite. If the stored tubers show no signs of disease, you can use the same medium in which they were stored. Otherwise, fill the flat with fresh peat moss or vermiculite. Find the upper surface of each tuber, the side with the depression or hollow. Plant the tubers right-side up in the flat, so the peat moss or vermiculite just covers them.\n" +
            "During this time, the tubers are very susceptible to rot, so it's important to keep the medium fairly moist, but not wet, and not to let water accumulate in the hollow part of the tuber. Place the flats where the temperature is around 70F, and they will receive indirect light. Supplemental lighting, such as grow lights, is not necessary during this stage of growth.\n" +
            "Transplanting to larger containers\n" +
            "Tuberous begonias growing in a decorative container\n" +
            "Roots will develop from the bottom, sides and top of the tuber, and stems will sprout from the top. After about one month, the stems will be 1 inch tall. Once they have reached this size, it's time to repot the tubers into larger containers, either 5- to 6-inch pots, or their permanent summer containers. Providing supplemental lighting or moving the plants to a brighter location will help form short, sturdy stems rather than tall, leggy ones.\n" +
            "Thinning stems\n" +
            "Small tubers will produce small plants; large tubers, large plants. Flower size is not affected by tuber size, but by the number of stems on each tuber. If you would like bigger flowers, thin the shoots when they're about 3 inches tall. Small tubers should have two or three stems, large tubers three to six stems, so pinch off any extras.\n" +
            "Some varieties, such as those used in hanging baskets, are grown for quantity of flowers, not for large blooms. These should not be thinned. They will be bushy and bear lots of smaller flowers, especially if the tips of the stems are pinched in May or early June.\n" +
            "Hardening off\n" +
            "A pink tuberous begonia flower with slightly ruffled petals.\n" +
            "To accustom the plants to outdoor conditions, begin hardening them off about two weeks before the last frost date. Move the plants outdoors on a warm day to a shaded, protected place. Bring them back in before temperatures cool off at night. The next day, put them out and bring them in again. Gradually move them out into brighter light and expose them to more wind, but continue to bring them in at night.\n" +
            "Once the weather has settled, the soil is warm, and all danger of frost is past (usually by late May or early June in Kenya), transplant them to hanging baskets on the porch or out in the garden, or move containers to their permanent place on the deck or patio.\n";
    String disease = "DISEASES AND OTHER PROBLEMS" +
            "Leaf Diseases\n" +
            "\n" +
            "A variety of diseases affect tuberous begonia leaves. Powdery mildew, which occurs in crowded or shady conditions, causes white powdery spots on both sides of the leaves and greasy spots on their undersides. Space plants 12 inches apart to prevent crowding and improve air circulation to control powdery mildew. Another ailment, bacterial leaf spot, is a fatal disease that causes water-soaked spots with yellow margins on leaves. It occurs on wet leaves in humid conditions. Avoid overhead watering, remove and destroy infected leaves, and do not propagate tuberous begonias from diseased leaves.\n" +
            "\n" +
            "Root and Stem Rot\n" +
            "\n" +
            "Some fungi live in the soil and cause root and stem rots in tuberous begonias. For example, pythium root rot infects the tubers and causes stunting and plant death in excessively wet soil. The tubers become discolored, and then the stems turn black and eventually collapse. To control pythium root rot, provide well-drained soil and do not allow the soil to become waterlogged, recommends the University of California Integrated Pest Management Program. Use pasteurized potting mix for container grown tuberous begonias.\n" +
            "\n" +
            "Insect Pests\n" +
            "\n" +
            "A variety of insects, including aphids and thrips, cause damage and disease as they feed on tuberous begonias. Tiny thrips transmit tomato spotted wilt virus, which causes poor flower quality, stunted growth and spots or rings on tuberous begonia leaves. Control thrips by removing weeds and susceptible plants such as dahlias, which can provide a habitat for the bugs. You may not notice aphids until you see black sooty mold on tuberous begonia leaves and stems. As these tiny insects feed on plant juices, they produce a sugary liquid called honeydew, which is a host for the sooty mold. Remove aphids by hand, or with insecticidal soap or a stream of water.\n" +
            "\n" +
            "Other Problems\n" +
            "\n" +
            "Although tuberous begonias need bright filtered sun to produce flowers, intense sunlight can burn the plants. Too much water or fertilizer can cause flower drop. Bedding plants usually need water only once every week, but container plants may need water more often to keep the soil moist but not soaked. Tuberous begonias prefer diluted liquid fertilizer every two weeks. Most varieties do not tolerate frost and will die in sub-freezing temperatures. If you dig up the tubers before the first frost in the fall, you can store them in peat moss at 45 to 55 degrees Fahrenheit and replant them after the last expected frost date.";
    String caring = "Tuberous Begonia Care Water the plants regularly to keep the potting soil slightly moist.\n " +
            "Provide a balanced, water-soluble fertilizer monthly during the growing season. Be sure to provide plenty of air circulation to prevent powdery mildew. Use a sharp knife to cut spent blooms as soon as they fade. Cut back on water in late summer, then dig the tubers when the foliage begins to turn yellow. Place each tuber in a small paper bag and store the bags in a cardboard box. Room temperatures for storage should be between 40 and 50 degrees F. (4-10 C.). Check the tubers occasionally and discard any that are soft or rotten. Replant the tuberous begonias in spring.\n" +
            "\n" +
          "";
    String storage = "STORING TUBERS AND PROPAGATION\n" +
            "Tuberous begonias will enter a dormant period no matter how they are grown, whether in a greenhouse or outdoors, so they are not suitable as year-round houseplants. (Some others, such as Rieger begonias, are a better choice as indoor flowering plants.) During the dormant period, begonia tubers must be stored indoors. Left in the ground during a Kenya winter, they would be killed. To prepare the tubers for dormancy:\n" +
            "1.\tGradually reduce watering and stop fertilizing at the end of August. Some gardeners may choose to remove any flower buds that form in September to encourage dormancy and the storing of energy in tuber.\n" +
            "2.\tDig begonia tubers when the foliage starts to yellow, or after the first killing frost.\n" +
            "3.\tCut the stems to about five inches, and allow tubers to cure (dry) indoors at room temperature, out of direct sunlight, until the remaining stem pieces are dry and loose.\n" +
            "4.\tPull off stems and any roots or soil, but don't wash the tubers.\n" +
            "5.\tPlace the tubers in a perforated plastic bag filled with peat moss or vermiculite.\n" +
            "6.\tStore in a cool, dark place at a temperature range of 40 to 50, much cooler than most basements. An insulated but unheated attic or three-season porch may be cool enough. A spare refrigerator can be an ideal place to store tender bulbs and other bulb-like plant parts, such as tubers.\n" +
            "7.\tCheck the tubers occasionally for rot, softening or withering, and discard bad tubers immediately.\n" +
            "Propagation\n" +
            " \n" +
            "\n" +
            "A completed forsythe pot ready for cuttings.\n" +
            "Unlike potato tubers, you can't cut begonia tubers into pieces to produce more plants. Although some growers divide begonia tubers, they must make the divisions when the plant is actively growing, and the tuber pieces often become diseased and rotten.  It is easier for homeowners to propagate rooting cuttings or starting from seed.\n" +
            "Propagating by root cuttings\n" +
            "A common way to propagate tuberous begonias is to root cuttings. If you thin out the stems when they are about 3 inches tall, you can use those cuttings. Some gardeners cut a small piece of tuber with each shoot to increase the chances of the stem rooting, but the wound on the tuber may allow disease-causing organisms to attack the tuber.\n" +
            "Before you take the cuttings, prepare what is called a forsythe pot in which to root them. To prepare a forsythe pot:\n" +
            "1.\tTake a 2- to 3-inch unglazed clay pot and cork the drainage hole in its bottom.\n" +
            "2.\tFill a 10-inch plastic pot with vermiculite.\n" +
            "3.\tPush the clay pot down into the vermiculite of the plastic pot. There should be a 3-inch wide ring of vermiculite around the clay pot.\n" +
            "4.\tMoisten the vermiculite, then fill the clay pot with water.\n" +
            "5.\tCut the stems to be rooted and insert them into the moist vermiculite.  \n" +
            "6.\tPut the whole assembly into a clear plastic bag.\n" +
            "7.\tFasten the top of the bag to keep the air around the cuttings humid.\n" +
            "8.\tSet the Forsythe pot in a warm place with bright indirect light.\n" +
            "9.\tThe clay pot is a water reservoir, so you will not need to water the cuttings as long as you keep it filled.\n" +
            "After two to four weeks, cuttings should be well-rooted. Open the plastic bag a little more each day for a few days to accustom the plants to normal humidity. Then plant them in pots, harden them off, and transplant them outside as described earlier. By September, small tubers will have formed, which you should cure and store just as you would larger tubers.\n" +
            "Propagating by seed\n" +
            "Tuberous begonias can also be propagated from seed, but the seeds must be started in December or January for summer bloom! Fill containers with fine-textured potting mix and moisten it. Press seeds onto the surface of the medium and cover them lightly with milled sphagnum. Moisten the sphagnum with a sprayer, then cover with glass or plastic wrap to keep moisture in.\n" +
            "At a constant temperature of 70, germination usually takes about ten days, but it can take as long as three weeks, especially if the temperature of the potting soil is lower than 70. Leave the plastic or glass on for one or two days after germination, then remove it.\n" +
            "Thin the seedlings to 2 inches apart. Bright light such as from a fluorescent grow light is helpful in producing sturdy seedlings.\n" +
            "When they become crowded, transplant them to larger pots, using a porous, well-drained potting mix. Harden the plants off, then plant them in hanging baskets, in larger containers, or directly in your garden.\n" +
            "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuberous_benogias);


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
