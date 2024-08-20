package com.prabhakar.lokalassignment.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.prabhakar.lokalassignment.R
import com.prabhakar.lokalassignment.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        NavigationUI.setupWithNavController(
            binding.bottomMenu,
            Navigation.findNavController(this, R.id.fragmentContainerView)
        )
    }
}