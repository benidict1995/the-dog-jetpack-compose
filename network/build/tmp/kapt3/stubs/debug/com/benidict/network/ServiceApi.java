package com.benidict.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/benidict/network/ServiceApi;", "", "loadBreedDetails", "Lcom/benidict/network/model/BreedDTO;", "breedId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBreedImage", "Lcom/benidict/network/model/ImageDTO;", "imageId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBreeds", "", "limit", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public abstract interface ServiceApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v1/images/{image_id}")
    public abstract java.lang.Object loadBreedImage(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "image_id")
    java.lang.String imageId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.benidict.network.model.ImageDTO> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v1/breeds")
    public abstract java.lang.Object loadBreeds(@retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.benidict.network.model.BreedDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v1/breeds/{breed_id}")
    public abstract java.lang.Object loadBreedDetails(@retrofit2.http.Path(value = "breed_id")
    int breedId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.benidict.network.model.BreedDTO> continuation);
}