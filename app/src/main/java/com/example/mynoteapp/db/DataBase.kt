package com.example.mynoteapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynoteapp.entity.NoteEntity
import com.example.mynoteapp.entity.UserEntity

@Database(entities = [NoteEntity::class, UserEntity::class], version = 1)

abstract class DateBase : RoomDatabase() {

    abstract fun getNotesDao(): NoteDao

    abstract fun getUserDao(): UserDao
}


