package com.adrianobr.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adrianobr.businesscard.R
import com.adrianobr.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}