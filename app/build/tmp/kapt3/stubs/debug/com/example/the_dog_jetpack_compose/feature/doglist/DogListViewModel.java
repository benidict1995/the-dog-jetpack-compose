package com.example.the_dog_jetpack_compose.feature.doglist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/the_dog_jetpack_compose/feature/doglist/DogListViewModel;", "Landroidx/lifecycle/ViewModel;", "repositoryImpl", "Lcom/benidict/data/repository/RepositoryImpl;", "(Lcom/benidict/data/repository/RepositoryImpl;)V", "_state", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/benidict/domain/state/ResponseState;", "state", "Lkotlinx/coroutines/flow/SharedFlow;", "getState", "()Lkotlinx/coroutines/flow/SharedFlow;", "loadBreed", "", "app_debug"})
public final class DogListViewModel extends androidx.lifecycle.ViewModel {
    private final com.benidict.data.repository.RepositoryImpl repositoryImpl = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.benidict.domain.state.ResponseState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.benidict.domain.state.ResponseState> state = null;
    
    @javax.inject.Inject
    public DogListViewModel(@org.jetbrains.annotations.NotNull
    com.benidict.data.repository.RepositoryImpl repositoryImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.benidict.domain.state.ResponseState> getState() {
        return null;
    }
    
    public final void loadBreed() {
    }
}