package com.example.islami.ahadith

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class AhadithNamesAdapter(val items : List<String>): RecyclerView.Adapter<AhadithNamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.ahadith_item_title,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.AhadithNameTextView.text = items.get(position)
        holder.AhadithNameTextView.setOnClickListener {
            onHadithNameClicked?.onItemClikListner(items.get(position),position )
        }
    }
    var onHadithNameClicked : OnItemClickListner? = null

    interface OnItemClickListner{

        fun onItemClikListner(item : String, index : Int)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){


        val AhadithNameTextView = itemView.findViewById<TextView>(R.id.ahadith_name_text_view)




    }

}