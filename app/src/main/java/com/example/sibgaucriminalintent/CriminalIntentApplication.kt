package com.example.sibgaucriminalintent

import android.app.Application
import com.example.sibgaucriminalintent.repositories.CrimeRepository

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}