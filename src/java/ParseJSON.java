package com.example.omc.tabview;

/**
 * Created by Madhura on 7/5/2016.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class ParseJSON {
    public static String[] id1;
    public static String[] level1;
    public static String[] per1;
   /* public static String[] id2;
    public static String[] level2;
    public static String[] per2;
*/
    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID1 = "id1";
    public static final String KEY_LEVEL1 = "level1";
    public static final String KEY_PER1 = "per1";
  /*  public static final String KEY_ID2 = "id2";
    public static final String KEY_LEVEL2 = "level2";
    public static final String KEY_PER2 = "per2";*/

    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            id1 = new String[users.length()];
            level1 = new String[users.length()];
            per1 = new String[users.length()];
          /*  id2 = new String[users.length()];
            level2 = new String[users.length()];
            per2 = new String[users.length()];
*/
            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                id1[i] = jo.getString(KEY_ID1);
                level1[i] = jo.getString(KEY_LEVEL1);
                per1[i] = jo.getString(KEY_PER1);
                /*id2[i] = jo.getString(KEY_ID2);
                level2[i] = jo.getString(KEY_LEVEL2);
                per2[i] = jo.getString(KEY_PER2);*/
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

