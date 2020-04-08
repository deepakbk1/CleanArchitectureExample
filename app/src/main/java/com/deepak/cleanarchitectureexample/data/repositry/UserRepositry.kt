package com.deepak.cleanarchitectureexample.data.repositry

import androidx.lifecycle.MutableLiveData
import com.deepak.cleanarchitectureexample.data.model.User

class UserRepositry {
     var user: User
    var usermutablelivedata: MutableLiveData<User>


    constructor() {
        user = User("Deepak")
        usermutablelivedata = MutableLiveData(user)
    }


}