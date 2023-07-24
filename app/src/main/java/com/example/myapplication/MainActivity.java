package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import static android.Manifest.permission.CALL_PHONE;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView imgview;
ImageView truckid;
    ImageView menu;
    ImageView call;
    TextView seeallproduct;
    ImageView shopone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        getSupportActionBar().hide();

        shopone=findViewById(R.id.shopone);
        shopone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getApplicationContext(),SingleShop.class);
                in.putExtra("info","shop 1");
                in.putExtra("image",R.drawable.banner);
                startActivity(in);
            }
        });

        call=findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9829139264"));
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(callIntent);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }

            }
        });
        seeallproduct = findViewById(R.id.seeallproduct);
        seeallproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"All product show",Toast.LENGTH_LONG).show();
                Intent  in = new Intent(getApplicationContext(),Product.class);
                startActivity(in);
            }
        });

        truckid = findViewById(R.id.truckid);
        truckid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Open Truck",Toast.LENGTH_LONG).show();
        }
        });
        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Open Menu",Toast.LENGTH_LONG).show();
            }
        });
        imgview = findViewById(R.id.cart);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Open screen Cart",Toast.LENGTH_LONG).show();
                Intent  in = new Intent(getApplicationContext(),CartScreen.class);
                startActivity(in);
            }
        });
    }
}