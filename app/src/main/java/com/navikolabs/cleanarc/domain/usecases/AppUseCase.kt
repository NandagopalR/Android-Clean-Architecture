package com.navikolabs.cleanarc.domain.usecases

import com.navikolabs.cleanarc.domain.model.User
import rx.Observable

interface AppUseCase {

    fun fetchUsers(): Observable<List<User>>

}