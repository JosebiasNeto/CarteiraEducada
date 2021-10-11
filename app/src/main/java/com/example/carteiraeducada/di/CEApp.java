package com.example.carteiraeducada.di;

import static org.koin.core.context.DefaultContextExtKt.startKoin;

import android.app.Application;

import org.koin.android.java.KoinAndroidApplication;
import org.koin.core.KoinApplication;

public class CEApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KoinApplication koin = KoinAndroidApplication.create(this)
                .modules(Modules.INSTANCE.getCEModule());
        startKoin(koin);

    }
}
