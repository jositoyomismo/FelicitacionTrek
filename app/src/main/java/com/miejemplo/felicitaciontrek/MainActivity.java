package com.miejemplo.felicitaciontrek;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"trekarrowcaps.ttf");
        TextView titulo = findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.star_trek);
        mediaPlayer.start();



    }
}
