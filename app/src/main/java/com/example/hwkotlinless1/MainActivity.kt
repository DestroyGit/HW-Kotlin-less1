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

        val dataClass = DataClass("Friday", 3)
        val copyDataClass = dataClass.copy(day = 4)

        binding.apply {
            btnPush.setOnClickListener(){
                resultButtonPush.text = getString(R.string.push)
                week.text = dataClass.week
                day.text = dataClass.day.toString()
                copyWeek.text = copyDataClass.week
                copyDay.text = copyDataClass.day.toString()
            }
        }

    }
}