package com.pablozv.mach.feature.inicio.data.remote.api

import com.pablozv.mach.feature.inicio.data.remote.dto.UserDataDto
import retrofit2.http.GET

interface UserDataApi {
    @GET("/40505f0c-193e-424b-828e-17263ca4fed1/run?input=I+love+Magic+Loops%21")
    suspend fun getUserData(): UserDataDto
}