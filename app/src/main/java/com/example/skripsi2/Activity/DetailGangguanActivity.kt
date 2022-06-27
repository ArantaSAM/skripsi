package com.example.skripsi2.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skripsi2.Model.Gangguan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_detail_gangguan.*

class DetailGangguanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gangguan)

        val gangguan = intent.getParcelableExtra<Gangguan>("Gangguan")
        gangguan?.apply {
            DetailGambar.setImageResource(gangguan.gambar)
            DetailNama.text = gangguan.nama
            DetailKeterangan.text = gangguan.keterangan
            DetailURL.text = url
        }


    }
}