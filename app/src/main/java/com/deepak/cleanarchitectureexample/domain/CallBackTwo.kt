package com.deepak.cleanarchitectureexample.domain

import androidx.lifecycle.MutableLiveData

interface CallBackTwo {
    fun getData(): MutableLiveData<String>?
}