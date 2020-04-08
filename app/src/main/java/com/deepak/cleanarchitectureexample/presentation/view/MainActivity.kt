package com.deepak.cleanarchitectureexample.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.deepak.cleanarchitectureexample.R
import com.deepak.cleanarchitectureexample.databinding.ActivityMainBinding
import com.deepak.cleanarchitectureexample.presentation.viewmodel.CallBackOneViewModel
import com.deepak.cleanarchitectureexample.presentation.viewmodel.CallBackTwoViewModel
import com.deepak.cleanarchitectureexample.presentation.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val userViewModel = UserViewModel()
        activityMainBinding.viewmodel = userViewModel
        val callBackOneViewModel = CallBackOneViewModel()

        val callBackTwoViewModel = CallBackTwoViewModel()
        activityMainBinding.viewmodelcallback = callBackOneViewModel
        userViewModel.getUserMutableLiveDate().observe(this, Observer {
            userViewModel.user.postValue(it.name)

        })
        callBackOneViewModel.stringMutableLiveData.observe(this, Observer {
            Log.d("one", it)
        })
        callBackTwoViewModel.data.observe(this, Observer {
            Log.d("two", it)
        })
    }
}
