package com.projeto.outubrorosa.ui.mitoverdade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MitoVerdadeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MitoVerdadeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mitos Vs. Verdade.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}