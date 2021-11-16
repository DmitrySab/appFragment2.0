package com.example.myapplicationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuFragment =  MenuFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container,menuFragment)
            .commit()

    }
}