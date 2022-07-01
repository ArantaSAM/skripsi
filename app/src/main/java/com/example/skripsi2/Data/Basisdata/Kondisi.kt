package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Kondisi")
data class Kondisi(
    @PrimaryKey(autoGenerate = true)
    val id_kondisi: Int,
    val kondisi: String,
    val ket: String
)
