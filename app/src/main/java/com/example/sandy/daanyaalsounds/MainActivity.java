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
        final MainActivity main = this;

        Button oh_fuck = (Button) this.findViewById(R.id.oh_fuck);

        oh_fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer oh_fuckSoundMP = MediaPlayer.create(main, R.raw.oh_fuck);
                oh_fuckSoundMP.start();
            };
        });


        Button balls = (Button) this.findViewById(R.id.balls);

        balls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ballsSoundMP = MediaPlayer.create(main, R.raw.balls);
                ballsSoundMP.start();
            };
        });


        Button step_1 = (Button) this.findViewById(R.id.step_1);

        step_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer step_1SoundMP = MediaPlayer.create(main, R.raw.step_1);
                step_1SoundMP.start();
            }

            ;
        });


        Button agh = (Button) this.findViewById(R.id.agh);

        agh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer aghSoundMP = MediaPlayer.create(main, R.raw.agh);
                aghSoundMP.start();
            };
        });

    }
}
