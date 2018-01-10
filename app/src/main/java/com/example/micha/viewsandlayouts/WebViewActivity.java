package com.example.micha.viewsandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://developer.android.com";
    private WebView web;
    private WebSettings settings;
    private WebViewClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        bindWebView();
        settings = web.getSettings();
        client = new WebViewClient();
        settings.setJavaScriptEnabled(true);
        web.setWebViewClient(client);

        web.loadUrl(BASE_URL);
    }

    private void bindWebView() {
        web = findViewById(R.id.wvMain);
    }
}
