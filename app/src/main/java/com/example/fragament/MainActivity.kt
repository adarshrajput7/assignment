package com.example.fragament

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragament.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fgManager : FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fgManager = supportFragmentManager

        binding.login.setOnClickListener {
            val fgt1 : FragmentTransaction =fgManager.beginTransaction()
            fgt1.replace(R.id.fragment_1,Fragment1())
            fgt1.commit()

        }

        binding.singup.setOnClickListener {
            val fgt2 : FragmentTransaction =fgManager.beginTransaction()
            fgt2.replace(R.id.fragment_1,Fragment2())
            fgt2.commit()
        }

    }
}