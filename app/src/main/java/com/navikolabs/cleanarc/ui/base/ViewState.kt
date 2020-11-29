package com.navikolabs.cleanarc.ui.base

import com.navikolabs.cleanarc.ui.base.ResponseStatus.ERROR
import com.navikolabs.cleanarc.ui.base.ResponseStatus.FAIL
import com.navikolabs.cleanarc.ui.base.ResponseStatus.SUCCESS

class ViewState<T> private constructor(val status: Int, val data: T?, val throwable: Throwable?) {
    companion object {

        fun <T> success(data: T): ViewState<T> {
            return ViewState(SUCCESS, data, null)
        }

        fun <T> failure(data: T): ViewState<T> {
            return ViewState(FAIL, data, null)
        }

        fun <T> error(error: Throwable): ViewState<T> {
            return ViewState(ERROR, null, error)
        }
    }

}
