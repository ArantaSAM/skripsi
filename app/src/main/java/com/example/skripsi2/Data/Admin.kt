package com.example.skripsi2.Data

import androidx.room.Entity

@Entity(tableName = "Admin")
data class Admin(
    val Username: String,
    val password: String,
    val fullname: String
)
