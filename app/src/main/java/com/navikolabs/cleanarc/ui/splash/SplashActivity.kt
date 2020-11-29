package com.navikolabs.cleanarc.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.navikolabs.cleanarc.R
import com.navikolabs.cleanarc.ui.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            appNavigator.showHomeActivity()
            finish()
        }, 1000)
    }

}