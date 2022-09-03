package com.lv7s.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lv7s.myapplication.databinding.FragmentBufferBinding


class Buffer : Fragment() {
    private var _binding : FragmentBufferBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBufferBinding.inflate(inflater, container, false)
        binding.btntoBufferTRIS.setOnClickListener {
            findNavController().navigate(R.id.action_buffer_to_bufftris)}
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}