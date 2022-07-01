package com.example.skripsi2.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skripsi2.Data.Info_Gangguan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_detail_gangguan.*

class DetailGangguanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gangguan)

        val infoGangguan = intent.getParcelableExtra<Info_Gangguan>("Gangguan")
        infoGangguan?.apply {
            DetailGambar.setImageResource(infoGangguan.gambar)
            DetailNama.text = infoGangguan.nama
            DetailKeterangan.text = infoGangguan.keterangan
            DetailURL.text = url
        }


    }
}