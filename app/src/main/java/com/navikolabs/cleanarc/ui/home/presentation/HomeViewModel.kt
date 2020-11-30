package com.navikolabs.cleanarc.ui.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.navikolabs.cleanarc.data.preferences.AppPreference
import com.navikolabs.cleanarc.domain.usecases.AppUseCaseImpl
import com.navikolabs.cleanarc.ui.base.BaseViewModel
import com.navikolabs.cleanarc.ui.base.ViewState
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val appUseCaseImpl: AppUseCaseImpl,
    private val appPreference: AppPreference
) :
    BaseViewModel() {

    fun fetchUsers(): LiveData<ViewState<Any>> {
        val response = MutableLiveData<ViewState<Any>>()
        appUseCaseImpl.fetchUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ users ->
                response.value = ViewState.success(users)
            }, { throwable ->
                response.value = ViewState.error(throwable)
            })
        return response
    }

    fun getPrefData(): String {
        return appPreference.toString()
    }

}