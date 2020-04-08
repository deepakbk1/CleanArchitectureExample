package com.deepak.cleanarchitectureexample.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepak.cleanarchitectureexample.data.repositry.CallBackOneRepositry
import com.deepak.cleanarchitectureexample.domain.CallBackOne

class CallBackOneViewModel : ViewModel {
    private val callBackOneRepositry: CallBackOneRepositry = CallBackOneRepositry()
    var stringMutableLiveData: MutableLiveData<String> = MutableLiveData()

    constructor() {


        callBackOneRepositry.getData("deepak", object : CallBackOne {
            override fun success(data: MutableLiveData<String>) {
                stringMutableLiveData = data
            }

            override fun failure(error: MutableLiveData<String>) {
                stringMutableLiveData = error
            }
        })
    }
}