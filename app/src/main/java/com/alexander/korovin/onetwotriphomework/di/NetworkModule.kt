package com.alexander.korovin.onetwotriphomework.di

import com.alexander.korovin.onetwotriphomework.network.Endpoints
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule(private val baseUrl: String) {

    @Singleton
    @Provides
    fun provideEndpoinst(okHttpClient : OkHttpClient): Endpoints {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(Endpoints::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttpCliet () : OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(180, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
    }
}