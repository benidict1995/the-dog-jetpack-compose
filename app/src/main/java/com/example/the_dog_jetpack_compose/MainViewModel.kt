package com.example.the_dog_jetpack_compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.benidict.data.repository.RepositoryImpl
import com.benidict.domain.state.ResponseState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repositoryImpl: RepositoryImpl
) : ViewModel() {

    private val _state: MutableSharedFlow<ResponseState> = MutableSharedFlow()
    val state = _state.asSharedFlow()

    init {
        loadBreed()
    }

    private fun loadBreed(){
        viewModelScope.launch {
            try{
                _state.emit(ResponseState.Loading)
                val response = repositoryImpl.loadBreed()
                _state.emit(ResponseState.Success(response))

            }catch (e: Exception){
                _state.emit(ResponseState.Failure(e))
            }
        }
    }
}