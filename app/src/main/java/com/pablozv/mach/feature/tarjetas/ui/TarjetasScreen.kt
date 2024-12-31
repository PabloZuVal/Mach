package com.pablozv.mach.feature.tarjetas.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import com.pablozv.mach.ui.theme.MachTheme

@Composable
fun TarjetasScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),

    ) {

        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {

            Text("Saldo",
                style = TextStyle(
                    fontSize = 14.sp
                )
            )
            Text(" $ 2.500.000",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }


        HorizontalDivider(thickness = 1.dp)


        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {

            Row(
                modifier = Modifier
                    .weight(1f)
            ){
                Text("En dólares",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Text(" $ 2.500",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Row(
                modifier = Modifier
                    .weight(1f)
            ){
                Text("Tipo de cambio",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Text(" $ 1000",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
        

        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(16.dp))

        Text("Tu tarjeta MACH",
            modifier = Modifier
                .padding(16.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "icon",
                modifier = Modifier
                    .size(54.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Column{
                Text("Tarjeta virual",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                )
                Text("**** 1234",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondary
                    )
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.End

            ) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "icon")
            }
        }
        HorizontalDivider(thickness = 1.dp)
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = "icon",
                modifier = Modifier
                    .size(54.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Column{
                Text("Tarjeta Fisica",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                )
                Text("**** 1234",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondary
                    )
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.End

            ) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "icon")
            }
        }
        HorizontalDivider(thickness = 1.dp)



        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text("Opciones",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){

                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "icon",
                    modifier = Modifier
                        .size(54.dp),
                    tint = MaterialTheme.colorScheme.primary
                )

                Text(text = "Recargar")

                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.End

                ) {
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "icon")
                }

            }

        }
        HorizontalDivider(thickness = 1.dp)





    }
}

@Preview(showBackground = true)
@Composable
fun TarjetasScreenPreview(){
    MachTheme {
        TarjetasScreen()
    }
}