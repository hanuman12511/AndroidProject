package com.example.myapplication;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.security.Permission;
import java.util.ArrayList;

public class DrawerScreen  extends AppCompatActivity {
String data[] = {"Form","ImageView","Video","Audio"};
    String data1[] = {"Form1","ImageView1","Video1","Audio1"};
    ArrayList<String> myList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        ListView lv = findViewById(R.id.listid);
//ArrayView ar = new ArrayView(this,data,data1);
      // ArrayAdapter<String> str = new ArrayAdapter<>(getApplicationContext(),R.layout.item_list,R.id.tv1,data);
//lv.setAdapter(ar);
        myList = new ArrayList<>();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),"helll11",Toast.LENGTH_LONG).show();
                String state = Environment.getExternalStorageState();
                if (Environment.MEDIA_MOUNTED.equals(state)) {
                    Toast.makeText(getApplicationContext(),"helll1",Toast.LENGTH_LONG).show();
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (checkPermission()) {
                            File dir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/");
                            if (dir.exists()) {
                                Toast.makeText(getApplicationContext(),"helll",Toast.LENGTH_LONG).show();
                                Log.d("path", dir.toString());
                                File list[] = dir.listFiles();
                                for (int j = 0; j < list.length; j++) {
                                    myList.add(list[j].getName());
                                }
                                ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, myList);
                                lv.setAdapter(arrayAdapter);
                            }
                        } else {
                            // Code for permission
                            Toast.makeText(getApplicationContext(),"helllelse",Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(),"helllelsedsds",Toast.LENGTH_LONG).show();
                        File dir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/");
                        if (dir.exists()) {
                            Log.d("path", dir.toString());
                            File list[] = dir.listFiles();
                            for (int k = 0; k < list.length; k++) {
                                myList.add(list[k].getName());
                            }
                            ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, myList);
                            lv.setAdapter(arrayAdapter);
                        }
                    }
                }
            }
        });
    }
    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(DrawerScreen.this,          android.Manifest.permission.READ_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }

    }



}
