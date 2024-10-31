package com.projeto.outubrorosa.ui.guiaautoexame;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GuiaAutoexameViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GuiaAutoexameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Guia de Autoexame");
    }

    public LiveData<String> getText() {
        return mText;
    }
}