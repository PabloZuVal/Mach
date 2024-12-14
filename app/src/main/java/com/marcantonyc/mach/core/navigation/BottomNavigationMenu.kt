package com.marcantonyc.mach.core.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

data class BottomNavigationItem(
    val title: String,
    val icon: ImageVector,
    val route: String,
)

data object BottomNavigationItems {
    val items: List<BottomNavigationItem> = listOf(
        BottomNavigationItem(
            title = "Inicio",
            icon = Icons.Default.Home,
            route = "Inicio",
        ),
        BottomNavigationItem(
            title = "Trasnferir",
            icon = Icons.Default.PlayArrow,
            route = "Transferir",
        ),
        BottomNavigationItem(
            title = "Tarjetas",
            icon = Icons.Default.AccountBox,
            route = "Tarjetas",
        ),
        BottomNavigationItem(
            title = "Inversiones",
            icon = Icons.Default.ThumbUp,
            route = "Inversiones",
        ),
    )
}

@Composable
fun BottomNavigationMenu(navController: NavHostController) {

    var selectedItem by remember { mutableIntStateOf(0) } // Controla el ítem seleccionado

    NavigationBar(
        containerColor = Color.Transparent,
    ) {
        BottomNavigationItems.items.forEachIndexed{ index, screen ->
            NavigationBarItem(
                icon = {
                    Icon(
                        screen.icon,
                        contentDescription = screen.title,

                    )
                },
                label = {
                    Text(
                        screen.title,
                    )
                },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.secondary,
                    unselectedTextColor = MaterialTheme.colorScheme.secondary,
                )

            )
        }
    }
}

