package com.minga.android_kotlin.model

data class Weather(
    val city: City = getDefaultCity(),
    val condition: String = "Ясно",
    val temperature: Int = 25,
    val feels_like: Int = 30
)

fun getDefaultCity () = City ("Москва", 55.75222, 37.61556)