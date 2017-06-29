package com.example.omc.tabview;

/**
 * Created by Madhura on 7/5/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by Madhura on 6/23/2016.
 */

/**
 * Created by Belal on 9/22/2015.
 */

public class CustomList extends ArrayAdapter<String> {
    private String[] id1;
    private String[] level1;
    private String[] per1;
   /* private String[] id2;
    private String[] level2;
    private String[] per2;*/
    private Activity context;

    public CustomList(Activity context, String[] id1, String[] level1, String[] per1) {
        super(context, R.layout.list_view_layout, id1);
        this.context = context;
        this.id1 = id1;
        this.level1 = level1;
        this.per1 = per1;
       /* this.id2 = id2;
        this.level2 = level2;
        this.per2 = per2;*/
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);
        TextView textViewId1 = (TextView) listViewItem.findViewById(R.id.textViewId1);
        TextView textViewLevel1 = (TextView) listViewItem.findViewById(R.id.textViewLevel1);
        TextView textViewPer1 = (TextView) listViewItem.findViewById(R.id.textViewPer1);
       /* TextView textViewId2 = (TextView) listViewItem.findViewById(R.id.textViewId2);
        TextView textViewLevel2 = (TextView) listViewItem.findViewById(R.id.textViewLevel2);
        TextView textViewPer2 = (TextView) listViewItem.findViewById(R.id.textViewPer2);*/

        textViewId1.setText(id1[position]);
        textViewLevel1.setText(level1[position]);
        textViewPer1.setText(per1[position]);
      /*  textViewId2.setText(id2[position]);
        textViewLevel2.setText(level2[position]);
        textViewPer2.setText(per2[position]);*/

        return listViewItem;
    }
}