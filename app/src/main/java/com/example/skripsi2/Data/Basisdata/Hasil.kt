package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_hasil")
data class Hasil(
    @PrimaryKey(autoGenerate = true) val id_hasil: Int,
    val tanggal: String,
    val penyakit: String,
    val gejala: String,
    val hasil_id: Int,
    val hasil_nilai: String
)
