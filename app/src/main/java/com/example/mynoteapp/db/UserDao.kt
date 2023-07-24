package com.example.mynoteapp.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mynoteapp.entity.UserEntity


@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUser(user: UserEntity)

    @Query(
        "SELECT * FROM user WHERE userEmail= :email LIMIT 1"
    )
    suspend fun getUser(email: String): UserEntity

    @Delete
    suspend fun deleteUser(user: Boolean)
}