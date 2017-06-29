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
 * Created by Madhura on 7/8/2016.
 */
public class jsonImpl extends AppCompatActivity implements View.OnClickListener {
    public static final String JSON_URL = "http://192.168.217.1/list.php";

    private Button buttonGet1;

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.json2);

        buttonGet1 = (Button) findViewById(R.id.buttonGet1);
        buttonGet1.setOnClickListener(this);
        listView1 = (ListView) findViewById(R.id.listView1);
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
                        Toast.makeText(jsonImpl.this,error.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json){
        ParseJSON1 pj = new ParseJSON1(json);
        pj.parseJSON1();
        LoginList cl = new LoginList(this,ParseJSON1.username,ParseJSON1.email);
        listView1.setAdapter(cl);
    }

    @Override
    public void onClick(View v) {
        sendRequest();
    }
}
