package com.navikolabs.cleanarc.ui.home.presentation

import com.navikolabs.cleanarc.domain.usecases.AppUseCaseImpl
import com.navikolabs.cleanarc.ui.base.BaseViewModel
import com.navikolabs.cleanarc.ui.base.ViewState
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val appUseCaseImpl: AppUseCaseImpl) :
    BaseViewModel() {

    fun fetchUsers() {
        appUseCaseImpl.fetchUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ users ->
                _viewState.value = ViewState.success(users)
            }, { throwable ->
                _viewState.value = ViewState.error(throwable)
            })
    }

}