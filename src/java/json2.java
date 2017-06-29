package com.example.omc.tabview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by agasthyahd on 7/18/2016.
 */
public class json2 extends AppCompatActivity implements View.OnClickListener{
    public static final String JSON_URL = "http://192.168.217.1/wheat.php";

    private Button buttonGet2;

    private ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.json3);

        buttonGet2 = (Button) findViewById(R.id.buttonGet2);
        buttonGet2.setOnClickListener(this);
        listView2 = (ListView) findViewById(R.id.listView2);
    }

    private void sendRequest(){

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(json2.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json){
        ParseJSON2 pj = new ParseJSON2(json);
        pj.parseJSON2();
        Customjson cl = new Customjson(this, ParseJSON2.id2, ParseJSON2.level2, ParseJSON2.per2);
        listView2.setAdapter(cl);
    }

    @Override
    public void onClick(View v) {
        sendRequest();
    }
}
