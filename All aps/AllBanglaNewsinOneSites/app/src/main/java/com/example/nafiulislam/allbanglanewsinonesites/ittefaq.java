package com.example.nafiulislam.allbanglanewsinonesites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ittefaq extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ittefaq);
        w=(WebView)findViewById(R.id.webview1);
        w.setWebViewClient(new WebViewClient());
        WebSettings websetting=w.getSettings();
        websetting.setJavaScriptEnabled(true);
        w.loadUrl("http://www.ittefaq.com.bd/");
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
