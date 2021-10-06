package com.example.carteiraeducada.domain.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "balances")
public class Balance {
    @PrimaryKey(autoGenerate = true)
    int id;
    Float previousMonth;
    Float remainingMoney;
    Float emergencyReserve;
    Float moveInReserve;
    Float currentReserve;
    Float availableMoney;
    Float expenseThisMonth;

    public Balance(){
        availableMoney = remainingMoney + previousMonth - moveInReserve;
        currentReserve = emergencyReserve + moveInReserve;
    }

}

