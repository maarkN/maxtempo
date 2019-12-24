package com.maarkn.maxclima.ui.clima.atual

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.maarkn.maxclima.R

class ClimaAtualFragment : Fragment() {

    companion object {
        fun newInstance() = ClimaAtualFragment()
    }

    private lateinit var viewModel: ClimaAtualViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.clima_atual_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ClimaAtualViewModel::class.java)

        // Preciso retornar uma LivaData para poder usar padrão Observer
        viewModel.getAlldata().observe
        // TODO: Use the ViewModel
    }

}
