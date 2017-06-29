package com.example.omc.tabview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OMC on 14-07-2016.
 */
public class layoutclass extends AppCompatActivity implements View.OnClickListener {

    private Button buttonclick2;
    private Button buttonclick1;
    private Button buttonclick3;
    private Button buttonclick4;
    private Button buttonclick5;
    private Button buttonclick6;
    private Button buttonclick7;
    private Button buttonclick8;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);



        buttonclick1 = (Button) findViewById(R.id.button12);
        buttonclick2 = (Button) findViewById(R.id.button13);
        buttonclick3 = (Button) findViewById(R.id.button14);
        buttonclick4 = (Button) findViewById(R.id.button20);
        buttonclick5 = (Button) findViewById(R.id.button16);
        buttonclick6= (Button) findViewById(R.id.buttonDisc);
        buttonclick7=(Button) findViewById(R.id.buttonCredits);
        buttonclick8=(Button) findViewById(R.id.buttonlib);

        buttonclick1.setOnClickListener(this);
        buttonclick2.setOnClickListener(this);
        buttonclick3.setOnClickListener(this);
        buttonclick4.setOnClickListener(this);
        buttonclick5.setOnClickListener(this);
        buttonclick6.setOnClickListener(this);
        buttonclick7.setOnClickListener(this);
        buttonclick8.setOnClickListener(this);
    }


       @Override
    public void onClick (View v){

        if (v == buttonclick1) {
            startActivity(new Intent(this, json.class));
        }

           if (v == buttonclick2) {
               startActivity(new Intent(this, viewlist.class));
           }
           if (v == buttonclick3) {
               startActivity(new Intent(this, jsonImpl.class));
           }
           if (v == buttonclick4) {
               startActivity(new Intent(this, json2.class));
           }
           if (v == buttonclick5) {
               startActivity(new Intent(this, about.class));
           }
           if (v == buttonclick6) {
               startActivity(new Intent(this, disclaimer.class));
           }
           if (v == buttonclick7) {
               startActivity(new Intent(this, developers.class));
           }
           if (v == buttonclick8) {
               startActivity(new Intent(this, open.class));
           }
    }
}
