package com.lv7s.myapplication

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lv7s.myapplication.databinding.FragmentBuffhepesBinding
import java.math.RoundingMode


class buffhepes : Fragment() {
    var numVolReq : Float? = null
    var numConcHEPES2 : Float? = null
    var numConcNaCl : Float? = null
    var numConcMgCl2 : Float? = null
    var numConcImidzl: Float? = null
    var numVolGlic: Float? = null
    val NaCl = 58.44
    val Hepes = 238.30
    /*val MgCl2Anhidro = 95.21
    *     val TRIS = 121.14*/
    val MgCl2Hexahidro = 203.31
    val Glicerol = 1.26
    val Imidazol = 68.077
    private var _binding : FragmentBuffhepesBinding? = null
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
        _binding = FragmentBuffhepesBinding.inflate(inflater, container, false)
        var respuestaConcHEPES2 = binding.rptaHEPES2
        var respuestaConcNaCl =binding.rptaNaCl2
        var respuestaConcMgCl2 = binding.rptaMgCl2
        var respuestaVolGlic = binding.rptaGlic2
        var respuestaConcImdzl = binding.rptaImdzl2

        binding.btnCalcular2.setOnClickListener {
            if  (TextUtils.isEmpty(binding.valVolReq2.text.toString())){
                binding.valVolReq2.error = "Ingresa un numero"
                binding.valVolReq2.requestFocus()
                return@setOnClickListener
            }else {
                numVolReq = binding.valVolReq2.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcHEPES2.text.toString())){
                binding.valConcHEPES2.error = "Ingresa un numero"
                binding.valConcHEPES2.requestFocus()
                return@setOnClickListener
            }else {
                numConcHEPES2 = binding.valConcHEPES2.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcNaCl2.text.toString())){
                binding.valConcNaCl2.error = "Ingresa un numero"
                binding.valConcNaCl2.requestFocus()
                return@setOnClickListener
            }else {
                numConcNaCl = binding.valConcNaCl2.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcMgCl2.text.toString())){
                binding.valConcMgCl2.error = "Ingresa un numero"
                binding.valConcMgCl2.requestFocus()
                return@setOnClickListener
            }else {
                numConcMgCl2 = binding.valConcMgCl2.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valVolGlic2.text.toString())){
                binding.valVolGlic2.error = "Ingresa un numero"
                binding.valVolGlic2.requestFocus()
                return@setOnClickListener
            }else {
                numVolGlic = binding.valVolGlic2.text.toString().toFloat()
            }
            if  (TextUtils.isEmpty(binding.valConcImidzl2.text.toString())){
                binding.valConcImidzl2.error = "Ingresa un numero"
                binding.valConcImidzl2.requestFocus()
                return@setOnClickListener
            }else {
                numConcImidzl = binding.valConcImidzl2.text.toString().toFloat()
            }
            val resultadoConcTris =  (numConcHEPES2!!*numVolReq!!).times(Hepes).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            val resultadoConcNaCl = numConcNaCl!!.times(numVolReq!!*NaCl).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            val resultadoConcMgCl = numConcMgCl2!!.times(numVolReq!!*MgCl2Hexahidro).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            val resultadoVolGlic = numVolGlic!!.times(Glicerol).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            val resultadoConcImdzl = numConcImidzl!!.times(numVolReq!!*Imidazol).toBigDecimal().setScale(2, RoundingMode.UP).toString()

            respuestaConcHEPES2.setText(resultadoConcTris)
            respuestaConcNaCl.setText(resultadoConcNaCl)
            respuestaConcMgCl2.setText(resultadoConcMgCl)
            respuestaVolGlic.setText(resultadoVolGlic)
            respuestaConcImdzl.setText(resultadoConcImdzl)
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