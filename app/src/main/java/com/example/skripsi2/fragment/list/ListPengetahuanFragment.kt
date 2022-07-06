package com.example.skripsi2.fragment.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.fragment_list_pengetahuan.view.*
import kotlinx.android.synthetic.main.fragment_list_penyakit.view.*

class ListPengetahuanFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list_pengetahuan, container, false)
        view.FABpengetahuan.setOnClickListener {
            findNavController().navigate(R.id.action_listPengetahuanFragment_to_addPengetahuanFragment)
        }
        return view
    }
}