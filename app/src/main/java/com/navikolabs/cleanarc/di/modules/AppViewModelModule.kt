package com.navikolabs.cleanarc.di.modules

import androidx.lifecycle.ViewModel
import com.navikolabs.cleanarc.di.keys.ViewModelKey
import com.navikolabs.cleanarc.ui.home.presentation.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AppViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}