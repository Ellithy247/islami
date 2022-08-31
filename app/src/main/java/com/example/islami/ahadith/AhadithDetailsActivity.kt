package com.example.islami.ahadith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class AhadithDetailsActivity : AppCompatActivity() {
    var ahadithLines = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahadith_details)
        val hadithname = intent.getStringExtra("hadith_name")
        val filename =  intent.getStringExtra("file_name")
        readAhadithLines(filename?:"")


    }

    private fun readAhadithLines(filename:String) {

        val reader: BufferedReader

        try {
            val file = assets.open(filename)
            reader = BufferedReader(InputStreamReader(file))
            var line = reader.readLine()
            ahadithLines = reader.lineSequence().toMutableList()
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }


}