package com.alexander.korovin.onetwotriphomework.di

import com.alexander.korovin.onetwotriphomework.model.Repository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [NetworkModule::class, AppModule::class, RepositoryModule::class])
interface AppComponent {
    fun inject (repository: Repository)
    //fun inject (viewModelFactory: RepositoryViewModelProviderFactory)
}