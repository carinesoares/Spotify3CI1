package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
MediaPlayer player;
ImageView coverImage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player= MediaPlayer.create(getApplicationContext(),R.raw.musica);
        coverImage=findViewById(R.id.blackpink);
        Glide.with(this).load( "https://img.youtube.com/vi/27h9SJcIdM0/0.jpg").into(coverImage);
    }
    public void onResume() {
        super.onResume();
    }
    public void play(View view) {
        player.start();
    }
}