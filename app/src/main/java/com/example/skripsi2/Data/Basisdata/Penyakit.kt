package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tbl_penyakit")
data class Penyakit(
    @PrimaryKey(autoGenerate = true) val kd_penyakit: Int,
    val nama_penyakit: String,
    val det_penyakit: String,
    val sm_penyakit: String,
    val gambar: Int
)
