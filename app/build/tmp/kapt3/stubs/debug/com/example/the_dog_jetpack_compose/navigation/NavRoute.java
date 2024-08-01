package com.example.the_dog_jetpack_compose.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\t\"\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\t\"\u00020\u0003\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/the_dog_jetpack_compose/navigation/NavRoute;", "", "path", "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "withArgs", "args", "", "([Ljava/lang/String;)Ljava/lang/String;", "withArgsFormat", "DogDetailsScreen", "DogListScreen", "Lcom/example/the_dog_jetpack_compose/navigation/NavRoute$DogDetailsScreen;", "Lcom/example/the_dog_jetpack_compose/navigation/NavRoute$DogListScreen;", "app_debug"})
public abstract class NavRoute {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String path = null;
    
    private NavRoute(java.lang.String path) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String withArgs(@org.jetbrains.annotations.NotNull
    java.lang.String... args) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String withArgsFormat(@org.jetbrains.annotations.NotNull
    java.lang.String... args) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/the_dog_jetpack_compose/navigation/NavRoute$DogListScreen;", "Lcom/example/the_dog_jetpack_compose/navigation/NavRoute;", "()V", "app_debug"})
    public static final class DogListScreen extends com.example.the_dog_jetpack_compose.navigation.NavRoute {
        @org.jetbrains.annotations.NotNull
        public static final com.example.the_dog_jetpack_compose.navigation.NavRoute.DogListScreen INSTANCE = null;
        
        private DogListScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/the_dog_jetpack_compose/navigation/NavRoute$DogDetailsScreen;", "Lcom/example/the_dog_jetpack_compose/navigation/NavRoute;", "()V", "breedId", "", "imageId", "app_debug"})
    public static final class DogDetailsScreen extends com.example.the_dog_jetpack_compose.navigation.NavRoute {
        @org.jetbrains.annotations.NotNull
        public static final com.example.the_dog_jetpack_compose.navigation.NavRoute.DogDetailsScreen INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String breedId = "breedId";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String imageId = "imageId";
        
        private DogDetailsScreen() {
            super(null);
        }
    }
}