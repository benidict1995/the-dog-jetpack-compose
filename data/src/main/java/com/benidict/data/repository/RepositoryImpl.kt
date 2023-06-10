package com.benidict.data.repository

import com.benidict.domain.model.Breed
import com.benidict.network.source.RemoteSourceImpl
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteSourceImpl: RemoteSourceImpl
) {
    suspend fun loadBreed(): List<Breed> {
        return remoteSourceImpl.loadBreed()
    }
}