package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Audio extends AppCompatActivity {

    ImageView play1,next2,prev1,left1,right1;
    MediaPlayer mp;
    int currentIndex=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);
        play1 =findViewById(R.id.play);
        next2 =findViewById(R.id.next1);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(R.raw.song1);
        arr.add(R.raw.song2);
        arr.add(R.raw.song3);
        mp = MediaPlayer.create(Audio.this,arr.get(currentIndex));

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currentIndex++;
                mp = MediaPlayer.create(Audio.this,arr.get(currentIndex));

            }
        });

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp!=null && mp.isPlaying()){
                    mp.pause();
                    play1.setImageResource(R.drawable.play);

                }
                else{

                    mp.start();
                    play1.setImageResource(R.drawable.pause);

                }
            }
        });


    }
}

