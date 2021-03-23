package com.minga.android_kotlin.model

class RepositoryImpl: Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocal(): Weather {
        return Weather()
    }
}