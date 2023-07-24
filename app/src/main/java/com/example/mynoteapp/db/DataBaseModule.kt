package com.example.mynoteapp.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideNotes(@ApplicationContext context: Context): NoteDao {
        return Room.databaseBuilder(context, DateBase::class.java, "data-base").build().getNotesDao()
    }

    @Provides
    @Singleton
    fun provideUser(@ApplicationContext context: Context): UserDao {
        return Room.databaseBuilder(context, DateBase::class.java, "data-base").build().getUserDao()
    }

}