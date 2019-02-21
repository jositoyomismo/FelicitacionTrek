package com.miejemplo.felicitaciontrek;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"trekarrowcaps.ttf");
        TextView titulo = findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.star_trek);
        mediaPlayer.start();


    }
}
