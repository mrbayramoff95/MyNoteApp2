package com.example.mynoteapp.ui.notes

import androidx.lifecycle.ViewModel
import com.example.mynoteapp.repositories.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddNoteViewModel @Inject constructor() : ViewModel() {

    var noteSaved: (() -> Unit)? = null

    var noteNotSaved: (() -> Unit)? = null

    fun addNote(note: Note) {
        if (NoteRepository.addnote(note)) {
            noteSaved?.invoke()
        } else {
            noteNotSaved?.invoke()
        }
    }
}