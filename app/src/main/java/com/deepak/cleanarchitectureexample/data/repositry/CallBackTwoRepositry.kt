package com.deepak.cleanarchitectureexample.data.repositry

import androidx.lifecycle.MutableLiveData
import com.deepak.cleanarchitectureexample.domain.CallBackOne
import kotlin.Result.Companion.success

class CallBackTwoRepositry {

    val data: MutableLiveData<String> = MutableLiveData()

    constructor() {

    }

    companion object {
        fun getData(callBackTwoRepositry: CallBackTwoRepositry): MutableLiveData<String> {

            callBackTwoRepositry.data.value = "This is the second callback"
            return callBackTwoRepositry.data
        }
    }
}