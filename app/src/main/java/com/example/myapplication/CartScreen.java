package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CartScreen  extends AppCompatActivity {

        ImageView imageid;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cart_activity);
            getSupportActionBar().hide();
            imageid=findViewById(R.id.menu);
            imageid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            });

        }
    }