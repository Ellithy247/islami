package com.example.islami.sura_details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.islami.R
import java.io.BufferedReader
import java.io.InputStreamReader

class sura_details_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        val suraname = intent.getStringExtra("sura_name")
        val filename =  intent.getStringExtra("file_name")
        Log.e("sura_details_activity","suraname: $suraname,filename: $filename")
    }

    fun readSuraFile(filename : String) {


        

    }
}