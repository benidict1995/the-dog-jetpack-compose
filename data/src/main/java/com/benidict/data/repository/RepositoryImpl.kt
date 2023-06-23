package com.benidict.data.repository

import com.benidict.domain.model.Breed
import com.benidict.domain.model.Image
import com.benidict.network.source.RemoteSourceImpl
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteSourceImpl: RemoteSourceImpl
) {

    suspend fun loadBreedImage(imageId: String): Image {
        return remoteSourceImpl.loadBreedImage(imageId)
    }

    suspend fun loadBreed(): List<Breed> {
        return remoteSourceImpl.loadBreed()
    }

    suspend fun loadBreedDetails(breedId: Int): Breed {
        return remoteSourceImpl.loadBreedDetails(breedId)
    }
}