package com.example.nafiulislam.nsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class online extends AppCompatActivity {
WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        w=(WebView)findViewById(R.id.webview);
        w.loadUrl("http://apply.northsouth.edu:8080/admissionWeb/login.view");
    }
    public void onBackPressed()
    {
        if(w.canGoBack())
        {
            w.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
