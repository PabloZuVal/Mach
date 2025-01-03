package com.pablozv.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.R
import com.pablozv.mach.ui.theme.MachTheme

@Composable
fun CardAccount(
    numeroTarjetaVirtual: String
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
        )
    ){
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = 12.dp,
                    vertical = 16.dp
                )
                .background(Color.Transparent)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Column {
                Text(
                    text = "Mi tarjeta Virtual",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))

                Text(
                    text = numeroTarjetaVirtual.chunked(4).joinToString(" "),
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal
                    )
                )

            }
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.End
            ){
                Icon(
                    painter = painterResource(id = R.drawable.visa_debit),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                )
            }

        }
    }

}

@Preview
@Composable
fun PreviewCardAccount(){
    MachTheme {
        EvolveAccountCard()
    }
}