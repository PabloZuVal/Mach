package com.pablozv.mach.ui.composable

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScrollInvest(){
    val scrollState2 = rememberScrollState()
    Row(
        modifier = Modifier
            .horizontalScroll(state = scrollState2)
            .fillMaxWidth()
            .padding(vertical = 16.dp),
    ){
        Box(
            Modifier.padding(end = 8.dp)
                .fillMaxWidth()
        ){
            OptionInvestCard("Invertir en \n" + "Fondos Mutuos", "icon_plus")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            OptionInvestCard("Invertir en \n" + "Fondos Mutuos", "icon_plus")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            OptionInvestCard("Invertir en \n" + "Fondos Mutuos", "icon_plus")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            OptionInvestCard("Invertir en \n" + "Fondos Mutuos", "icon_plus")
        }

    }
}

