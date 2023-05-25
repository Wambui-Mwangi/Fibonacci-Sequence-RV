package com.mwangi.recycler_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mwangi.recycler_views.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacci()

    }

    fun fibonacci() {
        var num1 = 0
        var num2 = 1
        var c: Int

        var numbers= mutableListOf<Int>(num1,num2)
        while (true) {
            c = num1 + num2
            if (c > 100)
                break

            numbers.add(c)

            num1 = num2
            num2 = c
        }


        binding.rvValues.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=valuesRVAdapter(numbers)
        binding.rvValues.adapter=numbersAdapter
        }

    }

