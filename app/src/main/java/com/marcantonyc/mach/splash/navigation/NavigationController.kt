package com.marcantonyc.mach.splash.navigation

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