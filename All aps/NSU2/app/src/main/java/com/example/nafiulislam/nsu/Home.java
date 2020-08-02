package com.example.nafiulislam.nsu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Home extends Activity {
WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        wb=(WebView)findViewById(R.id.WebView);
        wb.loadUrl("http://www.northsouth.edu/");
    }
    public void onBackPressed()
    {
        if(wb.canGoBack())
        {
            wb.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
