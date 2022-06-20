package com.example.skripsi2

object DataLayanan {
    val list: ArrayList<Layanan>
        get() {
            val list: ArrayList<Layanan> = arrayListOf()

            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "https://www.alodokter.com/Layanan-kecemasan-sosial",
                    gambar = R.drawable.fobiasosial
                )
            )
            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "https://www.alodokter.com/kenali-tiga-jenis-Layanan-kecemasan-dan-gejalanya",
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