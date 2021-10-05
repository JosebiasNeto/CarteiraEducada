package com.example.carteiraeducada.ui.months.expenditure;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExpenditureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExpenditureViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
    public void setText(String text){
        mText.setValue(text);
    }
}