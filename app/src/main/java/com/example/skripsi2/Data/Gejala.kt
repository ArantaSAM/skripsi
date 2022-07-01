package com.example.skripsi2.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gejala")
data class Gejala(
    @PrimaryKey(autoGenerate = true)
    val kode_gejala: Int,
    val namagejala : String,
)
