package com.example.the_dog_jetpack_compose.feature.doglist;

import com.benidict.data.repository.RepositoryImpl;
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
public final class DogListViewModel_Factory implements Factory<DogListViewModel> {
  private final Provider<RepositoryImpl> repositoryImplProvider;

  public DogListViewModel_Factory(Provider<RepositoryImpl> repositoryImplProvider) {
    this.repositoryImplProvider = repositoryImplProvider;
  }

  @Override
  public DogListViewModel get() {
    return newInstance(repositoryImplProvider.get());
  }

  public static DogListViewModel_Factory create(Provider<RepositoryImpl> repositoryImplProvider) {
    return new DogListViewModel_Factory(repositoryImplProvider);
  }

  public static DogListViewModel newInstance(RepositoryImpl repositoryImpl) {
    return new DogListViewModel(repositoryImpl);
  }
}
