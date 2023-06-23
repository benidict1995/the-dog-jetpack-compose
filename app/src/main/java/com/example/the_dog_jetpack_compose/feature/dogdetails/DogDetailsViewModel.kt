package com.example.the_dog_jetpack_compose.feature.dogdetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.benidict.data.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DogDetailsViewModel @Inject constructor(
    private val repositoryImpl: RepositoryImpl
) : ViewModel() {

    private val _state: MutableSharedFlow<DogDetailsState> = MutableSharedFlow(replay = 1)
    val state = _state.asSharedFlow()

    fun loadBreedDetails(breedId: Int, imageId: String) {
        viewModelScope.launch {
            try {
                val breedDetails = flow {
                    val invoke = repositoryImpl.loadBreedDetails(breedId)
                    emit(invoke)
                }

                val breedUrl = flow {
                    val invoke = repositoryImpl.loadBreedImage(imageId)
                    emit(invoke)
                }

                combine(breedDetails, breedUrl) { details, url ->
                    Pair(details, url)
                }.collect {
                    _state.emit(
                        DogDetailsState.LoadDogDetails(dogDetails = it.first, url = it.second.url)
                    )
                }
            } catch (e: Exception) {

            } finally {

            }
        }
    }
}