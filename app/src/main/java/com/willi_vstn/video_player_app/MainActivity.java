package com.willi_vstn.video_player_app;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    VideoView videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        videoView = findViewById(R.id.video_View1);
        videoView2 = findViewById(R.id.videoView2);

        //From local Storage
        videoView.setVideoPath("android.resource://" + getPackageName()+"/"+R.raw.sample_1280x720_surfing_with_audio);


        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

        //From Internet URLs
        Uri uri = Uri.parse("https://www.unscreen.com/assets/sample_videos/01_main-e0c5a9dc6ab103920a792d031e49f1020cf43429920bbe70a0b127ed0ebbf802.mp4");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();


    }
}