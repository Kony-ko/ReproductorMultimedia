package com.example.reproductormultimedia.ui.photo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.reproductormultimedia.R;

public class PhotoFragment extends Fragment {

    private PhotoViewModel photoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        photoViewModel =
                ViewModelProviders.of(this).get(PhotoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_photo, container, false);

        return root;
    }
}