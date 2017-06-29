package com.example.omc.tabview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Madhura on 7/8/2016.
 * */

public class LoginList extends ArrayAdapter<String> {
    private String[] username;
   // private String[] names;
    private String[] email;
    private Activity context;

    public LoginList(Activity context, String[] username, String[] email) {
        super(context, R.layout.login_list, username);
        this.context = context;
        this.username = username;

        this.email = email;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.login_list, null, true);
        //TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId1);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName1);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewEmail1);

        textViewName.setText(username[position]);
       // textViewName.setText(names[position]);
        textViewEmail.setText(email[position]);

        return listViewItem;
    }
}
