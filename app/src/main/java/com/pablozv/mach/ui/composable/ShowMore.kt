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
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Nueva\nOpción", "icon9")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
        item {
            Text(
                text = "Servicios",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Nueva\nOpción", "icon9")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Nueva\nOpción", "icon9")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
        item {
            Text(
                text = "AAAA",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
       item {
           Row(
               modifier = Modifier.fillMaxWidth()
           ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
               Box(
                   Modifier.padding(end = 8.dp)
               ){
                   SquareCard("Nueva\nOpción", "icon9")
               }
               Box(
                   Modifier.padding(horizontal = 8.dp)
               ){
                   SquareCard("Otra\nOpción", "icon10")
               }
               Box(
                   Modifier.padding(horizontal = 8.dp)
               ){
                   SquareCard("Otra\nOpción", "icon10")
               }
           }
           Spacer(modifier = Modifier.height(24.dp))
       }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Nueva\nOpción", "icon9")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                Box(
                    Modifier.padding(end = 8.dp)
                ){
                    SquareCard("Nueva\nOpción", "icon9")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
                Box(
                    Modifier.padding(horizontal = 8.dp)
                ){
                    SquareCard("Otra\nOpción", "icon10")
                }
            }
        }


    }
}