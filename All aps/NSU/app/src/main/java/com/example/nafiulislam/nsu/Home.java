package com.example.nafiulislam.nsu;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Home extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        wb=(WebView)findViewById(R.id);
        wb.loadUrl("http://www.northsouth.edu/");
    }
}
