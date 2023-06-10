package com.benidict.network

import com.benidict.network.model.BreedDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {
    @GET("v1/breeds")
    suspend fun loadBreeds(
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): List<BreedDTO>
}