package com.example.islami.sebha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.islami.R


class FragmentSebha : Fragment() {
    lateinit var counter: TextView
    lateinit var zekr: TextView
    var count = 0
    var generalCount = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        counter = view.findViewById<Button>(R.id.counter)
        zekr = view.findViewById<Button>(R.id.zekr)
        zekr.setOnClickListener {
            count++
            generalCount++
               if (generalCount == 32) {
                   count = 0
                   zekr.text = "الحمد لله"
               } else if (generalCount == 64) {
                   count = 0
                   zekr.text = "لا اله الا الله"

               } else if (generalCount == 96) {
                   count = 0
                   zekr.text = "لا حول ولا قوة الا بالله"

               }
               else if (generalCount > 127) {
                   count = 0
                   zekr.text = ""
               }
            counter.text = count.toString()
            }


            }


        }






