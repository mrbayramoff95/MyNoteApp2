package com.example.mynoteapp.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynoteapp.R
import com.example.mynoteapp.ui.notes.Note

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    private val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)

    fun bind(note: Note) {
        titleTextView.text = note.title
        contentTextView.text = note.content

        // Дополнительная логика для обработки нажатия на элемент списка (если требуется)
        itemView.setOnClickListener {
            // Действия при нажатии на элемент списка
            // Например, открытие подробной информации о заметке или переход к редактированию
        }
    }
}
