package com.marcantonyc.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marcantonyc.mach.ui.theme.MachTheme

@Composable
fun TopBar(){
    Box( modifier = Modifier
        .fillMaxWidth()
        .background(
            MaterialTheme.colorScheme.primary
        )
    ){

        Row(
            modifier = Modifier.
            padding(top = 48.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
        ){

            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu",
                tint = MaterialTheme.colorScheme.onPrimary)
            Spacer(modifier = Modifier.width(16.dp))
            Text(" Hola Marcos",
                color = MaterialTheme.colorScheme.onPrimary)

            Row(modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.End) {
                Icon(imageVector = Icons.Default.Build, contentDescription = "Menu",
                    tint = MaterialTheme.colorScheme.onPrimary)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Menu",
                    tint = MaterialTheme.colorScheme.onPrimary)
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTopBar(){
    MachTheme {
        TopBar()
    }
}