package com.benidict.data.module

import com.benidict.data.repository.RepositoryImpl
import com.benidict.network.source.RemoteSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepositoryImpl(
        remoteSourceImpl: RemoteSourceImpl
    ): RepositoryImpl = RepositoryImpl(remoteSourceImpl)
}