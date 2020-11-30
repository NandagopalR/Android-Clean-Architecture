package com.navikolabs.cleanarc.di.modules

import com.navikolabs.cleanarc.ui.home.view.HomeActivity
import com.navikolabs.cleanarc.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuildersModule {

    @ContributesAndroidInjector
    fun contributeHomeActivity(): HomeActivity

    @ContributesAndroidInjector
    fun contributeSplashActivity(): SplashActivity

}
