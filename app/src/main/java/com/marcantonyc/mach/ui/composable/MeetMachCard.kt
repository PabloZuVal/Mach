package com.marcantonyc.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marcantonyc.mach.ui.theme.MachTheme

@Composable
fun MeetMachCard(
    title: String ="meet mach title",
    titleColor: Color = MaterialTheme.colorScheme.onPrimary,
    buttonText: String ="meet mach button",
    buttonColor: Color = MaterialTheme.colorScheme.onPrimary,
    buttonTextColor: Color = MaterialTheme.colorScheme.primary,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    icon: ImageVector = Icons.Default.ShoppingCart
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
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
                    text = title,
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))


                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor,
                    )

                ) {
                    Text(
                        text = buttonText,
                        color = buttonTextColor,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = MaterialTheme.colorScheme.onPrimary

                        )
                    )
                }

            }
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.End
            ){

                Icon(
                    imageVector = icon,
                    contentDescription = "",
                    modifier = Modifier.size(100.dp),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

        }
    }

}

@Preview
@Composable
fun PreviewMeetMachCard(){
    MachTheme {
        MeetMachCard()
    }
}