package com.example.playerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    ImageButton button2;
    MediaPlayer player;
    MediaPlayer player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_player);
        button2 = findViewById(R.id.button_player2);
        player = MediaPlayer.create(this, R.raw.music);
        player2 = MediaPlayer.create(this, R.raw.music2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (player2 != null) {
            if (v.getId() == R.id.button_player) {
                if (!player.isPlaying()) {
                    player.start();
                    button.setText("Pausar");
                } else {
                    player.pause();
                    button.setText("Tocar");
                }
            } else if (v.getId() == R.id.button_player2) {
                if (!player2.isPlaying()) {
                    player2.start();
                    button2.setImageResource(R.drawable.pause);
                } else {
                    player2.pause();
                    button2.setImageResource(R.drawable.play);
                }
            }

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player2 != null) {
            player2 = null;
        }
    }



}

