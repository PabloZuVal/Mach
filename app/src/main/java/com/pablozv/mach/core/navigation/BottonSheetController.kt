package com.pablozv.mach.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BottonSheetController {
    var isVisible by mutableStateOf(false)
        private set

    var content: @Composable (() -> Unit)? by mutableStateOf(null)
        private set

    fun show(newContent: @Composable () -> Unit) {
        content = newContent
        isVisible = true
    }

    fun hide() {
        content = null
        isVisible = false
    }
}