package com.example.mynoteapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynoteapp.Notes.Note
import com.example.mynoteapp.R

class NoteAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return NoteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val currentNote = notes[position]
        holder.titleTextView.text = currentNote.title
        holder.contentTextView.text = currentNote.content
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.noteTitleTextView)
        val contentTextView: TextView = itemView.findViewById(R.id.noteContentTextView)
    }
}