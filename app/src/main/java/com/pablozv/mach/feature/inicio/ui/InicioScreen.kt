package com.pablozv.mach.feature.inicio.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pablozv.mach.ui.theme.MachTheme
import com.pablozv.mach.ui.composable.EvolveAccountCard
import com.pablozv.mach.ui.composable.CardAccount
import com.pablozv.mach.ui.composable.ScrollAccounts
import com.pablozv.mach.ui.composable.SquareCard
import androidx.hilt.navigation.compose.hiltViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable()
fun InicioScreen(
    viewModel: InicioViewModel = hiltViewModel()
){
    val userData by viewModel.userData.collectAsState()

    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(95.dp)
                .background(MaterialTheme.colorScheme.primary)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            userData?.let {data ->
                ScrollAccounts(
                    saldoActual = data.saldo_actual.toString(),
                    saldoCupoCredito = data.saldo_cupo_credito.toString(),
                    cashback = data.cashback,
                    saldoInversiones = data.saldo_inversiones.toString(),
                )
                EvolveAccountCard()
                CardAccount(
                    numeroTarjetaVirtual = data.numero_tarjeta_virtual
                )

            }
            Spacer(modifier = Modifier.height(24.dp))

            Row {
                Text("Que quieres hacer hoy?", modifier = Modifier.align(Alignment.CenterVertically))
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { showBottomSheet = true },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Text("Ver más")
                }
            }

            Row(
                modifier = Modifier
//                    .horizontalScroll(state = scrollState)
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

            if (showBottomSheet) {
                ModalBottomSheet(
                    onDismissRequest = { showBottomSheet = false },
                    sheetState = sheetState
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Productos",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )

                        // Aquí puedes añadir más SquareCards u otras opciones
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "Servicios",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }

                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "AAAA",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            Text("Cuenta", modifier = Modifier.align(Alignment.CenterVertically))
                            Box(
                                Modifier.padding(end = 8.dp)
                            ){
                                SquareCard("Nueva\nOpción", "icon9")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                            Box(
                                Modifier.padding(horizontal = 8.dp)
                            ){
                                SquareCard("Otra\nOpción", "icon10")
                            }
                        }

                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))


        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewInicioScreen(){
    MachTheme {
        InicioScreen()
    }
}