package com.example.a120webviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView webView = (WebView) findViewById(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient()); //Imp to open in our app else opens in chrome or deAULT browser

        webView.loadUrl("https://vtop.vit.ac.in/vtop/initialProcess");

       webView.loadData("<html><body><h1>Hi there!</h1><p>This is my website.</p></body></html>", "text/html", "UTF-8");




    }
}
