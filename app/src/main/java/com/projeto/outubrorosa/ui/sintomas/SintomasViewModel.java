package com.projeto.outubrorosa.ui.sintomas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SintomasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SintomasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Sintomas.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}