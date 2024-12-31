package com.pablozv.mach.ui.composable

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.R
import com.pablozv.mach.ui.theme.MachTheme

@Composable
fun AccountCard(
    text1: String,
    text2: String,
    amount: String,
    cardHeight: Dp = 100.dp, // default height
    backgroundColor: Color = MaterialTheme.colorScheme.onSurface

){
    val isAmountVisible = remember { mutableStateOf(true) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(320.dp)
            .height(cardHeight),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor,
        )
    ){
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = 12.dp,
                    vertical = 16.dp
                )
                .background(Color.Transparent),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = text1,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = text2,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = amount,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
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
fun PreviewAccountCard(){
    MachTheme {
        AccountCard(
            text1 = "Mi tarjeta Virtual",
            text2 = "* * * * 1234",
            amount = "$ 1,000.00"
        )
    }
}