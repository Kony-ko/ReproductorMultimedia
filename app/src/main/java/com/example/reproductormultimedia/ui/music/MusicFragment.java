package com.example.reproductormultimedia.ui.music;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.reproductormultimedia.R;

import java.io.IOException;

import static android.widget.Toast.LENGTH_SHORT;

public class MusicFragment extends Fragment {

    private MusicViewModel musicViewModel;
    View root;

    MediaPlayer player;
    Context context;

    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        musicViewModel =
                ViewModelProviders.of(this).get(MusicViewModel.class);
        root = inflater.inflate(R.layout.fragment_music, container, false);


        final TextView textView = root.findViewById(R.id.text_music);
        musicViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        player = MediaPlayer.create(getContext(), R.raw.backinblack);

        btnPlay = root.findViewById(R.id.buttonPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                Toast.makeText(getContext(),"Playing", LENGTH_SHORT).show();
            }
        });

        btnPause = root.findViewById(R.id.buttonPlay);
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                Toast.makeText(getContext(),"Pause", LENGTH_SHORT).show();
            }
        });

        btnStop = root.findViewById(R.id.buttonPlay);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();
                Toast.makeText(getContext(),"Stopped", LENGTH_SHORT).show();
            }
        });









        return root;
    }
}