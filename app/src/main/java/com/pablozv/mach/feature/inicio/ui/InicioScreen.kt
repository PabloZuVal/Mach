package com.pablozv.mach.feature.inicio.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pablozv.mach.ui.theme.MachTheme
import com.pablozv.mach.ui.composable.AccountCard
import com.pablozv.mach.ui.composable.EvolveAccountCard
import com.pablozv.mach.ui.composable.CardAccount
import com.pablozv.mach.ui.composable.MeetMachCard
import com.pablozv.mach.ui.composable.ScrollAccounts
import com.pablozv.mach.ui.composable.SquareCard


@Composable()
fun InicioScreen(){
    val scrollState = rememberScrollState()
    val scrollState2 = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(95.dp) // Altura del área coloreada en la parte superior
                .background(MaterialTheme.colorScheme.primary)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            ScrollAccounts()
            EvolveAccountCard()
            CardAccount()
            Spacer(modifier = Modifier.height(24.dp))
            Text("Que quieres hacer hoy?")
            Row(
                modifier = Modifier
//                    .horizontalScroll(state = scrollState)
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
            ){
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Compra en\nCuotas", "icon3")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("MACH\nPremium", "icon4")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Invita y\ngana","icon5")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Beneficios\nBciPlus+", "icon6")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Paga tus\ncuentas", "icon7")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Parking\ndigital", "icon8")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))


        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewInicioScreen(){
    MachTheme {
        InicioScreen()
    }
}