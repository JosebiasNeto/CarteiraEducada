package com.example.carteiraeducada.data.Daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.carteiraeducada.domain.model.Balance;

@Dao
public interface BalanceDao {

    @Insert
    public void insertBalance(Balance balance);

    @Query("SELECT * FROM balances WHERE id = :id")
    public Balance getBalance(int id);

    @Query("DELETE FROM balances WHERE id = :id")
    public void delBalance(int id);

}
