package com.navikolabs.cleanarc.di.modules

import androidx.lifecycle.ViewModelProvider
import com.navikolabs.cleanarc.di.factory.AppViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factoryApp: AppViewModelFactory): ViewModelProvider.Factory
}
