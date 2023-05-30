package com.benidict.data.repository

import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteSourceImpl: RepositoryImpl
) {
}