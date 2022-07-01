package com.example.skripsi2.Data.Basisdata

import androidx.room.Database

@Database(
    entities = arrayOf(
        Admin::class,
        Basis_Pengetahuan::class,
        Gejala::class,
        Hasil::class,
        Kondisi::class,
        Penyakit::class), version = 1, exportSchema = false)

abstract class SPDatabase {
}