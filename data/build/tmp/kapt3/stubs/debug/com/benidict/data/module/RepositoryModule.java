package com.benidict.data.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/benidict/data/module/RepositoryModule;", "", "()V", "provideRepositoryImpl", "Lcom/benidict/data/repository/RepositoryImpl;", "remoteSourceImpl", "Lcom/benidict/network/source/RemoteSourceImpl;", "data_debug"})
@dagger.Module
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.benidict.data.module.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.benidict.data.repository.RepositoryImpl provideRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.benidict.network.source.RemoteSourceImpl remoteSourceImpl) {
        return null;
    }
}