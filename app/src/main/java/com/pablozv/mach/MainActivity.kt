package com.pablozv.mach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.pablozv.mach.ui.theme.MachTheme
import com.pablozv.mach.core.navigation.BottomNavigationMenu
import com.pablozv.mach.ui.composable.TopBar
import com.pablozv.mach.core.navigation.NavigationController
import dagger.hilt.android.AndroidEntryPoint
import com.pablozv.mach.core.navigation.BottonSheetController
import com.pablozv.mach.ui.composable.BottomSheet

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MachTheme {
                val navController = rememberNavController()
                val bottonSheetController = remember { BottonSheetController() }
                val showTopBarController = remember { mutableStateOf(true) }

                val systemUiController = rememberSystemUiController()
                val statusBarColor = Color(0xFF6200EE) // Define el color deseado

                // Cambia el color de la barra de estado
                systemUiController.setStatusBarColor(
                    color = statusBarColor,
                    darkIcons = false // Usa íconos claros o oscuros según el color del fondo
                )

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
//                    topBar = { if (showTopBarController.value) { TopBar() }},
                    bottomBar = { BottomNavigationMenu(navController = navController) }
                ) { innerPadding ->
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)

                    ){
                        NavigationController(
                            navController = navController,
                            bottonSheetController = bottonSheetController,
                            showTopBarController = showTopBarController)

                        BottomSheet(
                            isSheetVisible = bottonSheetController.isVisible,
                            content = bottonSheetController.content,
                            onDismiss = { bottonSheetController.hide() },
                        )
                    }
                }
            }
        }
    }
}
