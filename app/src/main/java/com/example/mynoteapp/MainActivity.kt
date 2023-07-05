package com.example.mynoteapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mynoteapp.UI.FirstOnboardingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, FirstOnboardingFragment())
            .commit()
    }
}