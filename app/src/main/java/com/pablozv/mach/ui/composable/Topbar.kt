package com.pablozv.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
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

@Composable
fun TopBar(
    title: String,
    showBackButton: Boolean = false,
    onBackClick: (() -> Unit)? = null
){
    Box( modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.primary)
    ){

        Row(
            modifier = Modifier.
            padding(top = 48.dp, bottom = 10.dp, start = 16.dp, end = 16.dp)
        ) {
//            if (showBackButton) {
//                Icon(
//                    imageVector = Icons.Default.ArrowBack,
//                    contentDescription = "Back",
//                    tint = MaterialTheme.colorScheme.onPrimary,
//                    modifier = Modifier.clickable { onBackClick?.invoke() }
//                )
//                Spacer(modifier = Modifier.width(16.dp))
//            }

            if (title == "Inicio") {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )

                        Spacer(modifier = Modifier.width(14.dp))

                        Text(
                            text = "¡Hola Pablo!",
                            color = MaterialTheme.colorScheme.onPrimary,
                            style = MaterialTheme.typography.titleMedium
                        )
                    }

                    Row {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notifications",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Help",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            }

            if (title == "Transferir") {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        "Transferencias",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 20.dp, end = 25.dp, bottom = 15.dp)
                            .align(Alignment.CenterStart),
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            if (title == "Tarjetas") {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        "Tarjetas",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 20.dp, end = 25.dp, bottom = 15.dp)
                            .align(Alignment.CenterStart),
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            if (title == "Inversiones") {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Text(
                        "Mis inversiones",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 20.dp, end = 25.dp, bottom = 0.dp)
                            .align(Alignment.CenterStart),
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTopBar(){
    MachTheme {
        TopBar( title = "Inversiones")
    }
}