package com.example.skripsi2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skripsi2.*
import com.example.skripsi2.Adapter.GangguanAdapter
import com.example.skripsi2.Object.ObjectGangguan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RvList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val list = ObjectGangguan.list
        val adapter = GangguanAdapter(list)
        RvList.adapter = adapter
        RvList.addItemDecoration(DividerItemDecoration(this,LinearLayout.HORIZONTAL))

        adapter.onItemClickListerner={
            val intent = Intent(this, DetailGangguanActivity::class.java)
            intent.putExtra("Gangguan",it)
            startActivity(intent)
        }
        uji.setOnClickListener {
            val intent = Intent (this, UjiActivity::class.java)
            startActivity(intent)
        }

        layanan.setOnClickListener {
            val intent = Intent (this, LayananActivity::class.java)
            startActivity(intent)
        }
        tentang.setOnClickListener {
            val intent = Intent (this, TentangActivity::class.java)
            startActivity(intent)
        }
    }
}