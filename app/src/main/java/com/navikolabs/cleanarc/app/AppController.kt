package com.navikolabs.cleanarc.app

import com.navikolabs.cleanarc.di.componants.DaggerAppComponant
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppController : DaggerApplication() {

    companion object {
        lateinit var instance: AppController
            @Synchronized
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponant.builder().create(this)
    }
}