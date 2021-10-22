package com.example.carteiraeducada.di;

import android.app.Application;

import com.example.carteiraeducada.domain.Repository;
import com.example.carteiraeducada.ui.months.expenditure.ExpenditureViewModel;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.DaggerApplication;

@Singleton
@Component (modules = {RepositoryModule.class, DatabaseDataSourceModule.class})
public interface CEComponent{
    Repository provideRepository();

    void inject(ExpenditureViewModel expenditureViewModel);
}

