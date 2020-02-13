package com.example.reproductormultimedia.ui.playlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.reproductormultimedia.R;

public class PlaylistFragment extends Fragment {

    private PlaylistViewModel playlistViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        playlistViewModel =
                ViewModelProviders.of(this).get(PlaylistViewModel.class);
        View root = inflater.inflate(R.layout.playlist_fragment, container, false);

        return root;
    }
}
