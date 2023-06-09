package com.example.meryntopia3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meryntopia3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.buttonTopla.setOnClickListener {
            val sayi1 = binding.sayi1.text.toString().toInt()
            val sayi2 = binding.sayi2.text.toString().toInt()
            val toplam = toplama(sayi1, sayi2)
            binding.textView.text = "Sonuç: $toplam"
        }

    }
    fun toplama(a: Int, b: Int): Int {
        return a + b
    }




}