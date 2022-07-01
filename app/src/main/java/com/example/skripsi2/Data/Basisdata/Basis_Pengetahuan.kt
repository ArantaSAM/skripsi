package com.example.skripsi2.Data.Basisdata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_basis_pengetahuan",
    foreignKeys = [ForeignKey(
        entity = Penyakit::class,
        parentColumns = arrayOf("kd_penyakit"),
        childColumns = arrayOf("id_penyakit"),
        onDelete = CASCADE,
    ), ForeignKey(
        entity = Gejala::class,
        parentColumns = arrayOf("kd_gejala"),
        childColumns = arrayOf("id_gejala"),
        onDelete = CASCADE
    )]
    )
data class Basis_Pengetahuan(
    @PrimaryKey(autoGenerate = true) val kode_pengetahuan: Int,
    @ColumnInfo(name = "kode Penyakit") val id_penyakit:Int,
    @ColumnInfo(name = "kode Gejala")val id_gejala: Int,
    @ColumnInfo(name = "CF Pakar")val cfpakar: Double
)


