package com.navikolabs.cleanarc.data.repo

import com.navikolabs.cleanarc.data.api.AppApi
import com.navikolabs.cleanarc.data.mappers.toPojos
import com.navikolabs.cleanarc.domain.model.User
import com.navikolabs.cleanarc.domain.repository.AppRepo
import rx.Observable
import javax.inject.Inject

class AppRepoImpl @Inject constructor(private val appApi: AppApi) : AppRepo {

    override fun fetchUserList(): Observable<List<User>> {
        return appApi.fetchUsers()
            .map { userModels -> userModels.toPojos() }
    }
}