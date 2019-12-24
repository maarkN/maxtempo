package com.maarkn.maxclima.ui.clima.semanal.lista

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.maarkn.maxclima.R

class ListaSemanalClimas : Fragment() {

    companion object {
        fun newInstance() = ListaSemanalClimas()
    }

    private lateinit var viewModel: ListaSemanalClimasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lista_semanal_climas_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListaSemanalClimasViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
