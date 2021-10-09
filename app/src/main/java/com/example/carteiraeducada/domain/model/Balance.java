package com.example.carteiraeducada.domain.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "balances")
public class Balance {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public float previousMonth;
    public float remainingMoney;
    public float emergencyReserve;
    public float moveInReserve;
    public float currentReserve;
    public float availableMoney;
    public float expenseThisMonth;

    public Balance(){

        availableMoney = remainingMoney - moveInReserve;
        currentReserve = emergencyReserve + moveInReserve;
    }

}

