package com.example.omc.tabview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class open extends Activity {

    final Context context = this;
    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        button = (Button) findViewById(R.id.buttonlib);

        // add button listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
//                AlertDialog.Builder adb = new AlertDialog.Builder(context);
//                adb.setTitle("About");


                // adb.setTitle("Finished!");
//                adb
//                .setMessage("+"I've decided not to force a media rescan because depending on your device, "
//                        +"it may or may not even be possible. "
//                        +"This means that you will need to reboot your device or unmount/mount your sdcard in the Settings app before most players will pull in all the information for the songs."
//                        +"\n Please reboot or rescan before claiming that the app did not work.")
//                .setCancelable(false)
//                        .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.dismiss();
//
//                            }
//                        });
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
                TextView textView = new TextView(context);


                textView.setText("reference:\n\n1.part of aurdino code:instructables.com"+"\n\n2.software:simplifiedcode"+"\n\n3.recyclerview:com.android.volley:volley:1.0.0"+"\n\n4. design:com.android.support:design:23.3.0"
                                    );
                dialogBuilder.setCustomTitle(textView);
                //  Dialog d = adb.setView(new View(context)).create();
                Dialog d = dialogBuilder.setView(new View(context)).create();
                // (That new View is just there to have something inside the dialog that can grow big enough to cover the whole screen.
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(d.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;

                d.show();
                d.getWindow().setAttributes(lp);



            }
        });
    }
}
