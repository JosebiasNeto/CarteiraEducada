package com.example.carteiraeducada.ui.months.expenditure;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExpenditureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExpenditureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}