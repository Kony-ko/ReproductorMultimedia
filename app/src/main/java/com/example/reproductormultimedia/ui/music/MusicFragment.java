package com.example.reproductormultimedia.ui.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.reproductormultimedia.MusicActivity;
import com.example.reproductormultimedia.R;

public class MusicFragment extends Fragment {

    private MusicViewModel musicViewModel;
    View view;

    private CardView song1;
    private CardView song2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        musicViewModel =
                ViewModelProviders.of(this).get(MusicViewModel.class);

        //EN EL METODO ONCREATEVIEW SE DEVUELVE UNA VISTA....
        view = inflater.inflate(R.layout.fragment_music, container, false);

        //CODIGO DE LAS CARDVIEW QUE AL PULSARLAS LLAMAN A LA MUSIC ACTIVITY CON INTENT, PASANDO UN STRING CON EL NOMBRE DE LA CANCION (PARA EL SWITCH)

        song1 = view.findViewById(R.id.cardviewSong1);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String songName = "Back in Black";
                Intent intent = new Intent(getActivity().getApplication(), MusicActivity.class);
                intent.putExtra("name",songName.toString());
                startActivity(intent);
            }
        });

        song2 = view.findViewById(R.id.cardviewSong2);
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String songName = "Hells Bells";
                Intent intent = new Intent(getActivity().getApplication(), MusicActivity.class);
                intent.putExtra("name",songName.toString());
                startActivity(intent);
            }
        });

        return view;
    }
}