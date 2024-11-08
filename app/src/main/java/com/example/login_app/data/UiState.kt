package com.example.login_app.data

data class UiState(
    val token: String = "",
    val message: String = "",
    val isLoading: Boolean = false,
    val error: String = ""
)