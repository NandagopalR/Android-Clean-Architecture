package com.navikolabs.cleanarc.ui.base

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.navikolabs.cleanarc.navigator.AppNavigator
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var appNavigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appNavigator = AppNavigator(this)
    }

}