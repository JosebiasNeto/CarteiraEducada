package com.example.carteiraeducada.data.Daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.carteiraeducada.domain.model.Balance;
import com.example.carteiraeducada.domain.model.FinCard;

@Dao
public interface FinCardDao {

    @Insert
    public void insertFinCard(FinCard fincard);

    @Query("SELECT * FROM fincards WHERE id = :id")
    public FinCard getFinCard(int id);

    @Query("DELETE FROM fincards WHERE id = :id")
    public void delFinCard(int id);

}
