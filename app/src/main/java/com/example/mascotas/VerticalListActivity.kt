package com.example.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotas.adapter.DogCardAdapter
import com.example.mascotas.const.Layout
import com.example.mascotas.data.DataSource
import com.example.mascotas.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL,
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}