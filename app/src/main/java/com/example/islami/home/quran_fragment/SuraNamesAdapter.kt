
package com.example.islami.home.quran_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R


class SuraNamesAdapter(val items : List<String>): RecyclerView.Adapter<SuraNamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.sura_names_item_title,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.suraNameTextView.text = items.get(position)
        holder.suraNameTextView.setOnClickListener {
            onSuraNameClicked?.onItemClikListner(items.get(position),position )
        }
    }
    var onSuraNameClicked : OnItemClickListner? = null

    interface OnItemClickListner{

        fun onItemClikListner(item : String, index : Int)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        val suraNameTextView = itemView.findViewById<TextView>(R.id.SuraNameTextView    )




    }
}
