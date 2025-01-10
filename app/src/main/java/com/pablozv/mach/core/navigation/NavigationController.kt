package com.pablozv.mach.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
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
import com.pablozv.mach.ui.composable.TopBar


@Composable
fun NavigationController(
    navController: NavHostController,
    bottonSheetController: BottonSheetController,
    showTopBarController: MutableState<Boolean>,
    topBarConfig: MutableState<@Composable () -> Unit>
){

    val routeItem = listOf(
        NavComposable(
            route = "Inicio",
            content = {
                showTopBarController.value = true
                topBarConfig.value = {
                    TopBar(title = "Inicio")
                }
                InicioScreen(bottonSheetController = bottonSheetController)
            }
        ),
        NavComposable(
            route = "Transferir",
            content = {
                showTopBarController.value = true
                topBarConfig.value = {
                    TopBar(title = "Transferir", showBackButton = true, onBackClick = { navController.popBackStack() })
                }
                TransferenciaScreen(onNavigateToVouchers = { navController.navigate("Vouchers") },
            ) }
        ),
        NavComposable(
            route = "Tarjetas",
            content = {
                topBarConfig.value = {
                    TopBar(title = "Tarjetas")
                }
                TarjetasScreen()
            }
        ),
        NavComposable(
            route = "Inversiones",
            content = {
                topBarConfig.value = {
                    TopBar(title = "Inversiones")
                }
                InversionesScreen()
            }
        ),
        NavComposable(
            route = "Voucher",
            content = {
                showTopBarController.value = true
                topBarConfig.value = {
                    TopBar(title = "Voucher")
                }
                VoucherScreen()
            }
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