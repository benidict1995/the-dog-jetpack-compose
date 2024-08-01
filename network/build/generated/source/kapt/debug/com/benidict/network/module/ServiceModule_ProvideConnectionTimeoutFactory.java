package com.benidict.network.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ServiceModule_ProvideConnectionTimeoutFactory implements Factory<Integer> {
  @Override
  public Integer get() {
    return provideConnectionTimeout();
  }

  public static ServiceModule_ProvideConnectionTimeoutFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static int provideConnectionTimeout() {
    return ServiceModule.INSTANCE.provideConnectionTimeout();
  }

  private static final class InstanceHolder {
    private static final ServiceModule_ProvideConnectionTimeoutFactory INSTANCE = new ServiceModule_ProvideConnectionTimeoutFactory();
  }
}
