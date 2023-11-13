package com.example.sibgaucriminalintent.database

import androidx.room.Dao
import androidx.room.Query
import com.example.sibgaucriminalintent.model.Crime
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?
}