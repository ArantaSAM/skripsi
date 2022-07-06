package com.example.skripsi2.fragment.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import kotlinx.android.synthetic.main.fragment_list_penyakit.view.*
import com.example.skripsi2.R

class ListPenyakitFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_penyakit, container, false)
        view.FABpenyakit.setOnClickListener {
            findNavController().navigate(R.id.action_listPenyakitFragment_to_addPenyakitFragment)
        }
        return view
    }
}