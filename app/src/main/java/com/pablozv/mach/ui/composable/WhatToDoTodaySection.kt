package com.pablozv.mach.ui.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WhatToDoTodaySection() {
    // Component what to do today
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
    ){
        Box(
            Modifier.padding(end = 8.dp)
        ){
            SquareCard("Compra en\nCuotas", "icon3")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            SquareCard("MACH\nPremium", "icon4")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            SquareCard("Invita y\ngana","icon5")
        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            SquareCard("Beneficios\nBciPlus+", "icon6")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            SquareCard("Paga tus\ncuentas", "icon7")
        }
        Box(
            Modifier.padding(horizontal = 8.dp)
        ){
            SquareCard("Parking\ndigital", "icon8")
        }
    }

    Spacer(modifier = Modifier.height(24.dp))
}