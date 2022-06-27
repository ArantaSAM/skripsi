package com.example.skripsi2.Data

import com.example.skripsi2.Model.Layanan
import com.example.skripsi2.R

object DataLayanan {
    val list: ArrayList<Layanan>
        get() {
            val list: ArrayList<Layanan> = arrayListOf()

            list.add(
                Layanan(
                    nama = "Ibunda",
                    url = "ibunda.id",
                    gambar = R.drawable.ibunda
                )
            )
            list.add(
                Layanan(
                    nama = "Satu Persen",
                    url = "satupersen.net",
                    gambar = R.drawable.satupersen
                )
            )
            return list
        }
}