package com.example.the_dog_jetpack_compose.feature.dogdetails

import com.benidict.domain.model.Breed

sealed class DogDetailsState {
    data class LoadDogDetails(
        val dogDetails: Breed, val url: String
    ) : DogDetailsState()
}