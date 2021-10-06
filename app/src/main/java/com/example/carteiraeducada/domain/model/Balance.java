package com.example.carteiraeducada.domain.model;

public class Balance {

    Float previousMonth;
    Float remainingMoney;
    Float emergencyReserve;
    Float moveInReserve;//
    Float currentReserve;
    Float availableMoney;
    Float expenseThisMonth;//

    public Balance(){
        availableMoney = remainingMoney + previousMonth - moveInReserve;
        currentReserve = emergencyReserve + moveInReserve;
    }

}

