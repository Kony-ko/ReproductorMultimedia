package com.example.reproductormultimedia.ui.photo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhotoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PhotoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Visor de imagenes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}