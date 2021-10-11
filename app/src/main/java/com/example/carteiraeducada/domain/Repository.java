package com.example.carteiraeducada.domain;

import com.example.carteiraeducada.data.Database.DatabaseDataSource;
import com.example.carteiraeducada.domain.model.Balance;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private DatabaseDataSource databaseDataSource;

    public Repository(DatabaseDataSource databaseDataSource){
        this.databaseDataSource = databaseDataSource;
    }

    public void insertBalance(Balance balance) {
        databaseDataSource.insertBalance(balance);
    }

    public Balance getBalance(int id) {
        return databaseDataSource.getBalance(id);
    }

    public void delBalance(int id) {
        databaseDataSource.delBalance(id);
    }

    public void insertFinCard(FinCard fincard) {
        databaseDataSource.insertFinCard(fincard);
    }

    public FinCard getFinCard(int id) {
        return databaseDataSource.getFinCard(id);
    }

    public void delFinCard(int id) {
        databaseDataSource.delFinCard(id);
    }

    public ArrayList<FinCard> getIncomes(boolean income) {
        return databaseDataSource.getIncomes();
    }

    public ArrayList<FinCard> getExpenses() {
        return databaseDataSource.getExpenses();
    }

}
