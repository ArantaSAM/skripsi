package com.example.skripsi2.Data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Info_Layanan(
    var nama: String = "",
    var url:String = "",
    var gambar:Int
) : Parcelable