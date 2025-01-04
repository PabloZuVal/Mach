package com.pablozv.mach.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(
    isSheetVisible: Boolean,
    content: @Composable() (() -> Unit)?,
    onDismiss: () -> Unit,
) {
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )

    if (isSheetVisible) {
        ModalBottomSheet(
            modifier = Modifier
                .padding(top= 80.dp),
            onDismissRequest = onDismiss,
            sheetState = sheetState,
            content = {
                content?.invoke()
            }
        )
    }
}