package com.example.carteiraeducada.ui.standardmonth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StandardMonthViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StandardMonthViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}