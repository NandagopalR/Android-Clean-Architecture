package com.navikolabs.cleanarc.data.models

import com.google.gson.annotations.SerializedName

data class UserModel(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phone")
    val phone: String? = null,
    @SerializedName("website")
    val website: String? = null
)