package com.alexander.korovin.onetwotriphomework.di

import com.alexander.korovin.onetwotriphomework.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun provideApplication(): MyApplication {
        return application
    }
}