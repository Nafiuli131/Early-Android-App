package com.example.nafiulislam.allbanglanewsinonesites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Kalerkontho extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalerkontho);
        w=(WebView)findViewById(R.id.webview);
        w.setWebViewClient(new WebViewClient());

        WebSettings websetting=w.getSettings();
        websetting.setJavaScriptEnabled(true);
        w.loadUrl("http://www.kalerkantho.com/index.php");
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
