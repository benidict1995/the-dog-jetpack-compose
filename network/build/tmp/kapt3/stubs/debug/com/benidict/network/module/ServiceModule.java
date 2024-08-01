package com.benidict.network.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/benidict/network/module/ServiceModule;", "", "()V", "provideConnectionTimeout", "", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lcom/benidict/network/ServiceApi;", "gson", "client", "network_debug"})
@dagger.Module
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull
    public static final com.benidict.network.module.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    public final int provideConnectionTimeout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.benidict.network.ServiceApi provideRetrofit(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
}