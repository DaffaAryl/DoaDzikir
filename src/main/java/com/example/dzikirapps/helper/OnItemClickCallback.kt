package com.example.dzikirapps.helper

import com.example.dzikirapps.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}