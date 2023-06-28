package com.example.mascotas.model

import androidx.annotation.DrawableRes


data class Dog(
    @DrawableRes val imageResourceID: Int,
    val name: String,
    val age: String,
    val hobbies: String
)
