package com.lv7s.myapplication

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lv7s.myapplication.databinding.FragmentBufftrisBinding

class bufftris : Fragment() {
    var numVolReq : Float? = null
    var numConcTris : Float? = null
    var numConcNaCl : Float? = null
    var numConcMgCl2 : Float? = null
    var numConcImidzl: Float? = null
    var numVolGlic: Float? = null
    val TRIS = 121.14
    val NaCl = 58.44
    val Hepes = 238.30
    val MgCl2Anhidro = 95.21
    val MgCl2Hexahidro = 203.31
    val Glicerol = 1.26
    val Imidazol = 68.077
    private var _binding : FragmentBufftrisBinding? = null
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
        _binding = FragmentBufftrisBinding.inflate(inflater, container, false)
        binding.btnCalcular.setOnClickListener {
            if  (TextUtils.isEmpty(binding.valVolReq.text.toString())){
                binding.valVolReq.error = "Ingresa un numero"
                binding.valVolReq.requestFocus()
                return@setOnClickListener
            }else {
                numVolReq = binding.valVolReq.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcTris.text.toString())){
                binding.valConcTris.error = "Ingresa un numero"
                binding.valConcTris.requestFocus()
                return@setOnClickListener
            }else {
                numConcTris = binding.valConcTris.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcNaCl.text.toString())){
                binding.valConcNaCl.error = "Ingresa un numero"
                binding.valConcNaCl.requestFocus()
                return@setOnClickListener
            }else {
                numConcNaCl = binding.valConcNaCl.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcMgCl.text.toString())){
                binding.valConcMgCl.error = "Ingresa un numero"
                binding.valConcMgCl.requestFocus()
                return@setOnClickListener
            }else {
                numConcMgCl2 = binding.valConcMgCl.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valVolGlic.text.toString())){
                binding.valVolGlic.error = "Ingresa un numero"
                binding.valVolGlic.requestFocus()
                return@setOnClickListener
            }else {
                numVolGlic = binding.valVolGlic.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcImidzl.text.toString())){
                binding.valConcImidzl.error = "Ingresa un numero"
                binding.valConcImidzl.requestFocus()
                return@setOnClickListener
            }else {
                numConcImidzl = binding.valConcImidzl.text.toString().toFloat()
            }
            val resultadoConcTris =  numConcTris!!.times(numVolReq!!).times(TRIS).toString()
            val resultadoConcNaCl = numConcNaCl!!.times(numVolReq!!).times(NaCl).toString()
            val resultadoMgCl = numConcMgCl2!!.times(numVolReq!!).times(MgCl2Hexahidro).toString()
            val resultadoGlic = numVolGlic!!.times(Glicerol).toString()
            val resultadoImdzl = numConcImidzl!!.times(numVolReq!!).times(Imidazol).toString()

            binding.rptaTRIS.setText(resultadoConcTris)
        }

        binding.btnCalcular.setOnClickListener {


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