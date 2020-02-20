package com.alexander.korovin.onetwotriphomework

import android.app.Application
import com.alexander.korovin.onetwotriphomework.di.AppComponent
import com.alexander.korovin.onetwotriphomework.di.AppModule
import com.alexander.korovin.onetwotriphomework.di.DaggerAppComponent
import com.alexander.korovin.onetwotriphomework.di.NetworkModule

class MyApplication : Application() {
    companion object {
        lateinit var instance : MyApplication
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = initAppComponent()
    }

    private fun initAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule(Constants.BASE_URL))
            .build()
    }
}