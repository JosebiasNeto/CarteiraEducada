package com.example.carteiraeducada.data.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.carteiraeducada.data.Daos.BalanceDao;
import com.example.carteiraeducada.data.Daos.FinCardDao;
import com.example.carteiraeducada.domain.model.Balance;
import com.example.carteiraeducada.domain.model.FinCard;

@Database(entities = {Balance.class, FinCard.class}, version = 1)
public abstract class CEDatabase extends RoomDatabase {
    public abstract BalanceDao balanceDao();
    public abstract FinCardDao finCardDao();

    private static CEDatabase INSTANCE = null;

    public static CEDatabase getDatabase(Context context){
        CEDatabase tempInstance = INSTANCE;
        if(tempInstance != null){
            return tempInstance;
        }
        synchronized (context.getApplicationContext()){
            CEDatabase instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    CEDatabase.class,
                    "cedatabase"
            ).build();
            INSTANCE = instance;
            return instance;
        }
    }
}
