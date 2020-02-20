package com.alexander.korovin.onetwotriphomework.di

import com.alexander.korovin.onetwotriphomework.model.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository() : Repository {
        return Repository()
    }
}