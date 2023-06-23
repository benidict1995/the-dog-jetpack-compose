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
class MainViewModel @Inject constructor() : ViewModel() {}