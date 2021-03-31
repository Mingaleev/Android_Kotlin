package com.minga.android_kotlin.viewmodel

import com.minga.android_kotlin.model.Weather

sealed class AppState {

    data class Success(val weatherData: List<Weather>) : AppState()

    data class Error(val error: Throwable?) : AppState()

    object Loading : AppState()

}