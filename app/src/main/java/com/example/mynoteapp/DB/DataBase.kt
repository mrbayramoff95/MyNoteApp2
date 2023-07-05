package com.example.mynoteapp.DB

import android.provider.ContactsContract.CommonDataKinds.Note

class DataBase {
    companion object {
        val listOfNotes: ArrayList<Note> =
            arrayListOf(Note("Kyle Wilson", "Awesome job!", 05032021))

        private fun Note(s: String, s1: String, l: Long, i: Int): Note {
            TODO("Not yet implemented")
        }
    }
}