package com.example.mynoteapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "note"
)

data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long,

    @ColumnInfo(name = "note_email")
    val email: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "message")
    val message: Long,

    @ColumnInfo(name = "date")
    val date: String,

    )