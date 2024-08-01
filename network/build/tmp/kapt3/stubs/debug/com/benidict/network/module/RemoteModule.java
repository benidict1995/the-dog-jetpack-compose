package com.benidict.network.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/benidict/network/module/RemoteModule;", "", "()V", "provideRemoteSourceImpl", "Lcom/benidict/network/source/RemoteSourceImpl;", "api", "Lcom/benidict/network/ServiceApi;", "network_debug"})
@dagger.Module
public final class RemoteModule {
    @org.jetbrains.annotations.NotNull
    public static final com.benidict.network.module.RemoteModule INSTANCE = null;
    
    private RemoteModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.benidict.network.source.RemoteSourceImpl provideRemoteSourceImpl(@org.jetbrains.annotations.NotNull
    com.benidict.network.ServiceApi api) {
        return null;
    }
}