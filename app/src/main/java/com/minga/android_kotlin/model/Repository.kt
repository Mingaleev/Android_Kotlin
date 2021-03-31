package com.minga.android_kotlin.model

interface Repository {

    fun getWeatherFromServer(): Weather

    fun getWeatherFromLocalRus(): List<Weather>

    fun getWeatherFromLocalWorld(): List<Weather>
}