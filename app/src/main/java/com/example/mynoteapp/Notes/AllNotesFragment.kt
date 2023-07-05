package com.example.mynoteapp.Notes

import android.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynoteapp.Adapter.NoteAdapter
import com.example.mynoteapp.R


class AllNotesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_notes, container, false)
    }

    val notesList = getNotesFromDataSource()

    val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

    recyclerView.layoutManager = LinearLayoutManager(this)

    val adapter = NoteAdapter(notesList)
    recyclerView.adapter = adapter


}