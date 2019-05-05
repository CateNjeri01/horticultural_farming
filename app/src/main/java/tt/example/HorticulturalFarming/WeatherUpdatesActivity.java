package tt.example.HorticulturalFarming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WeatherUpdatesActivity extends AppCompatActivity {
    private TextView t1, t2, t3, t4, t5,t6,t7,t8,t9;
    private WebView webv;
    private Button btn;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_weather_updates);
        t1 = (TextView) findViewById(R.id.date);
        t2 = (TextView) findViewById(R.id.city);
        t3 = (TextView) findViewById(R.id.descr);
        t4 = (TextView) findViewById(R.id.temp);
        t5 = (TextView) findViewById(R.id.yawa);
        t6 = (TextView) findViewById(R.id.humidity);
        t7 = (TextView) findViewById(R.id.dewpoint);
        t8 = (TextView) findViewById(R.id.windspeed);
        t9 = (TextView) findViewById(R.id.summary);
        //btn = (Button) findViewById(R.id.button);
        find_weather();



    }



    public void Toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();

    }

    public void weather(View view) {

    }

    public void find_weather() {

        String url = "https://api.darksky.net/forecast/10238ea0586ddb322550eee1a7a56d89/-0.6773, 34.7796";
        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject main_object = response.getJSONObject("currently");
                    String temperature = String.valueOf(main_object.getString("temperature"));
                    String dewPoint = String.valueOf(main_object.getString("dewPoint"));
                    String humidity = String.valueOf(main_object.getString("humidity"));
                    String pressure = String.valueOf(main_object.getString("pressure"));
                    String summary = String.valueOf(main_object.getString("summary"));
                    String windspeed = String.valueOf(main_object.getString("windSpeed"));
                    //String description = object.getString("description");
                    //String city = response.getString("name");
                    t4.setText(temperature);
                    t2.setText(pressure);
                    t6.setText(humidity) ;
                    t7.setText(dewPoint);
                    t8.setText(windspeed);
                    t9.setText(summary);

                    //hourly
                    JSONObject h_object = response.getJSONObject("hourly");
                    JSONArray arr = h_object.getJSONArray("data");

                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                    StringBuilder hourlyText = new StringBuilder();
                    for (int i = 0; i < arr.length(); i++) {
                        JSONObject hourlyData = arr.getJSONObject(i);
                        long longTime = hourlyData.getLong("time") * 1000;
                        String time = simpleDateFormat.format(new Date(longTime));
                        Log.d("Setting", time);
                        hourlyText.append(time).append(": ").append(hourlyData.getString("summary")).append("\n");
                        //   t1.setText(x);
                    }

                    t3.setText(hourlyText.toString());

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat adf = new SimpleDateFormat("EEEE-MM-dd", Locale.getDefault());
                    String formatted_date = adf.format(calendar.getTime());
                    t1.setText(formatted_date);


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

            }
        }
        );

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = mAuth.getCurrentUser();

        if (user == null) {
            startActivity(new Intent(this, LogInActivity.class));
            finish();
        }
    }
}