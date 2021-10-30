package com.example.top10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class RecyclerViewAdapter(private var color: MutableList<question>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view, parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val colur=color[position]
        holder.itemView.apply {
            tvi.text= colur.toString()
        }
    }

    override fun getItemCount()= color.size



}