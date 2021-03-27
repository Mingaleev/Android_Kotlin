package com.minga.android_kotlin.model

interface Repository {

    fun getWeatherFromServer(): Weather

    fun getWeatherFromLocal(): Weather
}