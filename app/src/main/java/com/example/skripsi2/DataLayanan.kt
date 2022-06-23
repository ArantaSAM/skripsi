package com.example.skripsi2

object DataLayanan {
    val list: ArrayList<Layanan>
        get() {
            val list: ArrayList<Layanan> = arrayListOf()

            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "",
                    gambar = R.drawable.fobiasosial
                )
            )
            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "",
                    gambar = R.drawable.gad
                )
            )

            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "",
                    gambar = R.drawable.panik
                )
            )

            return list
        }
}