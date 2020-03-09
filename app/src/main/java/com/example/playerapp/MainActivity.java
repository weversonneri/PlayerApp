package com.example.playerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton button;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;

    MediaPlayer player;
    MediaPlayer player2;
    MediaPlayer player3;
    MediaPlayer player4;
    MediaPlayer player5;
    MediaPlayer player6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_player);
        button2 = findViewById(R.id.button_player2);
        button3 = findViewById(R.id.button_player3);
        button4 = findViewById(R.id.button_player4);
        button5 = findViewById(R.id.button_player5);
        button6 = findViewById(R.id.button_player6);

        player = MediaPlayer.create(this, R.raw.coolio);
        player2 = MediaPlayer.create(this, R.raw.travis);
        player3 = MediaPlayer.create(this, R.raw.gorillaz);
        player4 = MediaPlayer.create(this, R.raw.cube);
        player5 = MediaPlayer.create(this, R.raw.luniz);
        player6 = MediaPlayer.create(this, R.raw.vintage);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (player != null) {
            if (v.getId() == R.id.button_player) {
                if (!player.isPlaying()) {
                    player.start();
                    button.setImageResource(R.drawable.pause);
                } else {
                    player.pause();
                    button.setImageResource(R.drawable.play);
                }
            }

        }
        if (player2 != null) {
            if (v.getId() == R.id.button_player2) {
                if (!player2.isPlaying()) {
                    player2.start();
                    button2.setImageResource(R.drawable.pause);
                } else {
                    player2.pause();
                    button2.setImageResource(R.drawable.play);
                }
            }

        }
        if (player3 != null) {
            if (v.getId() == R.id.button_player3) {
                if (!player3.isPlaying()) {
                    player3.start();
                    button3.setImageResource(R.drawable.pause);
                } else {
                    player3.pause();
                    button3.setImageResource(R.drawable.play);
                }
            }

        }
        if (player4 != null) {
            if (v.getId() == R.id.button_player4) {
                if (!player4.isPlaying()) {
                    player4.start();
                    button4.setImageResource(R.drawable.pause);
                } else {
                    player4.pause();
                    button4.setImageResource(R.drawable.play);
                }
            }

        }
        if (player5 != null) {
            if (v.getId() == R.id.button_player5) {
                if (!player5.isPlaying()) {
                    player5.start();
                    button5.setImageResource(R.drawable.pause);
                } else {
                    player5.pause();
                    button5.setImageResource(R.drawable.play);
                }
            }

        }
        if (player6 != null) {
            if (v.getId() == R.id.button_player6) {
                if (!player6.isPlaying()) {
                    player6.start();
                    button6.setImageResource(R.drawable.pause);
                } else {
                    player6.pause();
                    button6.setImageResource(R.drawable.play);
                }
            }

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player = null;
        }
    }


}

