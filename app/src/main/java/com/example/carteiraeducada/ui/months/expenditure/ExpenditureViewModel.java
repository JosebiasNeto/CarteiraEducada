package com.example.carteiraeducada.ui.months.expenditure;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.carteiraeducada.data.Database.CEDatabase;
import com.example.carteiraeducada.data.Database.DatabaseDataSource;
import com.example.carteiraeducada.di.CEComponent;
import com.example.carteiraeducada.di.RepositoryModule;
import com.example.carteiraeducada.domain.Repository;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;

import javax.inject.Inject;


public class ExpenditureViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<ArrayList<FinCard>> expenses = new MutableLiveData<>();

    @Inject
    public ExpenditureViewModel(DatabaseDataSource databaseDataSource) {
        repository = new Repository(databaseDataSource);
    }

    public void loadExpenses(){
        expenses.setValue(repository.getExpenses());
    }

    public MutableLiveData<ArrayList<FinCard>> getFinCards(){
        if(repository.getExpenses() != null){
           loadExpenses();
           return expenses;
        }
           return expenses;
   }


}