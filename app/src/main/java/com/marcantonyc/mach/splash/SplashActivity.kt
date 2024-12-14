package com.marcantonyc.mach.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.marcantonyc.mach.splash.navigation.NavigationController
import com.marcantonyc.mach.splash.ui.theme.MachTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MachTheme {
                val navController = rememberNavController()
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    NavigationController(navController = navController)
                }
            }
        }
    }
}

