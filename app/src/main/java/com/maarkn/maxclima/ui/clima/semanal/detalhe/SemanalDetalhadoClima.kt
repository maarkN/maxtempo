package com.maarkn.maxclima.ui.clima.semanal.detalhe

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.maarkn.maxclima.R

class SemanalDetalhadoClima : Fragment() {

    companion object {
        fun newInstance() = SemanalDetalhadoClima()
    }

    private lateinit var viewModel: SemanalDetalhadoClimaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.semanal_detalhado_clima_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SemanalDetalhadoClimaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
