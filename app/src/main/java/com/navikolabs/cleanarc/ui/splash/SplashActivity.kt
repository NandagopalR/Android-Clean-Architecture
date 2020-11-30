package com.navikolabs.cleanarc.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.navikolabs.cleanarc.R
import com.navikolabs.cleanarc.di.factory.bindViewModel
import com.navikolabs.cleanarc.ui.base.BaseActivity
import com.navikolabs.cleanarc.ui.splash.presentation.SplashViewModel

class SplashActivity : BaseActivity() {

    private lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashViewModel = viewModelFactory.bindViewModel(this)
        Handler(Looper.getMainLooper()).postDelayed({
            appNavigator.showHomeActivity()
            finish()
        }, 1000)
    }

}