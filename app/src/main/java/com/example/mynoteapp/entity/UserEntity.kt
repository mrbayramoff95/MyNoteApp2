package com.example.mynoteapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "user"
)

data class UserEntity(

    @ColumnInfo(name = "firstName")
    val firstName: String,

    @ColumnInfo(name = "lastName")
    val lastName: String,

    @PrimaryKey
    @ColumnInfo(name = "email")
    val email: String,

    @ColumnInfo(name = "password")
    val password: String

)