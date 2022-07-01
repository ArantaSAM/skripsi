package com.example.skripsi2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skripsi2.Data.Info_Gangguan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.item_gangguan.view.*

class GangguanAdapter(val list: List<Info_Gangguan>) :
    RecyclerView.Adapter<GangguanAdapter.ViewHolder>() {
    var onItemClickListerner: ((Info_Gangguan) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(infoGangguan: Info_Gangguan) {
            with(itemView) {
                item_gambar.setImageResource(infoGangguan.gambar)
                item_nama.text = infoGangguan.nama
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_gangguan, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gangguan = list[position]
        holder.bind(gangguan)
        holder.itemView.setOnClickListener{
            onItemClickListerner?.let { it1 -> it1(gangguan) }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}