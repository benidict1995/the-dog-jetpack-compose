package com.benidict.data.module

import com.benidict.data.repository.RepositoryImpl
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
        remoteSourceImpl: RepositoryImpl
    ): RepositoryImpl = RepositoryImpl(remoteSourceImpl)
}