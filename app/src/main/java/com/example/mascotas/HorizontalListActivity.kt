package com.example.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotas.adapter.DogCardAdapter
import com.example.mascotas.const.Layout
import com.example.mascotas.data.DataSource
import com.example.mascotas.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_horizontal_list)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL,
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}