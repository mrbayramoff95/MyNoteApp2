package com.example.mynoteapp.util

import com.example.mynoteapp.entity.NoteEntity
import com.example.mynoteapp.model.Note


fun Note.toNoteEntity(email: String) =
    NoteEntity(
        id,
        title,
        message,
        date,
        email
    )