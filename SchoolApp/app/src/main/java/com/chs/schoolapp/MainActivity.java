package com.chs.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private android.webkit.WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.webkit.WebView myWebView = (android.webkit.WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient((new WebViewClient()));
        myWebView.loadUrl("https://veevyo.github.io/mobileappdev");
        android.webkit.WebSettings myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);



    }
    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }






}