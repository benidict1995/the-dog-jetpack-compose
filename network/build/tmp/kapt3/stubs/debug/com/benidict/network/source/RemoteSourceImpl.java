package com.benidict.network.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/benidict/network/source/RemoteSourceImpl;", "", "serviceApi", "Lcom/benidict/network/ServiceApi;", "(Lcom/benidict/network/ServiceApi;)V", "loadBreed", "", "Lcom/benidict/domain/model/Breed;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBreedDetails", "breedId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBreedImage", "Lcom/benidict/domain/model/Image;", "imageId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public final class RemoteSourceImpl {
    private final com.benidict.network.ServiceApi serviceApi = null;
    
    public RemoteSourceImpl(@org.jetbrains.annotations.NotNull
    com.benidict.network.ServiceApi serviceApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadBreedImage(@org.jetbrains.annotations.NotNull
    java.lang.String imageId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.benidict.domain.model.Image> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadBreed(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.benidict.domain.model.Breed>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadBreedDetails(int breedId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.benidict.domain.model.Breed> continuation) {
        return null;
    }
}