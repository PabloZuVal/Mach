package com.pablozv.mach.feature.inicio.domain.model

data class UserData(
    val cashback: Double,
    val nombre: String,
    val numero_cuenta: String,
    val numero_tarjeta_fisica: String,
    val numero_tarjeta_virtual: String,
    val saldo_actual: Double,
    val saldo_cupo_credito: Double,
    val saldo_dolares: Double,
    val saldo_inversiones: Double,
    val tipo_cambio: Double
)