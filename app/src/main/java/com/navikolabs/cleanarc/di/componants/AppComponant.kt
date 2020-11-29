package com.navikolabs.cleanarc.di.componants

import com.navikolabs.cleanarc.app.AppController
import com.navikolabs.cleanarc.di.modules.*
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, ActivityBuildersModule::class,
        FragmentBuildersModule::class, AppModule::class, ViewModelFactoryModule::class,
        AppViewModelModule::class, NetworkModule::class, RepoModule::class, ApiModule::class]
)
interface AppComponant : AndroidInjector<AppController> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AppController>()
}
