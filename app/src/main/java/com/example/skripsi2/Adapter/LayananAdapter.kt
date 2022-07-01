package com.example.skripsi2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skripsi2.Data.Info_Layanan
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.item_gangguan.view.item_gambar
import kotlinx.android.synthetic.main.item_layanan.view.*

class LayananAdapter (val list: List<Info_Layanan>) :
    RecyclerView.Adapter<LayananAdapter.ViewHolder>() {
    var onItemClickListerner: ((Info_Layanan) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(infoLayanan: Info_Layanan) {
            with(itemView) {
                item_gambar.setImageResource(infoLayanan.gambar)
                item_url.text = infoLayanan.url
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layanan, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val layanan = list.get(position)
        holder.bind(layanan)
        holder.itemView.setOnClickListener{
            onItemClickListerner?.let { it1 -> it1(layanan) }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}