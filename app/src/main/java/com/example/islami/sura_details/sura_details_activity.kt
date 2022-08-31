package com.example.islami.sura_details

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class sura_details_activity : AppCompatActivity() {
    var suraLines = mutableListOf<String>()
    lateinit var suraVerseRecyclerView : RecyclerView
    lateinit var Suraverseadapter: SuraVerseAdapter

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        val SuraNameTitleTextView = findViewById<TextView>(R.id.sura_name)
        val suraname = intent.getStringExtra("sura_name")
        val filename =  intent.getStringExtra("file_name")
        readSuraFile(filename?:"")
        Suraverseadapter = SuraVerseAdapter(suraLines)
        suraVerseRecyclerView = findViewById(R.id.sura_verse_recycler_view)
        suraVerseRecyclerView.adapter = Suraverseadapter
        SuraNameTitleTextView.text = suraname


    }
    fun readSuraFile(filename : String) {


        val reader: BufferedReader

        try {
            val file = assets.open(filename)
            reader = BufferedReader(InputStreamReader(file))
            var line = reader.readLine()
             suraLines = reader.lineSequence().toMutableList()
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }


    }
}