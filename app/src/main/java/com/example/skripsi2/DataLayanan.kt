package com.example.skripsi2

object DataLayanan {
    val list: ArrayList<Layanan>
        get() {
            val list: ArrayList<Layanan> = arrayListOf()

            list.add(
                Layanan(
                    nama = "Ibunda",
                    url = "ibunda.id",
                    gambar =
                )
            )
            list.add(
                Layanan(
                    nama = "Satu Persen",
                    url = "satupersen.net",
                    gambar =
                )
            )
            return list
        }
}