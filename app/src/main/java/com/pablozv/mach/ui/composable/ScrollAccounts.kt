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
fun ScrollAccounts(){

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
            AccountCard(
                text1 = "Mi cuenta MACH",
                text2 = "Saldo disponible",
                amount = "$ 1,000.00"
            )
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            AccountCard(
                text1 = "Inversiones",
                text2 = "Total inversiones",
                amount = "$ 2,000.00"
            )
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            AccountCard(
                text1 = "Compra en cuotas",
                text2 = "Cupo disponible",
                amount = "$ 3,000.00"
            )
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            AccountCard(
                text1 = "Cashback",
                text2 = "Montos acumulados",
                amount = "$ 1,000.00"
            )
        }

    }
}
