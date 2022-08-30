package com.example.magicball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.magicball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvPrediction.setOnClickListener{
            binding.tvPrediction.text = getPrediction()
        }
    }

    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.predictions).size - 1
     return (0..size).random()
    }
    private fun getPrediction():String{
        return resources.getStringArray(R.array.predictions)[randomNumber()]
    }
}