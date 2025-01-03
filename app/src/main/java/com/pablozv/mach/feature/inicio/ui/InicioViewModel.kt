package com.pablozv.mach.feature.inicio.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pablozv.mach.feature.inicio.domain.model.UserData
import com.pablozv.mach.feature.inicio.domain.usecase.GetUserDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InicioViewModel @Inject constructor(
    private val getUserDataUseCase: GetUserDataUseCase
) : ViewModel() {
    private val _userData = MutableStateFlow<UserData?>(null)
    val userData: StateFlow<UserData?> = _userData

    init {
        loadUserData()
    }

    private fun loadUserData() {
        viewModelScope.launch {
            try {
                val data = getUserDataUseCase()
                _userData.value = data
            } catch (e: Exception) {
                // Manejar el error según necesites

            }
        }
    }
}