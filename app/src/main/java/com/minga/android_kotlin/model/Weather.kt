package com.minga.android_kotlin.model

data class Weather (
    val city: String = "Казань",
    val condition: String = "Ясно",
    val temperature: Int = 0,
    val feels_like: Int = 0
)