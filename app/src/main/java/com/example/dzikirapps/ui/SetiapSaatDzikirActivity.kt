package com.example.dzikirapps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirapps.R
import com.example.dzikirapps.adapter.DzikirDoaAdapter
import com.example.dzikirapps.model.DataDzikirDoa

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        var rvSetiapSaatDzikir = findViewById<RecyclerView>(R.id.rv_setia_saat_dzikir)
        rvSetiapSaatDzikir.InputManager = LinearLayoutManager(this)
        rvSetiapSaatDzikir.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }
}