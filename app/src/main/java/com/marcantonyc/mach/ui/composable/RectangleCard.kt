package com.marcantonyc.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
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
fun RectangleCard(
    title: String = "Default title",
    description: String = "Default description",
    icon: ImageVector = Icons.Default.AccountCircle, ){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
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
                    vertical = 8.dp
                )
                .background(Color.Transparent)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(imageVector = icon, contentDescription ="",
                modifier = Modifier
                    .size(40.dp),
                tint = MaterialTheme.colorScheme.primary

            )
            Spacer(modifier = Modifier.size(16.dp))

            Column {
                Text(
                    text = title,
                    color = MaterialTheme.colorScheme.secondary,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = description,
                    color = MaterialTheme.colorScheme.tertiary,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewRectangleCard(){
    MachTheme {
        Column(
            modifier = Modifier
                .size(200.dp)
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            RectangleCard()
        }
    }
}