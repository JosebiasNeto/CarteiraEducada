package com.example.carteiraeducada.di

import com.example.carteiraeducada.data.Database.CEDatabase
import com.example.carteiraeducada.data.Database.DatabaseDataSource
import com.example.carteiraeducada.domain.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

object Modules {
    val CEModule = module {
        single<Repository> { Repository(
            DatabaseDataSource(
                CEDatabase.getDatabase(androidContext()).balanceDao(),
                CEDatabase.getDatabase(androidContext()).finCardDao()
            )
        ) }
    }
}