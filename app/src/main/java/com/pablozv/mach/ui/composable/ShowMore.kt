package com.pablozv.mach.ui.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ShowMore() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        item {
            Text(
                text = "Productos",
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        item {
            Text(
                text = "Cuenta",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("MACH Premium", "cuenta_icon_1")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Declara tu\nrenta", "cuenta_icon_2")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Invita y\ngana", "cuenta_icon_3")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Seguridad MACH", "cuenta_icon_4")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Ayuda\nen línea", "cuenta_icon_5")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Ver mis\nmovimientos", "cuenta_icon_6")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Compartir datos", "cuenta_icon_7")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Equipo\nMACH", "cuenta_icon_8")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Abona\ntu sueldo", "cuenta_icon_9")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
        item {
            Text(
                text = "Pagos",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Mi\nSuscripción", "pagos_icon_1")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Conexiones\ny alianzas", "pagos_icon_2")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Recarga\nprepago", "pagos_icon_3")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Recarga\ntu bip!", "pagos_icon_4")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Parking\ndigital", "pagos_icon_5")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Beneficios\nBciPlus+", "pagos_icon_6")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Paga tus\ncuentas", "pagos_icon_7")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
        item {
            Text(
                text = "Transferencias",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
       item {
           Row(
               modifier = Modifier.fillMaxWidth()
                   .padding(bottom = 16.dp)
           ) {
               Box(
                   Modifier.padding(end = 8.dp)
               ){
                   SquareCard("A cuentas bancarias", "transf_icon_1")
               }
               Box(
                   Modifier.padding(horizontal = 8.dp)
               ){
                   SquareCard("Al\nExtranjero", "transf_icon_2")
               }
               Box(
                   Modifier.padding(horizontal = 8.dp)
               ){
                   SquareCard("Cobrar\n o pagar", "transf_icon_3")
               }
           }
           Row(
               modifier = Modifier.fillMaxWidth()
           ) {
               Box(
                   Modifier.padding(end = 8.dp)
               ){
                   SquareCard("Carga o\nretira", "transf_icon_4")
               }
           }
           Spacer(modifier = Modifier.height(24.dp))

       }

        item {
            Text(
                text = "Productos financieros",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Cuenta\nFuturo", "product_icon_1")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Fondos\nMutuos", "product_icon_2")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Contrata\nSeguros", "product_icon_3")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Referir\nseguros", "prod_icon_4")
                }
            }
            Spacer(modifier = Modifier.height(100.dp))

        }


    }
}