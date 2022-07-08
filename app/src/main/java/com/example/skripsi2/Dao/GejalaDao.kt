package com.example.skripsi2.Dao

import androidx.room.*
import com.example.skripsi2.Data.Basisdata.Gejala

@Dao
interface GejalaDao {
    @Insert
    fun insert(gejala: Gejala)

    @Update
    fun update(gejala: Gejala)

    @Delete
    fun delete(gejala: Gejala)

    @Query("Select*from tbl_gejala")
    fun selectAll() : List<Gejala>


    @Query("Select*from tbl_gejala where kd_gejala = kd_gejala ")
    fun select(kd_gejala: Int) :Gejala
}