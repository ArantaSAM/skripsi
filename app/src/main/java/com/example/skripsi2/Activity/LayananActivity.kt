package com.example.skripsi2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skripsi2.Adapter.LayananAdapter
import com.example.skripsi2.Data.DataLayanan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_main.*

class LayananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)

        RvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val list = DataLayanan.list
        val adapter = LayananAdapter(list)
        RvList.adapter = adapter
        RvList.addItemDecoration(DividerItemDecoration(this, LinearLayout.HORIZONTAL))
    }
}