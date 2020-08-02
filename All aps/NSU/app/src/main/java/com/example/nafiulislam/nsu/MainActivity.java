package com.example.nafiulislam.nsu;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void about(View v)
    {
        Intent intent=new Intent(MainActivity.this,About.class);
        startActivity(intent);
    }
    public void NSUONLINE(View v)
    {
        Intent intent=new Intent(MainActivity.this,NSUONLINE.class);
        startActivity(intent);
    }
    public void onBackPressed()

    {
       final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("NSU Message");
        builder.setMessage("Are you sure want to exit NSU");
        builder.setCancelable(true);
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

}
