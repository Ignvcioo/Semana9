package com.example.semana9;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView miVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miVideo = findViewById(R.id.video);

        String video = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(video);
        miVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        miVideo.setMediaController(mediaController);
        mediaController.setAnchorView(miVideo);
    }
}