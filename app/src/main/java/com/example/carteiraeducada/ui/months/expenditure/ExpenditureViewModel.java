package com.example.carteiraeducada.ui.months.expenditure;

import static org.koin.java.KoinJavaComponent.inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.carteiraeducada.data.Database.DatabaseDataSource;
import com.example.carteiraeducada.domain.Repository;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kotlin.Lazy;

public class ExpenditureViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<ArrayList<FinCard>> expenses;
    private Lazy<Repository> repository = inject(Repository.class);

    public ExpenditureViewModel() {
        expenses = new MutableLiveData<>();
    }
    public LiveData<ArrayList<FinCard>> getFinCards(){
        if(repository.getValue().getExpenses() != null){
            expenses.setValue(repository.getValue().getExpenses());
        } else {
            expenses.setValue(new ArrayList<FinCard>());
        }
            return expenses;
    }


}