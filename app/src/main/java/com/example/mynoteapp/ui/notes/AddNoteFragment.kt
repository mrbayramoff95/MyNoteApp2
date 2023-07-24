package com.example.mynoteapp.ui.notes

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.room.RoomOpenHelper
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentAddNoteBinding
import dagger.hilt.android.AndroidEntryPoint
import java.time.Instant
import kotlin.properties.ReadOnlyProperty

@AndroidEntryPoint
class AddNoteFragment : Fragment() {

    private lateinit var binding: FragmentAddNoteBinding

    private val viewModel: AddNoteViewModel by viewModels()

    private fun viewModels(): ReadOnlyProperty<AddNoteFragment, AddNoteViewModel> {
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.run {
            noteSaved = {
                binding.root.post {
                    Toast.makeText(requireContext(), R.string.note_saved, Toast.LENGTH_LONG).show()
                }
            }

            noteNotSaved = {
                binding.root.post {
                    Toast.makeText(requireContext(), R.string.note_not_saved, Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }
}
