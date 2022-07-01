package com.example.skripsi2.Data.Basisdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_admin")
data class Admin(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val Username: String,
    val password: String,
    val fullname: String
)
