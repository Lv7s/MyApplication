package com.lv7s.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lv7s.myapplication.databinding.FragmentInicioBinding

class Inicio : Fragment() {
    private var _binding : FragmentInicioBinding? = null
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
        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        binding.toBuffer.setOnClickListener {
            findNavController().navigate(R.id.action_inicio_to_buffer)
        }
        binding.toGelsds.setOnClickListener {
            findNavController().navigate(R.id.action_inicio_to_gelsdspage)
        }
        binding.toinducidonoinducido.setOnClickListener {
            findNavController().navigate(R.id.action_inicio_to_inducidonoinducido)
        }
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}