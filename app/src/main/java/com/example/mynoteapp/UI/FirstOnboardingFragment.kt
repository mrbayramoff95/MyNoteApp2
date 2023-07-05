package com.example.mynoteapp.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentFirstOnboardingBinding


class FirstOnboardingFragment : Fragment() {

   private lateinit var binding: FragmentFirstOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.findViewById<Button>(R.id.discovery_button).setOnClickListener {
            parentFragmentManager.beginTransaction()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FirstOnboardingFragment())
                .commit()
        }
    }
}