package com.bstonetech.nestedrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.R
import com.bstonetech.nestedrecycler.model.Allcategorie

class MainRecyclerAdapter(private val context: Context, private val allcategorie: List<Allcategorie>):
    RecyclerView.Adapter<MainRecyclerAdapter.MainviewHolder>() {
    class MainviewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainviewHolder {
        return MainviewHolder((LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item,parent,false)))
    }

    override fun onBindViewHolder(holder: MainviewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return allcategorie.size
    }
}