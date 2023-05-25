package com.mwangi.recycler_views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class valuesRVAdapter(var fibonacciList:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.values_layout,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentValue = fibonacciList.get(position)
        holder.tvValues.text = currentValue.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}


class NumbersViewHolder(itemView: View):ViewHolder(itemView){
    var tvValues = itemView.findViewById<TextView>(R.id.tvValues)
}