package com.lv7s.myapplication

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lv7s.myapplication.databinding.FragmentMolmanualBinding
import java.math.RoundingMode


class molmanual : Fragment() {
    var numPesMol : Float? = null
    var numVolLit : Float? = null
    var numMolFinal : Float? = null
    private var _binding : FragmentMolmanualBinding? = null
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
        _binding = FragmentMolmanualBinding.inflate(inflater, container, false)
        var respuestagramosapesar = binding.rptagramosPesar
        binding.btncalcgrampes.setOnClickListener {
            if  (TextUtils.isEmpty(binding.valPesMol.text.toString())){
                binding.valPesMol.error = "Ingresa un numero"
                binding.valPesMol.requestFocus()
                return@setOnClickListener
            }else {
                numPesMol = binding.valPesMol.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valVolLit.text.toString())){
                binding.valVolLit.error = "Ingresa un numero"
                binding.valVolLit.requestFocus()
                return@setOnClickListener
            }else {
                numVolLit = binding.valVolLit.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valMolFinal.text.toString())){
                binding.valMolFinal.error = "Ingresa un numero"
                binding.valMolFinal.requestFocus()
                return@setOnClickListener
            }else {
                numMolFinal = binding.valMolFinal.text.toString().toFloat()
            }
            val resultadogramosapesar =  numMolFinal!!.times(numPesMol!!*numVolLit!!).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            respuestagramosapesar.setText(resultadogramosapesar)
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