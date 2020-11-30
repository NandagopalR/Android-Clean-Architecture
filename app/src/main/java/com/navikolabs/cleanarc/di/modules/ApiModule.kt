package com.navikolabs.cleanarc.di.modules

import com.navikolabs.cleanarc.data.api.AppApi
import com.navikolabs.cleanarc.data.preferences.AppPreference
import com.navikolabs.cleanarc.data.repo.AppRepoImpl
import com.navikolabs.cleanarc.domain.repository.AppRepo
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun bindAppApi(retrofit: Retrofit): AppApi {
        return retrofit.create(AppApi::class.java)
    }

    @Provides
    @Singleton
    fun bindsAppRepoImpl(appApi: AppApi, appPreference: AppPreference): AppRepo {
        return AppRepoImpl(appApi, appPreference)
    }
}