package com.marcantonyc.mach.feature.inversiones.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marcantonyc.mach.ui.theme.MachTheme
import com.marcantonyc.mach.ui.theme.composable.MeetMachCard
import com.marcantonyc.mach.ui.theme.composable.SquareCard

@Composable
fun InversionesScreen(){
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        //CARD
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSurface,
            )
        ){
            Row(
                modifier = Modifier.padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Text("Saldo total inversiones",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 14.sp

                    )
                )
                Text("$ 20.000",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold

                    )
                )
            }
            Row(
                modifier = Modifier.padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Text("Saldo cuenta MACH",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 14.sp

                    )
                )
                Text("$ 2.500.000",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold

                    )
                )
            }
        }

        Spacer(modifier = Modifier.size(32.dp))
        Text("Mis Productos")
        Spacer(modifier = Modifier.size(16.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SquareCard(
                "Cuenta Futuro"
            )
            SquareCard(
                "Fondos Mutuos"
            )
        }
        Spacer(modifier = Modifier.size(32.dp))
        Text("Mis Productos")
        Spacer(modifier = Modifier.size(16.dp))
        MeetMachCard(
            title = "Calcula tu ahorro con \nCuenta Futuro",
            buttonText = "Calcular ahora"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInversionesScreen(){
    MachTheme {
        InversionesScreen()
    }
}