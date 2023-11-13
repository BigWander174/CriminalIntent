package com.example.sibgaucriminalintent.repositories

import android.content.Context
import androidx.room.Room
import com.example.sibgaucriminalintent.database.CrimeDatabase
import com.example.sibgaucriminalintent.model.Crime
import java.util.UUID

private const val DATABASE_NAME = "crime-database"

class CrimeRepository private constructor(context: Context){
    private val database : CrimeDatabase = Room.databaseBuilder(
        context.applicationContext,
        CrimeDatabase::class.java,
        DATABASE_NAME
    ).build()
    private val crimeDao = database.crimeDao()

    fun getCrimes(): List<Crime> = crimeDao.getCrimes()
    fun getCrime(id: UUID): Crime? = crimeDao.getCrime(id)


    companion object {
    }
}