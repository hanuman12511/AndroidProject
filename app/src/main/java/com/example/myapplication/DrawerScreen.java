package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DrawerScreen  extends AppCompatActivity {
String data[] = {"Form","ImageView","Video","Audio"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        ListView lv = findViewById(R.id.listid);
ArrayView ar = new ArrayView(this,data);
     //   ArrayAdapter<String> str = new ArrayAdapter<>(getApplicationContext(),R.layout.item_list,R.id.tv1,data);
lv.setAdapter(ar);

    }
}
