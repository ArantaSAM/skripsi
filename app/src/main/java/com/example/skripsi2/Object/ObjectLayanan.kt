package com.example.skripsi2.Object

import com.example.skripsi2.Data.Info_Layanan
import com.example.skripsi2.R

object ObjectLayanan {
    val list: ArrayList<Info_Layanan>
        get() {
            val list: ArrayList<Info_Layanan> = arrayListOf()

            list.add(
                Info_Layanan(
                    nama = "Ibunda",
                    url = "ibunda.id",
                    gambar = R.drawable.ibunda
                )
            )
            list.add(
                Info_Layanan(
                    nama = "Satu Persen",
                    url = "satupersen.net",
                    gambar = R.drawable.satupersen
                )
            )
            return list
        }
}