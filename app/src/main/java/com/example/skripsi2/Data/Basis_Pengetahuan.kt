package com.example.skripsi2.Data

import androidx.room.Entity

@Entity(tableName = "basis_pengetahuan")
data class Basis_Pengetahuan(
    val kode_pengetahuan: Int,
    val kode_penyakit:Int,
    val kode_gejala: Int,
    val cfpakar: Int
)
