package com.example.islami.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami.R
import com.example.islami.home.quran_fragment.FragmentQuran
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var  bottomnavigation : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentQuran()).commit()
        bottomnavigation = findViewById(R.id.home_bottom_navigation)

        bottomnavigation.setOnItemSelectedListener { item ->

            if (item.itemId == R.id.ic_quran){

                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                    FragmentQuran()
                ).commit()
            }
            else if(item.itemId == R.id.ic_ahadith){

                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FragmentAhadith()).commit()
            }
            else if(item.itemId == R.id.ic_sebha){

                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FragmentSebha()).commit()
            }
            else if(item.itemId == R.id.ic_radio){

                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FragmentRadio()).commit()
            }


            return@setOnItemSelectedListener true


        }
    }
}