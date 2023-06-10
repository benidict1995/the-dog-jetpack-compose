package com.benidict.network.source

import com.benidict.domain.model.Breed
import com.benidict.network.ServiceApi
import com.benidict.network.model.BreedDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteSourceImpl constructor(
    private val serviceApi: ServiceApi
) {
    suspend fun loadBreed(): List<Breed> =
        withContext(Dispatchers.IO) {
            val response = serviceApi.loadBreeds(
                limit = 20,
                page = 0
            )
            BreedDTO.toDomain(response)
        }

}