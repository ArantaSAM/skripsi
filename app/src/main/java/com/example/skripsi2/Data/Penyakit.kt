package com.example.skripsi2.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "penyakit")
data class Penyakit(
    @PrimaryKey(autoGenerate = true)
    val kode_penyakit: Int,
    val nama_penyakit: String,
    val det_penyakit: String,
    val sm_penyakit: String,
    val gambar: Int

)
