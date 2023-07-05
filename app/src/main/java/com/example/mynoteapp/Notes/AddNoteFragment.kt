package com.example.mynoteapp.Notes

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentAddNoteBinding
import kotlin.properties.ReadOnlyProperty

class AddNoteFragment : Fragment() {
    private lateinit var binding: FragmentAddNoteBinding

    private val viewmodel: AddNoteViewModel by viewmodels()

    private fun viewmodels(): ReadOnlyProperty<AddNoteFragment, AddNoteViewModel> {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNoteBinding.inflate(inflater.contaimer, false)
        return binding.root
    }

}

class AddNoteViewModel {

}
