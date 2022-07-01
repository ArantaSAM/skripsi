package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_gejala")
data class Gejala(
    @PrimaryKey(autoGenerate = true) val kd_gejala: Int,
    val namagejala : String,
)
