package com.benidict.network.module;

import com.benidict.network.ServiceApi;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class ServiceModule_ProvideRetrofitFactory implements Factory<ServiceApi> {
  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> clientProvider;

  public ServiceModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider,
      Provider<OkHttpClient> clientProvider) {
    this.gsonProvider = gsonProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public ServiceApi get() {
    return provideRetrofit(gsonProvider.get(), clientProvider.get());
  }

  public static ServiceModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider,
      Provider<OkHttpClient> clientProvider) {
    return new ServiceModule_ProvideRetrofitFactory(gsonProvider, clientProvider);
  }

  public static ServiceApi provideRetrofit(Gson gson, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideRetrofit(gson, client));
  }
}
