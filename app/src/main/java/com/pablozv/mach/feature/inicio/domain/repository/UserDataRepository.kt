package com.pablozv.mach.feature.inicio.domain.repository

import com.pablozv.mach.feature.inicio.domain.model.UserData

interface UserDataRepository {
    suspend fun getUserData(): UserData
}