package com.example.sandy.daanyaalsounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer oh_fuckSoundMP = MediaPlayer.create(this, R.raw.oh_fuck);

        Button oh_fuck = (Button) this.findViewById(R.id.oh_fuck);

        oh_fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                oh_fuckSoundMP.start();
            };
        });


        final MediaPlayer ballsSoundMP = MediaPlayer.create(this, R.raw.balls);

        Button balls = (Button) this.findViewById(R.id.balls);

        balls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ballsSoundMP.start();
            };
        });

        final MediaPlayer step_1SoundMP = MediaPlayer.create(this, R.raw.step_1);

        Button step_1 = (Button) this.findViewById(R.id.step_1);

        step_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                step_1SoundMP.start();
            };
        });

    final MediaPlayer aghSoundMP = MediaPlayer.create(this, R.raw.agh);

    Button agh = (Button) this.findViewById(R.id.agh);

    agh.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            aghSoundMP.start();
        };
    });

    }
}
