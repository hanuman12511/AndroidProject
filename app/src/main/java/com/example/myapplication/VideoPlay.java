package com.example.myapplication;

import android.net.Uri;
        import android.os.Bundle;
        import android.app.Activity;
import android.os.Environment;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoPlay extends Activity {
ListView l;
String name[]={"user","user2","user3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoview);
l = findViewById(R.id.list1);
        ArrayAdapter<String> aa= new ArrayAdapter<>(getApplicationContext(),R.layout.item_list,R.id.tv1,name);
        l.setAdapter(aa);
        VideoView videoView =(VideoView)findViewById(R.id.videoView1);

        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

int s= R.raw.a2;
        //Location of Media File

        Uri uri = Uri.parse( "https://youtu.be/x1OYHA7gujE");
//        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + s);

//Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        //specify the location of media file
      /*  Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/Download/a.mp4");
        Toast.makeText(this,""+uri,Toast.LENGTH_LONG).show();

        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();*/

        //Setting MediaController and URI, then starting the videoView
      /*  videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();*/

    }


}