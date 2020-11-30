package com.navikolabs.cleanarc.di.modules

import android.content.Context
import com.navikolabs.cleanarc.app.AppController
import com.navikolabs.cleanarc.data.preferences.AppPreference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun providesContext(): Context {
        return AppController.instance.applicationContext
    }

    @Provides
    @Singleton
    internal fun providesAppPreference(context: Context): AppPreference {
        return AppPreference(context)
    }
}