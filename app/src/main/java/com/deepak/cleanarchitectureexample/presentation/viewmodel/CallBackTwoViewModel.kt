package com.deepak.cleanarchitectureexample.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepak.cleanarchitectureexample.data.repositry.CallBackOneRepositry
import com.deepak.cleanarchitectureexample.domain.CallBackOne
import com.deepak.cleanarchitectureexample.domain.CallBackTwo
import com.deepak.cleanarchitectureexample.domain.CallBackTwoImp

class CallBackTwoViewModel : ViewModel {
    var data: MutableLiveData<String>
    val callBackTwoImp: CallBackTwoImp

    constructor() {


        callBackTwoImp = CallBackTwoImp()
        data = callBackTwoImp.getData()!!
    }
}