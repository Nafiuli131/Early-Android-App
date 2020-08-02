package com.example.nafiulislam.allbanglanewsinonesites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bangla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
    }
    public void thebutton(View v)
    {
        Intent intent=new Intent(Bangla.this,prothom.class);
        startActivity(intent);
    }
    public void thebutton2(View v)
    {
        Intent intent=new Intent(Bangla.this,ittefaq.class);
        startActivity(intent);
    }
    public void thebutton3(View v)
    {
        Intent intent=new Intent(Bangla.this,Kalerkontho.class);
        startActivity(intent);
    }



}
