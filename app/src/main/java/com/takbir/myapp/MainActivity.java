package com.takbir.myapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // সরাসরি একটি ওয়েবভিউ তৈরি করা হচ্ছে
        myWebView = new WebView(this);
        setContentView(myWebView);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);

        myWebView.setWebViewClient(new WebViewClient());

        // এই REPLACE_ME_URL লেখাটি গিটহাব অ্যাকশন অটোমেটিক পরিবর্তন করে আপনার লিঙ্ক বসিয়ে দেবে
        myWebView.loadUrl("REPLACE_ME_URL");
    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
