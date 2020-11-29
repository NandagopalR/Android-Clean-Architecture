package com.navikolabs.cleanarc.domain.usecases

import com.navikolabs.cleanarc.domain.model.User
import com.navikolabs.cleanarc.domain.repository.AppRepo
import rx.Observable
import javax.inject.Inject

class AppUseCaseImpl @Inject constructor(private val appRepo: AppRepo) : AppUseCase {

    override fun fetchUsers(): Observable<List<User>> {
        return appRepo.fetchUserList()
    }
}