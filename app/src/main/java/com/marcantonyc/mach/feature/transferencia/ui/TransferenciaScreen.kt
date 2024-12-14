package com.marcantonyc.mach.feature.transferencia.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcantonyc.mach.ui.theme.MachTheme
import com.marcantonyc.mach.ui.composable.RectangleCard
import com.marcantonyc.mach.ui.composable.SquareCard

@Composable
fun TransferenciaScreen(
    onNavigateToVouchers: () -> Unit = {}
){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text("¿ Que quieres hacer hoy ?")

        Spacer(modifier = Modifier.height(16.dp))

        RectangleCard(
            "Cobra o paga por MACH",
            "Envia y recibe pagos de forma facil y rapida"
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Otras formas de transferir")

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SquareCard(
                "Link de cobro"
            )
            SquareCard(
                "QR \nMACH"
            )
            SquareCard(
                "A cuentas bancarias"
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SquareCard(
                "Al extranjero"
            )

        }

        Button(
            onClick = { onNavigateToVouchers() },
            modifier = Modifier.padding(top = 16.dp)
        ){
            Text("Ver Vouchers")
        }





    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTransferenciaScreen(){
    MachTheme {
        TransferenciaScreen()

    }

}