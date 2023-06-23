package com.benidict.network.source

import com.benidict.domain.model.Breed
import com.benidict.domain.model.Image
import com.benidict.network.ServiceApi
import com.benidict.network.model.BreedDTO
import com.benidict.network.model.ImageDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteSourceImpl constructor(
    private val serviceApi: ServiceApi
) {
    suspend fun loadBreedImage(imageId: String): Image =
        withContext(Dispatchers.IO) {
            val response = serviceApi.loadBreedImage(imageId)
            ImageDTO.toDomain(response)
        }

    suspend fun loadBreed(): List<Breed> =
        withContext(Dispatchers.IO) {
            val response = serviceApi.loadBreeds(
                limit = 20,
                page = 0
            )
            BreedDTO.toDomain(response)
        }

    suspend fun loadBreedDetails(breedId: Int): Breed = withContext(Dispatchers.IO) {
        val response = serviceApi.loadBreedDetails(breedId)
        BreedDTO.toDomain(response)
    }
}