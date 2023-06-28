package com.example.mascotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mascotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            //Launch the VerticalListActivity on verticalBtn click
            verticalBtn.setOnClickListener { launchVertical() }

            //Launch the HorizontalListActivity on horizontalBtn click
            horizontalBtn.setOnClickListener { launchHorizontal() }

            //Launch the GridListActivity on gridBtn click
            gridBtn.setOnClickListener { launchGrid() }
        }
    }

    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity( listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent( this, HorizontalListActivity::class.java)
        startActivity( listIntent)
    }

    private fun launchGrid() {
        listIntent = Intent( this, GridListActivity::class.java)
        startActivity( listIntent)
    }
}