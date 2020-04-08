package com.deepak.cleanarchitectureexample.domain

import androidx.lifecycle.MutableLiveData
import com.deepak.cleanarchitectureexample.data.repositry.CallBackTwoRepositry

class CallBackTwoImp : CallBackTwo {
    lateinit var callBackTwoRepositry: CallBackTwoRepositry
    private lateinit var data: MutableLiveData<String>

    constructor()

    override fun getData(): MutableLiveData<String>? {
        callBackTwoRepositry = CallBackTwoRepositry()
         data = CallBackTwoRepositry.getData(callBackTwoRepositry)

        return data
    }
}