package com.example.carteiraeducada.di;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;

import com.example.carteiraeducada.data.Daos.BalanceDao;
import com.example.carteiraeducada.data.Daos.FinCardDao;
import com.example.carteiraeducada.data.Database.CEDatabase;
import com.example.carteiraeducada.data.Database.DatabaseDataSource;
import com.example.carteiraeducada.domain.Repository;
import javax.inject.Singleton;

import dagger.Provides;

@dagger.Module
public class RepositoryModule {

    @Provides
    @Singleton
    CEDatabase provideData(Application application){
        return Room.databaseBuilder(application,
                CEDatabase.class, "cedatabase")
                .allowMainThreadQueries().build();
    }

    @Provides
    @Singleton
    BalanceDao provideBalanceDao(@NonNull CEDatabase ceDatabase){
        return ceDatabase.balanceDao();
    }

    @Provides
    @Singleton
    FinCardDao provideFinCardDao(@NonNull CEDatabase ceDatabase){
        return ceDatabase.finCardDao();
    }


}
