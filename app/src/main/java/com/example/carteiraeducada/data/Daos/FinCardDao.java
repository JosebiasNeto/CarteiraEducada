package com.example.carteiraeducada.data.Daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.carteiraeducada.domain.model.Balance;
import com.example.carteiraeducada.domain.model.FinCard;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface FinCardDao {

    @Insert
    void insertFinCard(FinCard fincard);

    @Query("SELECT * FROM fincards WHERE id = :id")
    FinCard getFinCard(int id);

    @Query("DELETE FROM fincards WHERE id = :id")
    void delFinCard(int id);

    @Query("SELECT * FROM fincards WHERE income = 1")
    List<FinCard> getIncomes();

    @Query("SELECT * FROM fincards WHERE income = 0")
    List<FinCard> getExpenses();

}
