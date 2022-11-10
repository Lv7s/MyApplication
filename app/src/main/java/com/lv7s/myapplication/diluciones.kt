package com.lv7s.myapplication

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lv7s.myapplication.databinding.FragmentDilucionesBinding
import java.math.RoundingMode

class diluciones : Fragment() {
    var numConc1 : Float? = null
    var numVol1 : Float? = null
    var numConc2 : Float? = null
    var numVol2 : Float? = null
    private var _binding : FragmentDilucionesBinding? = null
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
        _binding = FragmentDilucionesBinding.inflate(inflater, container, false)
        var respuesta = binding.rptadilucc
        binding.btnconc1.setOnClickListener {
            if  (TextUtils.isEmpty(binding.valVol1.text.toString())){
                binding.valVol1.error = "Ingresa un numero"
                binding.valVol1.requestFocus()
                return@setOnClickListener
            }else {
                numVol1 = binding.valVol1.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valConc2.text.toString())){
                binding.valConc2.error = "Ingresa un numero"
                binding.valConc2.requestFocus()
                return@setOnClickListener
            }else {
                numConc2 = binding.valConc2.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valVol2.text.toString())){
                binding.valVol2.error = "Ingresa un numero"
                binding.valVol2.requestFocus()
                return@setOnClickListener
            }else {
                numVol2 = binding.valVol2.text.toString().toFloat()
            }

            val resultadoc1 =  numConc2!!.times(numVol2!!).div(numVol1!!).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            respuesta.setText(resultadoc1)
        }
        return binding.root
    }

    companion object {

    }
}