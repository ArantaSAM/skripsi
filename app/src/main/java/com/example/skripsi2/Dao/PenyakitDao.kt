package com.example.skripsi2.Dao

import androidx.room.*
import com.example.skripsi2.Data.Basisdata.Penyakit

@Dao
interface PenyakitDao {
    @Insert
    fun insert(penyakit: Penyakit)

    @Update
    fun update(penyakit: Penyakit)

    @Delete
    fun delete(penyakit: Penyakit)

    @Query("Select*from tbl_penyakit")
    fun selectAll() : List<Penyakit>


    @Query("Select*from tbl_penyakit where kd_penyakit = kd_penyakit ")
    fun select(kd_penyakit: Int) : Penyakit
}