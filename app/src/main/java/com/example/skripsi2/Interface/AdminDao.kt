package com.example.skripsi2.Interface

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.skripsi2.Data.Basisdata.Admin

interface AdminDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend    fun addAdmin(admin: Admin)
    @Query("Select * From admin order by id ASC")
    fun readAllData(): LiveData<List<Admin>>
}