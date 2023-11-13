package com.example.sibgaucriminalintent.mvvm

import androidx.lifecycle.ViewModel
import com.example.sibgaucriminalintent.model.Crime
import com.example.sibgaucriminalintent.repositories.CrimeRepository

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
}