package com.minga.android_kotlin.model

data class Weather (
    val city: String,
    val condition: String,
    val temperature: Int,
    val feels_like: Int
)