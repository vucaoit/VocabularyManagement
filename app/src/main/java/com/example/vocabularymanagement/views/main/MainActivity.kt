package com.example.vocabularymanagement.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.vocabularymanagement.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.main_bottom_navigation)
        attachBottomNavigation()
    }
    fun attachBottomNavigation(){
        val navController = Navigation.findNavController(this,R.id.main_nav_host_fragment)
        bottomNavigationView.setupWithNavController(navController)
    }
}