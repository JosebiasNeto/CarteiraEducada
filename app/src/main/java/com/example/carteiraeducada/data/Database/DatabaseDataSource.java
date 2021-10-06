package com.example.carteiraeducada.data.Database;

import com.example.carteiraeducada.data.Daos.BalanceDao;
import com.example.carteiraeducada.data.Daos.FinCardDao;
import com.example.carteiraeducada.domain.model.Balance;
import com.example.carteiraeducada.domain.model.FinCard;

public class DatabaseDataSource implements BalanceDao, FinCardDao {

    BalanceDao balanceDao;
    FinCardDao finCardDao;

    @Override
    public void insertBalance(Balance balance) {
        balanceDao.insertBalance(balance);
    }

    @Override
    public Balance getBalance(int id) {
        return balanceDao.getBalance(id);
    }

    @Override
    public void delBalance(int id) {
        balanceDao.delBalance(id);
    }

    @Override
    public void insertFinCard(FinCard fincard) {
        finCardDao.insertFinCard(fincard);
    }

    @Override
    public FinCard getFinCard(int id) {
        return finCardDao.getFinCard(id);
    }

    @Override
    public void delFinCard(int id) {
        finCardDao.delFinCard(id);
    }
}
