package com.marcantonyc.mach.splash.navigation

import androidx.compose.runtime.Composable

data class NavComposable(
    val route: String,
    val content: @Composable () -> Unit,
)
