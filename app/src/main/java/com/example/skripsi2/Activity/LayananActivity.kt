package com.example.skripsi2.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skripsi2.Adapter.LayananAdapter
import com.example.skripsi2.Object.Object_info_Layanan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.activity_layanan.*

class LayananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)

        RvListlayanan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val list = Object_info_Layanan.list
        val adapter = LayananAdapter(list)
        RvListlayanan.adapter = adapter
        RvListlayanan.addItemDecoration(DividerItemDecoration(this, LinearLayout.HORIZONTAL))
        }
    }
