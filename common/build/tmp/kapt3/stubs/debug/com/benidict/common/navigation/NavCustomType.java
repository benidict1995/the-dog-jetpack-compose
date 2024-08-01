package com.benidict.common.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007J \u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010\u0007J%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0006*\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/benidict/common/navigation/NavCustomType;", "T", "Landroidx/navigation/NavType;", "()V", "fromJsonParse", "value", "", "(Ljava/lang/String;)Ljava/lang/Object;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "getJsonParse", "(Ljava/lang/Object;)Ljava/lang/String;", "common_debug"})
public abstract class NavCustomType<T extends java.lang.Object> extends androidx.navigation.NavType<T> {
    
    public NavCustomType() {
        super(false);
    }
    
    public abstract T fromJsonParse(@org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getJsonParse(T $this$getJsonParse);
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public T get(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    public T parseValue(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @java.lang.Override
    public void put(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull
    java.lang.String key, T value) {
    }
}