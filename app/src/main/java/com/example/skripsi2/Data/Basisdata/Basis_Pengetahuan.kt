package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "basis_pengetahuan")
data class Basis_Pengetahuan(
    @PrimaryKey(autoGenerate = true)
    val kode_pengetahuan: Int,
    val kode_penyakit:Int,
    val kode_gejala: Int,
    val cfpakar: Int
)
