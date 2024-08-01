package com.benidict.network.module;

import com.benidict.network.ServiceApi;
import com.benidict.network.source.RemoteSourceImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class RemoteModule_ProvideRemoteSourceImplFactory implements Factory<RemoteSourceImpl> {
  private final Provider<ServiceApi> apiProvider;

  public RemoteModule_ProvideRemoteSourceImplFactory(Provider<ServiceApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RemoteSourceImpl get() {
    return provideRemoteSourceImpl(apiProvider.get());
  }

  public static RemoteModule_ProvideRemoteSourceImplFactory create(
      Provider<ServiceApi> apiProvider) {
    return new RemoteModule_ProvideRemoteSourceImplFactory(apiProvider);
  }

  public static RemoteSourceImpl provideRemoteSourceImpl(ServiceApi api) {
    return Preconditions.checkNotNullFromProvides(RemoteModule.INSTANCE.provideRemoteSourceImpl(api));
  }
}
