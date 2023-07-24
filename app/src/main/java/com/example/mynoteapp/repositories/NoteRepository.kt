package com.example.mynoteapp.repositories

import com.example.mynoteapp.db.NoteDao
import com.example.mynoteapp.model.Note
import com.example.mynoteapp.util.toNoteEntity
import javax.inject.Inject


class NoteRepository @Inject constructor(

    private val noteDao: NoteDao,
    sharedPreferences: SharedPreferenceRepository
) {

    private val email = sharedPreferences.getUserEmail()

    fun getListOfNotes(): ArrayList<Note> {
        return (noteDao.getAllNotes(email).listToNote() as? ArrayList<Note>)
            ?: arrayListOf()
    }

    fun addNote(note: Note): Boolean {
        noteDao.insertNote(note.toNoteEntity(email))
        return true
    }

    fun searchNotes(value: String): ArrayList<Note> {
        return noteDao.searchNotes(value,
            email).listToNote() as ArrayList<Note>
    }

    fun deleteAllNotes(): Boolean {
        noteDao.deleteAllNotes(email)
        return true
    }

    fun deleteNote(note: Note): Boolean {
        noteDao.deleteNote(note.toNoteEntity(email))
        return true
    }

    }
