package com.projeto.outubrorosa.ui.fatoresrisco;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FatoresRiscoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FatoresRiscoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fatores de Risco.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}