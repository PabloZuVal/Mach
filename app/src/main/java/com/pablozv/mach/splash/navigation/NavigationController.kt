package com.pablozv.mach.splash.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pablozv.mach.feature.inicio.ui.InicioScreen
import com.pablozv.mach.feature.inversiones.ui.InversionesScreen
import com.pablozv.mach.feature.pin.ui.PinScreen
import com.pablozv.mach.feature.splash.ui.SplashScreen
import com.pablozv.mach.feature.tarjetas.ui.TarjetasScreen
import com.pablozv.mach.feature.transferencia.ui.TransferenciaScreen


@Composable
fun NavigationController(navController: NavHostController){

    val routeItem = listOf(
        NavComposable(
            route = "Splash",
            content = {
                SplashScreen {
                    navController.navigate("Pin")
                }
            }
        ),
        NavComposable(
            route = "Pin",
            content = { PinScreen() }
        ),

    )


     NavHost(navController = navController, startDestination = "Splash" ) {

        for(item in routeItem){
            composable(item.route){
                item.content()
            }
        }

    }

}