package com.example.skripsi2.Data

import com.example.skripsi2.Model.Gangguan
import com.example.skripsi2.R

object DataGangguan {
    val list: ArrayList<Gangguan>
        get() {
            val list: ArrayList<Gangguan> = arrayListOf()

            list.add(
                Gangguan(
                    nama = "Gangguan Fobia Sosial",
                    keterangan = "Gangguan kecemasan sosial atau fobia sosial merupakan rasa cemas atau takut yang luar biasa terhadap situasi sosial atau interaksi dengan orang lain, baik sebelum, sesudah, maupun selama berada dalam situasi tersebut.\n" +
                            "\n" +
                            "Orang dengan gangguan kecemasan sosial akan merasa takut untuk mengatakan atau melakukan sesuatu di depan orang lain atau di tempat umum, karena menganggap hal tersebut akan mempermalukan mereka. Beberapa gejala gangguan kecemasan sosial adalah:\n" +
                            "\n" +
                            "- Merasa takut atau enggan untuk berinteraksi dan menyapa orang lain, terutama orang yang tidak dikenal\n" +
                            "- Memiliki tingkat kepercayaan diri yang rendah\n" +
                            "- Menghindari bertatapan mata dengan orang lain\n" +
                            "- Merasa takut dikritik atau dihakimi orang lain\n" +
                            "- Merasa malu atau takut untuk bepergian ke luar rumah atau berada di tempat umum\n" +
                            "- Gangguan kecemasan sosial berbeda dengan perasaan malu biasa. Orang yang pemalu umumnya masih bisa melakukan interaksi sosial atau berkomunikasi dan menjalani aktivitas sehari-hari, meskipun mungkin akan merasa malu jika harus bertegur sapa atau diajak berkenalan dengan orang lain.\n" +
                            "\n" +
                            "Jika rasa malu atau takut berinteraksi dengan orang lain dirasakan sangat ekstrim, hingga menyebabkan kesulitan dalam menjalani aktivitas sehari-hari dan bersosialisasi, maka kondisi ini perlu mendapatkan pertolongan medis dari psikiater atau psikolog.",
                    url = "https://www.alodokter.com/gangguan-kecemasan-sosial",
                    gambar = R.drawable.fobiasosial
                )
            )
            list.add(
                Gangguan(
                    nama = "Gangguan Kecemasan Menyeluruh",
                    keterangan = "Jenis gangguan kecemasan ini membuat penderitanya merasakan cemas secara berlebihan yang menetap dalam waktu lama, biasanya hingga lebih dari 6 bulan. Penderita GAD akan sangat mengkhawatirkan banyak hal, misalnya keuangan, kesehatan, atau pekerjaan.\n" +
                            "\n" +
                            "Seseorang yang menderita gangguan kecemasan umum biasanya tidak bisa fokus pada suatu hal, sulit berkonsentrasi, dan tidak bisa merasa santai. Pada beberapa kasus, rasa cemas ini bisa begitu berat hingga menimbulkan depresi.\n" +
                            "\n" +
                            "Berikut ini adalah beberapa gejala yang dapat dirasakan oleh penderita gangguan kecemasan umum:\n" +
                            "\n" +
                            "- Gemetar dan keringat dingin\n" +
                            "- Otot tegang\n" +
                            "- Pusing dan sakit kepala\n" +
                            "- Mudah marah\n" +
                            "- Susah tidur\n" +
                            "- Dada berdebar-debar\n" +
                            "- Sering merasa lelah\n" +
                            "- Sesak napas\n" +
                            "- Sering ingin buang air kecil\n" +
                            "-Tidak nafsu makan",
                    url = "https://www.alodokter.com/kenali-tiga-jenis-gangguan-kecemasan-dan-gejalanya",
                    gambar = R.drawable.gad
                )
            )

            list.add(
                Gangguan(
                    nama = "Gangguan Panik",
                    keterangan = "Penderita gangguan panik akan mengalami serangan panik secara tiba-tiba dan berulang kali tanpa alasan yang jelas. Frekuensi dan tingkat keparahannya pun bervariasi. " +
                            "Berikut ini adalah beberapa gejala yang dapat muncul saat terjadi gangguan panik:\n" +
                            "- Berkeringat\n" +
                            "- Palpitasi (berdebar-debar)\n" +
                            "- Dada terasa sesak atau tersedak\n" +
                            "- Nyeri dada\n" +
                            "- Merasa seperti mengalami serangan jantung\n" +
                            "- Ketakutan\n" +
                            "- Gemetar\n" +
                            "- Merasa seperti tidak berdaya\n" +
                            "Seseorang dengan gangguan panik merasa seperti akan diserang kapan saja dan di mana saja. Gangguan panik biasanya berlangsung kurang dari 10 menit, tetapi ada juga yang berlangsung hingga satu jam atau lebih.",
                    url = "https://www.alodokter.com/kenali-tiga-jenis-gangguan-kecemasan-dan-gejalanya",
                    gambar = R.drawable.panik
                )
            )

            return list
        }
}