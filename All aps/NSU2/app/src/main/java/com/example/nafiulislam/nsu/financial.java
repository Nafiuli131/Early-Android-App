package com.example.nafiulislam.nsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class financial extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);
        w=(WebView)findViewById(R.id.webview);
        w.loadUrl("http://www.northsouth.edu/finical-assistance/fao.html");
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
