package com.marcantonyc.mach.feature.inicio.ui

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcantonyc.mach.ui.theme.MachTheme
import com.marcantonyc.mach.ui.theme.composable.AccountCard
import com.marcantonyc.mach.ui.theme.composable.EvolveAccountCard
import com.marcantonyc.mach.ui.theme.composable.MeetMachCard
import com.marcantonyc.mach.ui.theme.composable.SquareCard


@Composable()
fun InicioScreen(){
    val scrollState = rememberScrollState()
    val scrollState2 = rememberScrollState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){

        AccountCard()
        Spacer(modifier = Modifier.height(24.dp))
        EvolveAccountCard()
        Spacer(modifier = Modifier.height(24.dp))
        Text("Que Quieres Hacer hoy ?")
        Row(
            modifier = Modifier
                .horizontalScroll(state = scrollState)
                .fillMaxWidth()
                .padding(vertical = 16.dp),
        ){
            Box(
                Modifier.padding(end = 8.dp)
            ){
                SquareCard("Invita y \nGana")
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                SquareCard("Beneficios \nBciPlus+")
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                SquareCard("Seguros y\nServicios")
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                SquareCard("Conexiones \ny alianzas")
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                SquareCard("Recarga y retira\ndinero")
            }


        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Conoce MACH")

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
                MeetMachCard(
                    title = "!Empieza a cumplir tus\nmetas ahorrando",

                )
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                MeetMachCard()
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                MeetMachCard()
            }
            Box(
                Modifier.padding(horizontal = 8.dp)
            ){
                MeetMachCard()
            }



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