package com.example.skripsi2.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Gangguan(
    var nama: String = "",
    var keterangan:String = "",
    var url:String = "",
    var gambar:Int
) : Parcelable