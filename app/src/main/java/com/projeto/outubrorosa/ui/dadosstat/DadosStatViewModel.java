package com.projeto.outubrorosa.ui.dadosstat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DadosStatViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DadosStatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dados Estatísticos.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}