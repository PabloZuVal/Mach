package com.pablozv.mach.feature.transferencia.ui

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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.ui.theme.MachTheme
import com.pablozv.mach.ui.composable.RectangleCard
import com.pablozv.mach.ui.composable.SquareCard

@Composable
fun TransferenciaScreen(
    onNavigateToVouchers: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(95.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Text(
                "Transferencias",
                modifier = Modifier
                    .padding(30.dp)
                    .align(Alignment.CenterStart),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Spacer(modifier = Modifier.height(16.dp))

//            Text("¿ Qué quieres hacer hoy ?")
            Text("¿ Qué quieres hacer hoy ?", modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(16.dp))

            RectangleCard(
                "Cobra o paga por MACH",
                "Envia y recibe pagos de forma facil \ny rapida",
                "transf_icon_3",
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("Otras formas de transferir", modifier = Modifier.align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SquareCard(
                    "Link de cobro",
                    "link_cobro"
                )
                SquareCard(
                    "QR \nMACH",
                    "qr_pay"
                )
                SquareCard(
                    "A cuentas\nbancarias",
                    "to_account"
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SquareCard(
                    "Al\nextranjero",
                    "to_world"
                )
            }
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