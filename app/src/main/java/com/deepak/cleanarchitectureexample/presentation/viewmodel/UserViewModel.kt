package com.deepak.cleanarchitectureexample.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepak.cleanarchitectureexample.data.model.User
import com.deepak.cleanarchitectureexample.data.repositry.UserRepositry

class UserViewModel() : ViewModel() {
    val userRepositry: UserRepositry = UserRepositry()
    var user: MutableLiveData<String> = MutableLiveData()

fun getUserMutableLiveDate(): MutableLiveData<User> {
    return userRepositry.usermutablelivedata
}
}