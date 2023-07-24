package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SingleShop  extends AppCompatActivity {
ImageView img;
int Image;
TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleshop);
        Intent in = getIntent();
        String str = in.getStringExtra("info");

        tv=findViewById(R.id.s1);
        tv.setText(str);

        Bundle bu=getIntent().getExtras();
        if(bu!=null){
           Image=bu.getInt("image");
        }
        img=findViewById(R.id.image1);
        img.setImageResource(Image);

        WebView wv=findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.google.com");


    }
}
