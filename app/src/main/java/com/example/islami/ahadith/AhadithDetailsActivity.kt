package com.example.islami.ahadith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import com.example.islami.sura_details.SuraVerseAdapter
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class AhadithDetailsActivity : AppCompatActivity() {
    var ahadithLines = mutableListOf<String>()
    lateinit var ahadithNameRecycleView: RecyclerView
    lateinit var AhadithVerseAdapter : AhadithVerseAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahadith_details)
        val hadithNameTitleTextView = findViewById<TextView>(R.id.hadith_name_TV)
        val hadithname = intent.getStringExtra("hadith_name")
        val filename =  intent.getStringExtra("file_name")
        AhadithVerseAdapter = AhadithVerseAdapter(ahadithLines)
        ahadithNameRecycleView = findViewById(R.id.hadith_recycler_view)
        ahadithNameRecycleView.adapter = AhadithVerseAdapter
        readAhadithLines(filename?:"")
        AhadithVerseAdapter.items= ahadithLines
        AhadithVerseAdapter.notifyDataSetChanged()
        hadithNameTitleTextView.text = hadithname

    }

    private fun readAhadithLines(filename:String) {

        val reader: BufferedReader

        try {
            Log.e("Lithy","fileName: "+"ahadith/$filename")
            val file = assets.open("ahadith/${filename}")
            reader = BufferedReader(InputStreamReader(file))
            ahadithLines = reader.lineSequence().toMutableList()
            ahadithLines.forEach {
                Log.e("Lithy",it)

            }
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }
    }

}