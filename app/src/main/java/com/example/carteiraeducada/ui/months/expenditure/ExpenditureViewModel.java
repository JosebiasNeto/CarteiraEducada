package com.example.carteiraeducada.ui.months.expenditure;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.carteiraeducada.data.Database.DatabaseDataSource;
import com.example.carteiraeducada.domain.Repository;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;
import java.util.List;

public class ExpenditureViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<List<FinCard>> expenses;
    private Repository repository;

    public ExpenditureViewModel() {
        expenses = new MutableLiveData<>();
    }
    public LiveData<List<FinCard>> getFinCards(){
        expenses.setValue(repository.getExpenses());
        return expenses;
    }


}