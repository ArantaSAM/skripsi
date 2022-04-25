package com.example.skripsi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RvList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val list = DataGangguan.list
        val adapter = GangguanAdapter(list)
        RvList.adapter = adapter
        RvList.addItemDecoration(DividerItemDecoration(this,LinearLayout.HORIZONTAL))

        adapter.onItemClickListerner={
            val intent = Intent(this,DetailGangguanActivity::class.java)
            intent.putExtra("Gangguan",it)
            startActivity(intent)
        }
    }
}