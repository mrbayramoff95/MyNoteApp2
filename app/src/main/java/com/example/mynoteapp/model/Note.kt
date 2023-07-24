package com.example.mynoteapp.model

data class Note(
    var id: Long,
    var title: String,
    var message: String,
    var date: Long
)