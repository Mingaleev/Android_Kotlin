package com.minga.android_kotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minga.android_kotlin.model.Repository
import com.minga.android_kotlin.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) : ViewModel() {

    fun getLiveData(): LiveData<AppState> = liveDataToObserve

    fun getWeatherFromLocalSource(){
        getDataFromLocalSource()
    }

    private fun getDataFromLocalSource(){
        liveDataToObserve.value = AppState.Loading
        Thread{
            sleep(1000)
            val data = repositoryImpl.getWeatherFromLocal()
            liveDataToObserve.postValue(AppState.Success(data))
        }
    }

}