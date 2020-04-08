package com.deepak.cleanarchitectureexample.domain

import androidx.lifecycle.MutableLiveData

interface CallBackOne{
    fun success(data: MutableLiveData<String>)
    fun failure(error: MutableLiveData<String>)
}