package com.pablozv.mach.feature.inversiones.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.R
import com.pablozv.mach.ui.theme.MachTheme
import com.pablozv.mach.ui.composable.MeetMachCard
import com.pablozv.mach.ui.composable.RectangleCard
import com.pablozv.mach.ui.composable.SquareCard

@Composable
fun InversionesScreen(){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(MaterialTheme.colorScheme.primary)
    ){

    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        //CARD
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSurface,
            )
        ){
            Row(
                modifier = Modifier.padding(
                    top = 14.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 2.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Text("Saldo total inversiones",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold

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
                modifier = Modifier.padding(
                    top = 0.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 10.dp)
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

        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = "Te orientamos",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.W300,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.size(16.dp))
//        Text(
//            text = "Para lograr tus metas ahorrando en **Cuenta Futuro** o invirtiendo en **Fondos Mutuos.**",
//            style = TextStyle(
//                fontSize = 15.sp,
//                fontWeight = FontWeight.W300,
//                color = Color.Black
//            )
//        )
        Text(
            text = buildAnnotatedString {
                append("Para lograr tus metas ahorrando en ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Cuenta Futuro")
                }
                append(" o invirtiendo en ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Fondos Mutuos")
                }
                append(".")
            },
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.W300,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.size(22.dp))

        RectangleCard(
            "Ahorra con Cuenta Futuro",
            "¡Comienza ahora!",
            "icon2_2",
        )

        //add scroll of cards
        

        Spacer(modifier = Modifier.size(32.dp))
        Text("Mis Productos")
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_invest_screen),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }
//        Spacer(modifier = Modifier.size(16.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInversionesScreen(){
    MachTheme {
        InversionesScreen()
    }
}