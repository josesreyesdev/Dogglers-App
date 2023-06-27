package com.example.mascotas.model

import androidx.annotation.DrawableRes


data class Dog(
    @DrawableRes val imageResourceID: Int,
    val nameResourceId: String,
    val ageResourceId: String,
    val hobbiesResource: String
)
