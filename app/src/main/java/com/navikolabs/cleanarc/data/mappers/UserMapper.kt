package com.navikolabs.cleanarc.data.mappers

import com.navikolabs.cleanarc.data.models.UserModel
import com.navikolabs.cleanarc.domain.model.User

fun UserModel.toPojo() = User(
    id = id, name = name, username = username, email = email, phone = phone, website = website
)

fun Iterable<UserModel>.toPojos(): List<User> =
    this.map { it.toPojo() }