package com.example.mascotas.data

import com.example.mascotas.R
import com.example.mascotas.model.Dog

/** Un objeto genera una lista estatica de mascotas */
object DataSource {

    val dogs = listOf(
        Dog(R.drawable.tzeitel, "Tzeitel", "7", "sunbathing"),
        Dog(R.drawable.leroy, "Leroy", "4", "Dormir en lugares peli.."),
        Dog(R.drawable.frankie, "Frankie", "2", "stealing socks"),
        Dog(R.drawable.nox, "Nox", "8", "meeting new animals"),
        Dog(R.drawable.faye, "Faye", "8", "Digging in the garden"),
        Dog(R.drawable.bella, "Bella", "14", "Chasing sea foam"),
        Dog(R.drawable.tzeitel, "TacoBell", "2", "Chasing sea foam"),
    )

}