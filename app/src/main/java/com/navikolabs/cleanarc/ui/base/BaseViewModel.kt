package com.navikolabs.cleanarc.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    protected val _viewState = MutableLiveData<ViewState<Any>>()
    val viewState: LiveData<ViewState<Any>>
        get() = _viewState

}