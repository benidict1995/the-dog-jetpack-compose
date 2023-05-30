package com.benidict.network.source

import com.benidict.network.ServiceApi
import dagger.Provides
import javax.inject.Singleton

class RemoteSourceImpl constructor(
    private val serviceApi: ServiceApi
) {

    @Provides
    @Singleton
    fun provideRemoteSourceImpl(api: ServiceApi): RemoteSourceImpl
    = RemoteSourceImpl(api)
}