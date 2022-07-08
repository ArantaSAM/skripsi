package com.example.skripsi2.Object

import com.example.skripsi2.Data.Basisdata.Penyakit

object ObjectPenyakit {
    val list: ArrayList<Penyakit>
        get() {
            val list: ArrayList<Penyakit> = arrayListOf()
            list.add(
                Penyakit(
                     kd_penyakit = 1,
                    nama_penyakit = "Gangguan Fobia Sosial"
                )
            )
            list.add(
                Penyakit(
                    kd_penyakit = 2,
                    nama_penyakit = "Gangguan Kecemasan Menyeluruh"
                )
            )

            list.add(
                Penyakit(
                    kd_penyakit = 3,
                    nama_penyakit = "Gangguan Panik"
                )
            )
            return list
        }
}