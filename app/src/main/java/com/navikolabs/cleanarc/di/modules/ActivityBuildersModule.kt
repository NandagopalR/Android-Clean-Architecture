package com.navikolabs.cleanarc.di.modules

import com.navikolabs.cleanarc.ui.home.view.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuildersModule {

    @ContributesAndroidInjector
    fun contributeHomeActivity(): HomeActivity

}
