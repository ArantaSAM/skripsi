package com.example.skripsi2.Data

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Info_Gangguan(
    var nama: String = "",
    var keterangan:String = "",
    var url:String = "",
    var gambar:Int
) : Parcelable