package com.pablozv.mach.feature.inicio.data.mapper

import com.pablozv.mach.feature.inicio.data.remote.dto.UserDataDto
import com.pablozv.mach.feature.inicio.domain.model.UserData

class UserDataDtoMapper {
    fun mapToDomain(userDataDto: UserDataDto): UserData {
        return UserData(
            cashback = userDataDto.cashback,
            nombre = userDataDto.nombre,
            numero_cuenta = userDataDto.numero_cuenta,
            numero_tarjeta_fisica = userDataDto.numero_tarjeta_fisica,
            numero_tarjeta_virtual = userDataDto.numero_tarjeta_virtual,
            saldo_actual = userDataDto.saldo_actual,
            saldo_cupo_credito = userDataDto.saldo_cupo_credito,
            saldo_dolares = userDataDto.saldo_dolares,
            saldo_inversiones = userDataDto.saldo_inversiones,
            tipo_cambio = userDataDto.tipo_cambio
        )
    }
}