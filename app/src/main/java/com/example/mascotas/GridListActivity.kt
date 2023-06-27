package com.example.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotas.adapter.DogCardAdapter
import com.example.mascotas.const.Layout
import com.example.mascotas.data.DataSource
import com.example.mascotas.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_grid_list)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID,
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}