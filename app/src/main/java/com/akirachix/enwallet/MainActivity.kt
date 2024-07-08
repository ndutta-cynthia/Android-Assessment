package com.akirachix.enwallet

import Balancev
import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.tvBalance.l= LinearLayoutManager(this)
//        displayMoney()

    }
//    fun displayMoney(){
//        val display1= Balancev("Rent", 12000, "1 june 2024")
//        val display2= Balancev("Rent", 12000, "1 june 2024")
//        val display3= Balancev("Rent", 12000, "1 june 2024")
//        val display4= Balancev("Rent", 12000, "1 june 2024")
//
//
//    }
}