package com.navikolabs.cleanarc.data.api

import com.navikolabs.cleanarc.data.api.ApiConstants.API_GET_USER
import com.navikolabs.cleanarc.data.models.UserModel
import retrofit2.http.GET
import rx.Observable

interface AppApi {

    @GET(API_GET_USER)
    fun fetchUsers(): Observable<List<UserModel>>

}