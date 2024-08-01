package com.example.the_dog_jetpack_compose.feature.dogdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/the_dog_jetpack_compose/feature/dogdetails/DogDetailsState;", "", "()V", "LoadDogDetails", "Lcom/example/the_dog_jetpack_compose/feature/dogdetails/DogDetailsState$LoadDogDetails;", "app_debug"})
public abstract class DogDetailsState {
    
    private DogDetailsState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/the_dog_jetpack_compose/feature/dogdetails/DogDetailsState$LoadDogDetails;", "Lcom/example/the_dog_jetpack_compose/feature/dogdetails/DogDetailsState;", "dogDetails", "Lcom/benidict/domain/model/Breed;", "url", "", "(Lcom/benidict/domain/model/Breed;Ljava/lang/String;)V", "getDogDetails", "()Lcom/benidict/domain/model/Breed;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoadDogDetails extends com.example.the_dog_jetpack_compose.feature.dogdetails.DogDetailsState {
        @org.jetbrains.annotations.NotNull
        private final com.benidict.domain.model.Breed dogDetails = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.the_dog_jetpack_compose.feature.dogdetails.DogDetailsState.LoadDogDetails copy(@org.jetbrains.annotations.NotNull
        com.benidict.domain.model.Breed dogDetails, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public LoadDogDetails(@org.jetbrains.annotations.NotNull
        com.benidict.domain.model.Breed dogDetails, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.benidict.domain.model.Breed component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.benidict.domain.model.Breed getDogDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrl() {
            return null;
        }
    }
}