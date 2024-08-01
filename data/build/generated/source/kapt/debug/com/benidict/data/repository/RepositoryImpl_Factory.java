package com.benidict.data.repository;

import com.benidict.network.source.RemoteSourceImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<RemoteSourceImpl> remoteSourceImplProvider;

  public RepositoryImpl_Factory(Provider<RemoteSourceImpl> remoteSourceImplProvider) {
    this.remoteSourceImplProvider = remoteSourceImplProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(remoteSourceImplProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<RemoteSourceImpl> remoteSourceImplProvider) {
    return new RepositoryImpl_Factory(remoteSourceImplProvider);
  }

  public static RepositoryImpl newInstance(RemoteSourceImpl remoteSourceImpl) {
    return new RepositoryImpl(remoteSourceImpl);
  }
}
