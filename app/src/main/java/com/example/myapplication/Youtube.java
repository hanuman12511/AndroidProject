package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ListView;

public class Youtube extends Activity {
  WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube);
        wv =findViewById(R.id.you);

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TX6T60VVPx4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        wv.loadData(video,"text/html","utf-8");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebChromeClient(new WebChromeClient());


    }
}