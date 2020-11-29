package com.navikolabs.cleanarc.domain.repository

import com.navikolabs.cleanarc.domain.model.User
import rx.Observable

interface AppRepo {
    fun fetchUserList(): Observable<List<User>>
}