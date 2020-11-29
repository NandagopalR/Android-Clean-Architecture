package com.navikolabs.cleanarc.domain.model

data class User(
    val id: Long,
    val name: String,
    val username: String,
    val email: String,
    val phone: String? = null,
    val website: String? = null
)