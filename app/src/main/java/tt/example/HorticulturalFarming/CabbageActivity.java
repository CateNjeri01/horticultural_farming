package tt.example.HorticulturalFarming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class CabbageActivity extends AppCompatActivity {
    ExpandableTextView expandableTextView ,e , diseases,care,storages;

    String Planting = "SOIL PH AND FERTILITY\n" +
            " SOIL TESTING AND FERTILIZER\n" +
            "•\tApply phosphorus (P) and potassium (K) according to soil test recommendations.  \n" +
            "o\tMany Kenya soils have adequate amounts of phosphorus.\n" +
            "o\tUnless your soil test report specifically recommends additional phosphorus, use a low- or no-phosphorus fertilizer.\n" +
            "•\tGrow cabbage in well-drained yet moisture-retentive, fertile soil with a pH of 6 to 7. \n" +
            "•\tImprove your soil by adding well-rotted manure or compost in spring or fall. Do not use fresh manure as it may contain harmful bacteria, and may increase weed problems. \n" +
            "•\tThe plant needs to absorb water and nutrients steadily during its growth.\n" +
            "•\tDo not use any fertilizer containing a weed killer (\"Weed and Feed\"), as it may kill your vegetable plants.\n" +
            "•\tWhen the plants are about 4 inches tall, apply fertilizer alongside the row of plants at a rate of ½ cup of 46-0-0, or 1 cup of 27-3-3, or 3-½ cups 10-3-1 for each 100 feet of row.\n" +
            "o\tSpread the fertilizer in a six-inch wide band, and scratch it into the surface of the soil.  \n" +
            "o\tIf you use manure or compost, you may not need additional fertilizer applications, depending on how much organic matter you apply.\n";
    String Fertilizer = "PLANTING\n" +
            " SPRING PLANTING\n" +
            "Start cabbage indoors if you will plant it in the spring for a summer harvest. Although the seeds will germinate at low soil temperatures, cabbage seedlings are sensitive to frost. If you wait until the weather has settled, and plant the seeds later in spring, the crop will mature during the hottest part of the summer, leading to poor quality.\n" +
            " \n" +
            "There is no need to use a heating mat as you might for other seeds. Normal room temperatures between 60°F and 70°F, and bright overhead light, will lead to the best development of the plants. Higher temperatures cause rapid growth, producing tall, weak plants that are difficult to handle without causing damage.  \n" +
            "1.\tStart seeds indoors in early April, or four to six weeks before transplanting. Leave 24 to 30 inches between hand-cultivated rows, and 18 inches between plants. Per 20 feet of row, you should order one seed packet, or 12 plants\n" +
            "2.\tPlant the seeding at a depth of 1/4 of an inch\n" +
            "3.\tApply fertilizer to developing seedlings beginning when the first true leaf appears. Use a half-strength starter solution once a week. After two true leaves are present, apply fertilizer twice a week.  \n" +
            "4.\tWhen the plants have five true leaves after about three weeks, reduce watering\n" +
            "5.\tPlace plants outside where they will receive a couple of hours of sunlight and have wind protection.\n" +
            "6.\tSlowly expose them to more sunlight over the next week or two, bringing them indoors if night temperatures drop below 40°F\n" +
            "7.\tDig small holes with a trowel, or dig a furrow with a shovel\n" +
            "8.\tPlace the seedlings 15 to 18 inches apart, and fill the soil around them so that the plant is at the same level it was in its pot\n" +
            "9.\tWater the plants in, or use a transplant starter solution high in phosphorus, and low in nitrogen and potassium.\n" +
            " Summer planting\n" +
            "For a fall crop, plant seed directly in the garden in early July. It is impossible to know just when cold weather will come, but in most of Kenya, you must harvest cold-tolerant crops like cabbage by late October.\n" +
            " \n" +
            "Cabbage takes between 60 and 100 days to mature. A July planting will begin to form a head as summer turns to fall, and be ready to harvest before a hard freeze. Direct seeded cabbages will take up to three weeks longer to reach maturity than transplants, so for much of Kenya, the first week in July is the right time to plant.\n" +
            "1.\tPlant seed shallowly at a depth of 1/4 to 1/2 inch, and three seeds every 15 to 18 inches\n" +
            "2.\tKeep the soil moist during emergence. Once the plants emerge, thin so that one seedling remains. \n" +
            "3.\tYou will need to take particular care of the seedlings, as they experience extreme heat, wind, drought, and insects when they are most vulnerable. Water them as needed. \n" +
            "4.\tA row cover will protect the plants from wind and insects during the first weeks of growth.\n";
    String disease = "HOW TO KEEP YOUR CABBAGE PLANTS HEALTHY AND PRODUCTIVE\n" +
            " WATERING\t\n" +
            "•\tCabbage needs good soil moisture. The best quality heads are firm, crisp, juicy, sweet, and sometimes peppery, but without bitterness.\n" +
            "•\t If the plants do not receive consistent rainfall or irrigation, they will have poor texture and excessive bitterness. Outer leaves may brown and dry up, or the plant may fail to form a head. \n" +
            "•\tOne inch of rainfall per week is enough water. \n" +
            "•\tIf your soil is sandy, it is better to water more often than once a week.\n" +
            "•\tAn inch of water will wet a sandy soil to a depth of ten inches, a heavy clay soil to six inches. \n" +
            "•\tUse a trowel to see how far down the soil is wet. If it is only an inch or two, keep the water running.\n" +
            " CONTROLLING WEEDS\n" +
            "•\tFrequent, shallow cultivation will kill weeds before they become a problem.\n" +
            "•\t Cultivate just deeply enough to cut the weeds off below the surface of the soil. Be careful not to damage the plants when cultivating.\n" +
            "•\tMulching with herbicide-free grass clippings, weed-free straw or other organic material to a depth of three to four inches can help prevent weed growth, decreasing the need for frequent cultivation.\n" +
            " COMMON PROBLEMS\n" +
            "Damage to the central growing point when the plant is small can cause failure to form a head. The leaves that have already formed will become tough and thick, and no further leaves will develop.\n" +
            "Cold temperatures, rough handling or insect feeding can all damage young plants, so be careful when handling them and when working around them. Do not set plants out before the weather has settled. Look for insect infestation.\n";
    String caring = "Black Rot (Xanthomonas campestris pv. campestris): This bacterial disease is common in areas having a warm and wet climate. Plants can be infected during any growth stage and the symptoms resemble nutritional deficiencies. Infected seedlings become yellow, drop lower leaves, and may die. Leaves may be affected on only one side of a seedling. Plants infected because of contaminated seed may not develop symptoms for many weeks. The classic symptom of black rot is caused by local infection that results when bacteria enter leaves through natural openings of leaf margins. The infected tissue turns pale green-yellow and then turns brown and dies. Affected areas are usually wedge- or V-shaped. These areas enlarge as the disease progresses, and severely affected leaves may drop off. The veins in infected leaves, stems, and roots sometimes become black. The heads of the infected plants remains small and its quality is reduced making it unfit for marketing.\n" +
            "\n" +
            "Control: An integrated approach is needed to manage black rot successfully. Use of black rot tolerant varieties is the best method to control the disease. Considerable reduction in disease has been observed when seeds are treated with Agrimycin-100 (100ppm) or Streptocycline (100 ppm). Planting should be done on raised beds to facilitate drainage. Cultivation in the fields where crucifers have been continuously grown during last 2 years should be avoided. Plants should be thoroughly inspected for black rot symptoms and the affected plants should be removed and destroyed.\n" +
            "\n" +
            "Downy Mildew (Perenospora parasitica): The disease is very serious in nursery and it can also appear in field planting. High humidity, fog, drizzling rains, and heavy dew favour the disease development and spread. The first symptom observed are small, light green-yellow lesions on the upper leaf surface, later showing on the undersurface. The spots turn yellow as they enlarge. During periods of high humidity, a grayish white moldy growth is developed on the undersurface of the leaf. Later the leaf may become papery and die. Cabbage heads develop sunken black spots. Though, some plants are infected at the seedling stage, the symptoms does not become apparent until near harvest.\n" +
            "\n" +
            "Control: All the weeds serving as alternate host to the fungus should be destroyed. The crop should be irrigated judiciously to avoid periods of high humidity. Spraying the seedlings in the nursery beds with Copper Oxychloride (0.3%) is effective in controlling the disease. The first spray should be given as soon as the seedlings appear. Subsequent sprayings are given at weekly intervals until the plants are transplanted in the field. For controlling the disease in the field, the crop is sprayed with Copper Oxychloride (0.5%).\n" +
            "\n" +
            "Wire Stem (Rhizoctonia solani): This disease is more serious in nursery beds. The affected young seedlings show reddish brown discolouration of the stem near the ground level. This area gets constricted and the plants bent or twist without breaking. In some cases, the seedling continues to grow even though the lesion girdles the stem. The lesion is quite sunken, and the stem resembles a wire, hence the name 'wirestem'. The girdled seedling eventually dies. Cool, cloudy weather, high humidity, wet and compact soil, and overcrowding especially favours development of the disease.\n" +
            "\n" +
            "Control: Soil used for preparing raised beds should be well- drained. Excessive irrigation should be avoided to reduce humidity around the plants. The seedlings in the seedbed should be adequately spaced to allow maximum air movement. While transplanting, the seedlings showing symptoms of 'wirestem' disease should be discarded. Preventive measures such as seed treatment with antagonist fungal culture of Trichoderma viride (3-4 g/kg of seed) or Thiram (2-3 g/kg of seed) are effective. Soil around the affected seedling should be drenched with Dithane M 45 (0.2%) or Bavistin (0.1%) to control the spread of the disease.\n" +
            "\n" +
            "Leaf Spot and Blight (Alternaria brassicae and A. brassiciola): It is a destructive disease on seed crop. Older leaves are more susceptible. The initial symptoms are in the form of small dark yellow spots on the leaf surface. Later on the spots enlarge to circular areas with concentric rings and possibly surrounded by yellow halos. In severe cases, the entire plant defoliates. Violets to tan spots develop on infected cabbage seed pods which intensifies in wet weather.\n" +
            "\n" +
            "Control: Use of disease free seeds, practicing proper crop rotation and seed treatment with hot water (50OC for 30 minutes) helps to minimize the disease incidence. Crops grown for seed purpose should be sprayed at full bloom, pod set and pre- harvest stage with Captan (0.2%) or Copper Oxychloride (0.5%) for the control of disease.\n" +
            "\n" +
            "Yellows or Fusarium Wilt (Fusarium oxysporum f. sp conglutinans): The disease affects the seedlings in nursery stage, however plants exhibit symptoms 2 to 4 weeks after transplanting. Disease development is promoted by warm weather conditions. Initial symptom appears as the development of yellowish green colour on one side of the plant. A lateral warping or curling of the stem and leaves occurs. The lower part of the leaf blade adjoining the petiole or midrib wilts and dies. The lower leaves turn yellow and later the upper leaves are affected. With time, the yellow leaves turn brown and the affected tissue becomes dry and brittle. The speed of progress of disease in the plant depends upon the degree of varietal susceptibility and the soil temperature.\n" +
            "\n" +
            "Control: The conventional controls such as rotation, seed treatment, fungicide sprays, and destruction of crop refuse are of little value once the fungus has established itself on a farm or in a specific field. Therefore, the use of resistant varieties is the only control. However, as a preventive measure the vulnerable stage of the young seedlings to the infection can be avoided by very early sowing of cabbage.\n" +
            "\n" +
            "Black Leg (Phoma lingum): This disease generally does not reduce seed crop yields; however, low levels of seed infection coupled with weather favorable for disease spread in seedbeds can lead to severe losses after transplanting. Pale, irregular spots develop on leaves, which later become ashy gray with scattered black dots on the surface. Stem lesions are elongated with purple borders near the ground level and extend below the soil surface, causing a black rot of lower stem and roots. Severely affected plants remain stunted and finally wilt. As plants mature, they fall sideways from lack of root anchorage. Seed crop symptoms include occasional cankers on stem bases and spots may appear on overwintered leaves. Symptoms on seed pods are rare and inconspicuous. Infection can spread to the base of leaves of cabbage heads in storage.\n" +
            "\n" +
            "Control: Disease free seeds should be used for planting. As the main infection is through seeds, hot water treatment of seeds is recommended. For seed production plots, seed stock used should be free from fungal pathogen. Cultivation in the fields where crucifers have been continuously grown during last 2 years should be avoided. Seedbeds and seed plots should be regularly inspected for obvious foliar infections. Seedlings before transplanting should not be dipped in water. Plant debris and disease susceptible weeds should be removed and destroyed.\n" +
            "\n" +
            "Clubroot of Cabbage (Plasmodiophora brassicae): Cool, wet and acidic soils favours the development and spread of the disease. Roots develop clubs (swellings) that can be 12-15cm wide. The largest clubs are usually on the larger roots just below the soil surface. Affected seedlings do not show any root swellings until about 3 weeks after infection. Infection in the nursery stage results in the death of seedlings. When plants are attacked at a later stage, the disease rarely kills the plant, but the capacity of the affected roots to absorb minerals and water gets reduced. Plants wilt in hot weather but partly recover at night. Finally leaves become stunted, yellowish and prematurely bolt in hot weather.\n" +
            "\n" +
            "Control: Early infection of seedlings can be destructive, so it is important to use only uninfected seedbeds and clean equipment. Long rotations (6 years or longer) help prevent a pathogen buildup and reduce disease incidence. When susceptible varieties are grown in acidic soils, finely ground limestone is thoroughly mixed into the soil six weeks before planting to raise the soil pH above 7.0. Lime inhibits disease development, but will not prevent a disease outbreak if the spore load in the soil is sufficiently high. The quantity of lime is determined by initially measuring the pH of the soil.\n" +
            "\n" +
            "Sclerotinia rot/ White Mould (Sclerotinia sclerotiorum): This fungus can cause serious losses in the field, in storage, and under transit and market conditions. Generally, damp weather favours the occurrence of the disease. Infections may occur on the stem at the ground level, on the leaves at their bases, or where the foliage comes in contact with the soil. The infections begin as water-soaked, circular areas, which soon become covered by white, cottony fungal growth. The affected tissue becomes soft and watery as the disease progresses. The fungus eventually colonizes the entire cabbage head and produces large, black, seedlike structures called sclerotia on the diseased tissue.\n" +
            "\n" +
            "Control: The disease can be managed most successfully by combining cultural practices that discourage disease development. Planting cabbage in fields that are surrounded by dense woods will restrict air circulation and subsequently delay drying. Rows should be planted in the direction of the prevailing winds to promote free flow of air movement within the plants. Fields with a history of white mold should be planted with non-susceptible crops such as grains (corn, rye, wheat, etc.). Cabbage and other susceptible crops (cauliflower, beans, peas, etc.) should not be planted in fields where white mold has become a problem because continuous cropping of susceptible crops will result in a buildup of the fungus in the soil and increased disease incidence. Mechanical injuries to cabbage heads during harvesting operations should be avoided.\n" +
            "\n" +
            "Damping off (Pythium debaryanum): The disease causes severe damage in the nursery. Cool, cloudy weather, high humidity, wet soils, compacted soil, and overcrowding especially favor development of damping-off. Damping-off kills seedlings before or soon after they emerge. Infection before seedling emergence results in poor germination. If the decay is after seedlings emergence, they fall over or die which is referred to as \"damp-off.\" The destructiveness of the disease depends on the amount of pathogen in the soil and on environmental conditions. Seedlings that emerge develop a lesion near where the tender stem contacts the soil surface. The tissues beneath the lesion become soft due to which the seedlings collapse.\n" +
            "\n" +
            "Control: In the nursery, soil used for preparing raised beds should be well- drained. Excessive irrigation should be avoided to reduce humidity around the plants. Seed treatment with antagonist fungal culture of Trichoderma viride (3-4 g/kg of seed) or Thiram (2-3 g/kg of seed) and soil drenching with Dithane M 45 (0.2%) or Bavistin (0.1%) affords protection against the disease. The nursery should be regularly inspected for the disease affected seedlings. Such seedlings should be removed and destroyed.";
    String storage = " HARVEST AND STORAGE\n" +
            "HARVEST\n" +
            "•\tHarvest cabbage when the heads reach a usable size. To harvest, cut the head off above the outer leaves.\n" +
            "•\tOnce the heads reach their mature size, there is a risk that they will split before harvest. Some varieties are good for “field holding” and are less likely to split. Heavy rain can cause split heads. \n" +
            "•\tYou can minimize splitting of cabbages that you are not ready to pick by twisting the head a quarter turn or shearing one side of the roots with a spade. This action reduces water flow into the head. \n" +
            "•\tCabbage will tolerate below-freezing temperatures late in plant development. If overnight temperature lows are below 25°F, you can protect the heads with a row cover.\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabbage);

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
