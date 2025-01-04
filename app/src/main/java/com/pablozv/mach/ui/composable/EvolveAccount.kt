package com.pablozv.mach.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pablozv.mach.R
import com.pablozv.mach.ui.theme.MachTheme

@Composable
fun EvolveAccountCard(){
    Image(
        painter = painterResource(id = R.drawable.image1),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    )
}

@Preview
@Composable
fun PreviewEvolveMasCard(){
    MachTheme {
        EvolveAccountCard()
    }
}