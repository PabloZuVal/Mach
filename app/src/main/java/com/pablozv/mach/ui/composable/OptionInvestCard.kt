package com.pablozv.mach.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.R
import com.pablozv.mach.ui.theme.MachTheme

@Composable
fun OptionInvestCard(title: String = "Default title", iconName: String = ""){

    val context = LocalContext.current
    val iconId = remember(iconName) {
        if (iconName.isEmpty()) {
            0
        } else {
            context.resources.getIdentifier(iconName, "drawable", context.packageName)
        }
    }

    Card(
        modifier = Modifier
            .size(width = 130.dp, height = 100.dp)
        ,
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFECE5F5),
        ),

    ){
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
                .background(Color.Transparent)
        ) {

            Icon(
                painter = if(iconId != 0) painterResource(id = iconId) else painterResource(id = R.drawable.icon1),
                contentDescription = "",
                modifier = Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = title,
                color = MaterialTheme.colorScheme.secondary,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewOptionInvestCard(){
    MachTheme {
        Column(
            modifier = Modifier
                .size(200.dp)
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            OptionInvestCard("Invertir en \nFondos Mutuos", "icon_plus")
        }
    }
}