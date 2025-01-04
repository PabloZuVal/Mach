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
import androidx.compose.foundation.lazy.LazyColumn
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
import com.pablozv.mach.core.navigation.BottonSheetController
import com.pablozv.mach.ui.composable.HomeCardSection
import com.pablozv.mach.ui.composable.ScrollImages
import com.pablozv.mach.ui.composable.ShowMore


@OptIn(ExperimentalMaterial3Api::class)
@Composable()
fun InicioScreen(
    viewModel: InicioViewModel = hiltViewModel(),
    bottonSheetController: BottonSheetController
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            item {
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
            }

            item{
                Row {
                    Text("Que quieres hacer hoy?", modifier = Modifier.align(Alignment.CenterVertically))
                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        onClick = {
                            bottonSheetController.show {
                                Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                ){
                                    ShowMore()
                                }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    ) {
                        Text("Ver más")
                    }
                }
            }

            item {
                HomeCardSection()
            }

            item {
                ScrollImages()
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewInicioScreen(){
    MachTheme {
        InicioScreen(bottonSheetController = BottonSheetController())
    }
}