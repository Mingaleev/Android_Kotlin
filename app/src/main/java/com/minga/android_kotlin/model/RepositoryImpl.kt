package com.minga.android_kotlin.model

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalWorld(): List<Weather> {
        return getWorldCities()
    }
}