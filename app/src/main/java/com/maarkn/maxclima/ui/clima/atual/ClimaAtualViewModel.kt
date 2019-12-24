package com.maarkn.maxclima.ui.clima.atual

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.maarkn.maxclima.data.repository.AppRepository

class ClimaAtualViewModel(application: Application) : AndroidViewModel(application) {

    private val appRepository = AppRepository(application)

 init {
     appRepository.fetchDataFromServer()
 }

    fun getAlldata() = appRepository.getAlldata()
}
