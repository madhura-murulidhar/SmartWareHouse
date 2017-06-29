package com.example.omc.tabview;

/**
 * Created by OMC on 14-07-2016.
 */
 import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.content.Context;
        import android.content.DialogInterface;
 import android.content.Intent;
 import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.TextView;

public class about extends Activity {

    final Context context = this;
    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        button = (Button) findViewById(R.id.button16);

        // add button listener
        button.setOnClickListener(new OnClickListener() {

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


                textView.setText("ABOUT \n \nThis app can be used for Warehouse Management.\n It gives information about the level of items present in the container.\n" +
                                "\nAn ultrasonic sensor which is placed at the top of the container will detect the level of the item in the container." +
                                "\nHe/she can know the level of the container and determine whether the container is to be reloaded." +
                                "\nHe/She can see the level of the item in all the containers using the app." +
                                "\nSo the warehouse manager need not go and spend time checking the level of the item in each and every container." +
                                "\nHe/She just has to reload the container which is empty."
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
