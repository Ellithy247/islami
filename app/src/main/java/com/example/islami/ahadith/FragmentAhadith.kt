package com.example.islami.ahadith

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R


class FragmentAhadith : Fragment() {

    lateinit var ahadithNamesRecyclerView: RecyclerView
    lateinit var ahadithNamesAdapter: AhadithNamesAdapter
    val ahadithNamesList = arrayListOf<String>(
        "الحديث 1",
        "الحديث 2",
        "الحديث 3",
        "الحديث 4",
        "الحديث 5",
        "الحديث 6",
        "الحديث 7",
        "الحديث 8",
        "الحديث 9",
        "الحديث 10",
        "الحديث 11",
        "الحديث 12",
        "الحديث 13",
        "الحديث 14",
        "الحديث 15",
        "الحديث 16",
        "الحديث 17",
        "الحديث 18",
        "الحديث 19",
        "الحديث 20",
        "الحديث 21",
        "الحديث 22",
        "الحديث 23",
        "الحديث 24",
        "الحديث 25",
        "الحديث 26",
        "الحديث 27",
        "الحديث 28",
        "الحديث 29",
        "الحديث 30",
        "الحديث 31",
        "الحديث 32",
        "الحديث 33",
        "الحديث 34",
        "الحديث 35",
        "الحديث 36",
        "الحديث 37",
        "الحديث 38",
        "الحديث 39",
        "الحديث 40",
        "الحديث 41",
        "الحديث 42",
        "الحديث 43",
        "الحديث 44",
        "الحديث 45",
        "الحديث 46",
        "الحديث 47",
        "الحديث 48",
        "الحديث 49",
        "الحديث 50"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ahadith, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ahadithNamesRecyclerView = view.findViewById<RecyclerView>(R.id.ahadith_name_recycle_view)
        ahadithNamesAdapter = AhadithNamesAdapter(ahadithNamesList)
        ahadithNamesAdapter.onHadithNameClicked = object : AhadithNamesAdapter.OnItemClickListner{

            override fun onItemClikListner(item: String, index: Int) {
                startHadithNameScreen(item,"${index+1}.txt")
            }
        }
        ahadithNamesRecyclerView.adapter = ahadithNamesAdapter



    }
    private fun startHadithNameScreen(hadithname:String,filename :String) {

        val intent : Intent = Intent(activity,AhadithDetailsActivity::class.java)
        intent.putExtra("hadith_name",hadithname)
        intent.putExtra("file_name",filename)

        startActivity(intent)

    }

}
