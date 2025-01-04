package com.pablozv.mach.ui.composable


import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.pablozv.mach.R

@Composable
fun ScrollImages() {
    val scrollState2 = rememberScrollState()
    Row(
        modifier = Modifier
            .horizontalScroll(state = scrollState2)
    ) {
        Box(
        ) {
            Image(
                painter = painterResource(id = R.drawable.scroll1),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll2),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll3),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll4),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll5),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll6),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll7),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll8),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll9),
                contentDescription = null,
                modifier = Modifier
            )
        }
        Box() {
            Image(
                painter = painterResource(id = R.drawable.scroll10),
                contentDescription = null,
                modifier = Modifier
            )
        }
    }
}
