package com.example.reproductormultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MusicActivity extends AppCompatActivity {

    //PRIMERO SE INSTANCIA LA CLASE MEDIA PLAYER Y SE DEFINEN LOS BOTONES, ETC..
    MediaPlayer player;

    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;

    private TextView songTittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        //CON ESTE INTENT OBTENGO EL NOMBRE DE LA CANCION SELECCIONADA PROVENIENTE DEL FRAGMENT MUSICA Y LO PASO POR EL SWITCH PARA REPRODUCIR EL ARCHIVO ESPECIFICO.
        // TAMBIEN LO ENVIO AL TEXTVIEW PARA QUE APAREZCA EL TITULO DE LA CANCION
        final String song = getIntent().getExtras().getString("name");
        Toast.makeText(MusicActivity.this,song, LENGTH_SHORT).show();
        songTittle = findViewById(R.id.textViewSongTittle);

        switch (song){
            case "Back in Black":
                player = MediaPlayer.create(this, R.raw.backinblack);
                break;

            case "Hells Bells":
                player = MediaPlayer.create(this, R.raw.hellsbells);
                break;
        }




        //CODIGO DE LOS BOTONES PLAY, STOP Y PAUSE. EJECUTAN LA FUNCION DEL PLAYER Y LANZAN UN MENSAJE TOAST

        btnPlay = findViewById(R.id.buttonPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                songTittle.setText("Playing now..." + song);
                Toast.makeText(MusicActivity.this,"Play", LENGTH_SHORT).show();
            }
        });

        btnPause = findViewById(R.id.buttonPause);
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                Toast.makeText(MusicActivity.this,"Pause", LENGTH_SHORT).show();
            }
        });

        btnStop = findViewById(R.id.buttonStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();
                songTittle.setText("");
                Toast.makeText(MusicActivity.this,"Stop", LENGTH_SHORT).show();
            }
        });




    }
}
