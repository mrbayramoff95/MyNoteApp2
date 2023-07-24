package com.example.mynoteapp.util

import com.example.mynoteapp.entity.UserEntity
import com.example.mynoteapp.model.User

fun User.toUserEntity() = UserEntity(
    firstName,
    lastName,
    email,
    password
)