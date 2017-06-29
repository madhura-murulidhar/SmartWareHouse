package com.example.omc.tabview;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Madhura on 7/8/2016.
 */
public class ParseJSON1 {
    //public static String[] ids;
    public static String[] username;
    public static String[] email;

    public static final String JSON_ARRAY = "result";
   // public static final String KEY_ID = "id";
    public static final String KEY_NAME = "username";
    public static final String KEY_EMAIL = "email";

    private JSONArray users = null;

    private String json;

    public ParseJSON1(String json){
        this.json = json;
    }

    protected void parseJSON1(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

           // ids = new String[users.length()];
            username = new String[users.length()];
            email = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                //ids[i] = jo.getString(KEY_ID);
                username[i] = jo.getString(KEY_NAME);
                email[i] = jo.getString(KEY_EMAIL);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
