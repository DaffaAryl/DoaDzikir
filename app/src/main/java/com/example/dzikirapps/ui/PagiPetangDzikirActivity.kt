package com.example.dzikirapps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.example.dzikirapps.R

class PagiPetangDzikirActivity : AppCompatActivity() {

    private lateinit var cvDzikirPagi: CardView
    private lateinit var cvDzikirPetang: CardView
    private lateinit var btnDzikirPagi: ImageButton
    private lateinit var btnDzikirPetang: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        cvDzikirPagi = findViewById(R.id.cv_dzikir)
        cvDzikirPagi.setOnClickListener(this)
        cvDzikirPetang = findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener(this)
        btnDzikirPagi = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)
        btnDzikirPetang = findViewById(img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)
    }

    override fun onclick(view: View?) {
        
    }
}