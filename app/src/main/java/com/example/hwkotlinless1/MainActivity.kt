package com.example.hwkotlinless1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hwkotlinless1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPush.setOnClickListener(){
            binding.resultButtonPush.text = getString(R.string.push)
        }
    }
}