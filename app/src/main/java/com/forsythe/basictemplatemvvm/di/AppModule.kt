package com.forsythe.basictemplatemvvm.di

import android.content.Context
import com.forsythe.basictemplatemvvm.app.Application
import com.forsythe.basictemplatemvvm.data.remote.network.client.KtorClient
import com.forsythe.basictemplatemvvm.data.repositoryImpl.RepositoryImpl
import com.forsythe.basictemplatemvvm.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesApplication(@ApplicationContext appContext : Context): Application = appContext as Application


}