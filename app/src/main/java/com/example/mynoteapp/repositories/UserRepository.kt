package com.example.mynoteapp.repositories

import com.example.mynoteapp.db.UserDao
import com.example.mynoteapp.model.User
import javax.inject.Inject

class UserRepository @Inject constructor(

    private val userDao: UserDao,

    private val sharedPreferences: SharedPreferenceRepository
) {

    fun addUser(user: User) = userDao.insertUser(user.toUserEntity())

    fun getUser(email: String, password: String): Boolean {
        return false
    }

    fun getUserByEmail(email: String): Boolean {
        return userDao.getUserByEmail(email) == null
    }

    suspend fun deleteUser() = userDao.run {
        deleteUser(
            getUserByEmail(sharedPreferences.getUserEmail())
        )
    }
}