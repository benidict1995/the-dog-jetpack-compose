package com.benidict.data.module;

import com.benidict.data.repository.RepositoryImpl;
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
public final class RepositoryModule_ProvideRepositoryImplFactory implements Factory<RepositoryImpl> {
  private final Provider<RemoteSourceImpl> remoteSourceImplProvider;

  public RepositoryModule_ProvideRepositoryImplFactory(
      Provider<RemoteSourceImpl> remoteSourceImplProvider) {
    this.remoteSourceImplProvider = remoteSourceImplProvider;
  }

  @Override
  public RepositoryImpl get() {
    return provideRepositoryImpl(remoteSourceImplProvider.get());
  }

  public static RepositoryModule_ProvideRepositoryImplFactory create(
      Provider<RemoteSourceImpl> remoteSourceImplProvider) {
    return new RepositoryModule_ProvideRepositoryImplFactory(remoteSourceImplProvider);
  }

  public static RepositoryImpl provideRepositoryImpl(RemoteSourceImpl remoteSourceImpl) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRepositoryImpl(remoteSourceImpl));
  }
}
