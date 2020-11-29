package com.navikolabs.cleanarc.data.api

import com.navikolabs.cleanarc.data.models.UserModel
import retrofit2.http.GET
import rx.Observable

interface AppApi {

    @GET("users")
    fun fetchUsers(): Observable<List<UserModel>>

}