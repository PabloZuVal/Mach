package com.pablozv.mach.feature.pin.ui

import android.content.Intent
import android.util.Log
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pablozv.mach.MainActivity
import kotlinx.coroutines.delay


@Composable
fun PinScreen() {

    val context = LocalContext.current
    val mach = arrayListOf('M', 'A', 'C', 'H')
    val pines by remember { mutableStateOf(ArrayList<Int>()) }
    var count by remember { mutableIntStateOf(0) }

    LaunchedEffect(count) {
        if(count == 4){
            delay(2000)
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun setPin(pin: Int){
        if(pines.size < 4){
            pines.add(pin)
        }

        count = pines.size
    }

    fun removeLastPin(){
        if(pines.size > 0){
            pines.removeLast()
        }
        count = pines.size
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            ,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier.size(64.dp))
            Text(
                text ="Ingresa tu PIN",
                style = TextStyle(
                    fontSize = 24.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                for(i in 0..3){

                    if( i >= pines.size){
                        Text(
                            textAlign = TextAlign.Center,
                            text = "o",
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimary

                            )

                        )
                    }
                    else{
                        Text(
                            textAlign = TextAlign.Center,
                            text = mach[i].toString(),                            style = TextStyle(
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimary

                            )

                        )

                    }
                    Spacer(modifier = Modifier.size(16.dp))
                }

            }

            Text(
                text ="$count",
                style = TextStyle(
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            (1..9).chunked(3).forEach { row ->
                Row(horizontalArrangement = Arrangement.spacedBy(32.dp)) {
                    row.forEach { number ->

                            Text(
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .clickable {
                                        setPin(number)
                                    }
                                    .size(100.dp, 80.dp),
                                text = "$number",
                                style = TextStyle(
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimary

                                )

                            )

                    }

                }
            }

            Row(horizontalArrangement = Arrangement.spacedBy(32.dp)) {

                    Text(
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .clickable {
                                removeLastPin()
                            }
                            .size(100.dp, 80.dp),
                        text = "<",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary

                        )

                    )

                    Text(
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .clickable {
                                setPin(0)
                            }
                            .size(100.dp, 80.dp),
                        text = "0",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary

                        )

                    )

                    Spacer(modifier = Modifier.size(100.dp , 80.dp))


            }

            Spacer(modifier = Modifier.size(32.dp))

            Text(
                text ="Olvidé mi PIN",
                style = TextStyle(
                    fontSize = 24.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
            Spacer(modifier = Modifier.size(40.dp))


        }





    }
}
@Preview(showBackground = true)
@Composable
fun PreviewPinScreen(){
    PinScreen()
}