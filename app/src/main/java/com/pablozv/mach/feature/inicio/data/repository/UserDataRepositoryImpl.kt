package com.pablozv.mach.feature.inicio.data.repository

import com.pablozv.mach.feature.inicio.data.mapper.UserDataDtoMapper
import com.pablozv.mach.feature.inicio.data.remote.api.UserDataApi
import com.pablozv.mach.feature.inicio.domain.model.UserData
import com.pablozv.mach.feature.inicio.domain.repository.UserDataRepository

class UserDataRepositoryImpl(
    private val api: UserDataApi,
    private val mapper: UserDataDtoMapper
) : UserDataRepository {
    override suspend fun getUserData(): UserData {
        return mapper.mapToDomain(api.getUserData())
    }
}