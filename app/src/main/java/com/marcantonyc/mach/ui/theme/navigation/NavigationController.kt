package com.marcantonyc.mach.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.marcantonyc.mach.feature.inicio.ui.InicioScreen
import com.marcantonyc.mach.feature.inversiones.ui.InversionesScreen
import com.marcantonyc.mach.feature.pin.ui.PinScreen
import com.marcantonyc.mach.feature.splash.ui.SplashScreen
import com.marcantonyc.mach.feature.tarjetas.ui.TarjetasScreen
import com.marcantonyc.mach.feature.transferencia.ui.TransferenciaScreen
import com.marcantonyc.mach.feature.voucher.ui.VoucherScreen


@Composable
fun NavigationController(navController: NavHostController){

    val routeItem = listOf(
        NavComposable(
            route = "Inicio",
            content = { InicioScreen() }
        ),
        NavComposable(
            route = "Transferir",
            content = { TransferenciaScreen(
                onNavigateToVouchers = { navController.navigate("Vouchers") },
            ) }
        ),
        NavComposable(
            route = "Tarjetas",
            content = { TarjetasScreen() }
        ),
        NavComposable(
            route = "Inversiones",
            content = { InversionesScreen() }
        ),
        NavComposable(
            route = "Voucher",
            content = { VoucherScreen() }
        ),
    )

    NavHost(navController = navController, startDestination = "Inicio" ) {

        for(item in routeItem){
            composable(item.route){
                item.content()
            }
        }

    }

}