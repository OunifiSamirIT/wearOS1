package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.wear.widget.drawer.WearableNavigationDrawerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }




}