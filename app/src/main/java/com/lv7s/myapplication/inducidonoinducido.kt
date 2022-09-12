package com.lv7s.myapplication

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lv7s.myapplication.databinding.FragmentInducidonoinducidoBinding
import java.math.RoundingMode

class inducidonoinducido : Fragment() {
    var numVolNoInd : Float? = null
    var numDONoInd : Float? = null
    var numVolInd : Float? = null
    var numDOInd : Float? = null
    var resultadofactornum : Float? = null
    private var _binding : FragmentInducidonoinducidoBinding? = null
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
        _binding = FragmentInducidonoinducidoBinding.inflate(inflater, container, false)
        var respuestavolnoind = binding.rptavolnoind
        var respuestaDOnoind = binding.rptaDOnoind
        var respuestavolind = binding.rptavolind
        var respuestaDOind = binding.rptaDOind
        var respuestafactorDOvol = binding.rptafactorDOvol
        binding.btncalcvolind.setOnClickListener {
            if  (TextUtils.isEmpty(binding.valVolNoInd.text.toString())){
                binding.valVolNoInd.error = "Ingresa un numero"
                binding.valVolNoInd.requestFocus()
                return@setOnClickListener
            }else {
                numVolNoInd = binding.valVolNoInd.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valDONoInd.text.toString())){
                binding.valDONoInd.error = "Ingresa un numero"
                binding.valDONoInd.requestFocus()
                return@setOnClickListener
            }else {
                numDONoInd = binding.valDONoInd.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valVolInd.text.toString())){
                binding.valVolInd.error = "Ingresa un numero"
                binding.valVolInd.requestFocus()
                return@setOnClickListener
            }else {
                numVolInd = binding.valVolInd.text.toString().toFloat()
            }

            if  (TextUtils.isEmpty(binding.valDOInd.text.toString())){
                binding.valDOInd.error = "Ingresa un numero"
                binding.valDOInd.requestFocus()
                return@setOnClickListener
            }else {
                numDOInd = binding.valDOInd.text.toString().toFloat()
            }

            val resultadoFactor = (numDOInd!!/numDONoInd!!).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            resultadofactornum = resultadoFactor.toString().toFloat()
            val resultadoVolInduc =  (numVolNoInd!!/resultadofactornum!!).toBigDecimal().setScale(2, RoundingMode.UP).toString()
            respuestafactorDOvol.setText(resultadoFactor)
            respuestavolind.setText(resultadoVolInduc)
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