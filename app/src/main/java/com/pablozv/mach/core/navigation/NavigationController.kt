package com.pablozv.mach.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pablozv.mach.feature.inicio.ui.InicioScreen
import com.pablozv.mach.feature.inversiones.ui.InversionesScreen
import com.pablozv.mach.feature.pin.ui.PinScreen
import com.pablozv.mach.feature.splash.ui.SplashScreen
import com.pablozv.mach.feature.tarjetas.ui.TarjetasScreen
import com.pablozv.mach.feature.transferencia.ui.TransferenciaScreen
import com.pablozv.mach.feature.voucher.ui.VoucherScreen


@Composable
fun NavigationController(
    navController: NavHostController,
    bottonSheetController: BottonSheetController,
    showTopBarController: MutableState<Boolean>
){

    val routeItem = listOf(
        NavComposable(
            route = "Inicio",
            content = {
                showTopBarController.value = true
                InicioScreen(bottonSheetController = bottonSheetController,)
            }
        ),
        NavComposable(
            route = "Transferir",
            content = {
                showTopBarController.value = false
                TransferenciaScreen(onNavigateToVouchers = { navController.navigate("Vouchers") },
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