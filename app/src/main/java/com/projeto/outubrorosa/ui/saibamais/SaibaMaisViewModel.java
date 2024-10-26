package com.projeto.outubrorosa.ui.saibamais;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaibaMaisViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SaibaMaisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chamada para Ação.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}