package com.marcantonyc.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.marcantonyc.mach.ui.theme.MachTheme

@Composable
fun AccountCard(
    accountName: String = "Cuenta Vista BCI 7770 19 192 981 ",
    accountBalance: String = "$ 2.500.000"
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onSurface,
        )
    ){
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = 16.dp,
                    vertical = 16.dp
                )
                .background(Color.Transparent)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Column {
                Text(
                    text = "Mi cuenta MACH",
                    color = MaterialTheme.colorScheme.secondary,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                )

                Text(
                    text = accountName,
                    color = MaterialTheme.colorScheme.tertiary,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "Saldo disponible",
                    color = MaterialTheme.colorScheme.primary,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Text(
                    text = accountBalance,
                    color = MaterialTheme.colorScheme.primary,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End,
            ) {
                Icon(imageVector =
                    Icons.Default.Share, contentDescription ="share",
                    modifier = Modifier.size(20.dp),
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }

        }
    }

}

@Preview
@Composable
fun PreviewAccountCard(){
    MachTheme {
        AccountCard()
    }
}