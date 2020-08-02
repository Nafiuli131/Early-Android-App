package com.example.nafiulislam.nsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NSUONLINE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsuonline);
    }
    public void faculty(View v)
    {
        Intent intent=new Intent(NSUONLINE.this,faculty.class);
        startActivity(intent);
    }
    public void student(View v)
    {
        Intent intent=new Intent(NSUONLINE.this,student.class);
        startActivity(intent);
    }
    public void online(View v)
    {
        Intent intent=new Intent(NSUONLINE.this,online.class);
        startActivity(intent);
    }
}
