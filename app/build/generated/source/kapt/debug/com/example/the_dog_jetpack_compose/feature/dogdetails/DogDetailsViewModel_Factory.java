package com.example.the_dog_jetpack_compose.feature.dogdetails;

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
public final class DogDetailsViewModel_Factory implements Factory<DogDetailsViewModel> {
  private final Provider<RepositoryImpl> repositoryImplProvider;

  public DogDetailsViewModel_Factory(Provider<RepositoryImpl> repositoryImplProvider) {
    this.repositoryImplProvider = repositoryImplProvider;
  }

  @Override
  public DogDetailsViewModel get() {
    return newInstance(repositoryImplProvider.get());
  }

  public static DogDetailsViewModel_Factory create(
      Provider<RepositoryImpl> repositoryImplProvider) {
    return new DogDetailsViewModel_Factory(repositoryImplProvider);
  }

  public static DogDetailsViewModel newInstance(RepositoryImpl repositoryImpl) {
    return new DogDetailsViewModel(repositoryImpl);
  }
}
