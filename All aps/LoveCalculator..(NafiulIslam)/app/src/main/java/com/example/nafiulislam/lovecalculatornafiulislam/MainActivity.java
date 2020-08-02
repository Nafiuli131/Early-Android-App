package com.example.nafiulislam.lovecalculatornafiulislam;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
     TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        
    }
    public void thefunction(View V)
    {
        int g;

        g=(int) (Math.random()*100);

        t1.setText(Integer.toString(g)+"%");
    }
}
