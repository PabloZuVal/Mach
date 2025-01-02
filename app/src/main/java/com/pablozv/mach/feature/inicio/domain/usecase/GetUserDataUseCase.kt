package com.pablozv.mach.feature.inicio.domain.usecase

import com.pablozv.mach.feature.inicio.domain.model.UserData
import com.pablozv.mach.feature.inicio.domain.repository.UserDataRepository

class GetUserDataUseCase(
    private val repository: UserDataRepository
) {
    suspend operator fun invoke(): UserData {
        return repository.getUserData()
    }
}

