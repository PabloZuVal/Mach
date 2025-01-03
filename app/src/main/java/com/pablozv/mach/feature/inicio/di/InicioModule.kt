package com.pablozv.mach.feature.inicio.di

import com.pablozv.mach.feature.inicio.data.mapper.UserDataDtoMapper
import com.pablozv.mach.feature.inicio.data.remote.api.UserDataApi
import com.pablozv.mach.feature.inicio.data.repository.UserDataRepositoryImpl
import com.pablozv.mach.feature.inicio.domain.repository.UserDataRepository
import com.pablozv.mach.feature.inicio.domain.usecase.GetUserDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InicioModule {
    @Provides
    @Singleton
    fun provideUserDataApi(retrofit: Retrofit): UserDataApi {
        return retrofit.create(UserDataApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUserDataMapper(): UserDataDtoMapper {
        return UserDataDtoMapper()
    }

    @Provides
    @Singleton
    fun provideUserDataRepository(
        api: UserDataApi,
        mapper: UserDataDtoMapper
    ): UserDataRepository {
        return UserDataRepositoryImpl(api, mapper)
    }

    @Provides
    @Singleton
    fun provideGetUserDataUseCase(repository: UserDataRepository): GetUserDataUseCase {
        return GetUserDataUseCase(repository)
    }
}