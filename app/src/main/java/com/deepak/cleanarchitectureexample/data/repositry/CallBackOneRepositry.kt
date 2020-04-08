package com.deepak.cleanarchitectureexample.data.repositry

import androidx.lifecycle.MutableLiveData
import com.deepak.cleanarchitectureexample.domain.CallBackOne
import kotlin.Result.Companion.success

class CallBackOneRepositry {
    val stringMutableLiveData: MutableLiveData<String> = MutableLiveData()

    constructor() {

    }

    fun getData(name: String, callBackOne: CallBackOne) {
        if (name == "deepak") {
            stringMutableLiveData.value = "This is the callback"
            callBackOne.success(stringMutableLiveData)
        } else {
            stringMutableLiveData.value = "error"
            callBackOne.failure(stringMutableLiveData)
        }
    }
}