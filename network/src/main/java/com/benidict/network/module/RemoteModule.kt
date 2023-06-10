package com.benidict.network.module

import com.benidict.network.ServiceApi
import com.benidict.network.source.RemoteSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {
    @Provides
    @Singleton
    fun provideRemoteSourceImpl(api: ServiceApi): RemoteSourceImpl = RemoteSourceImpl(api)
}