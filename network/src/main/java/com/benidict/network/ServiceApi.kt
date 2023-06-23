package com.benidict.network

import com.benidict.network.model.BreedDTO
import com.benidict.network.model.ImageDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceApi {
    @GET("v1/images/{image_id}")
    suspend fun loadBreedImage(
        @Path("image_id") imageId: String
    ): ImageDTO

    @GET("v1/breeds")
    suspend fun loadBreeds(
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): List<BreedDTO>

    @GET("v1/breeds/{breed_id}")
    suspend fun loadBreedDetails(
        @Path("breed_id") breedId: Int
    ): BreedDTO
}