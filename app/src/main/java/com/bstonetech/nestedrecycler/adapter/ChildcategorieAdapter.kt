package com.bstonetech.nestedrecycler.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.model.CategoryItem

class ChildcategorieAdapter(private val context: Context, private val categoryItem: List<CategoryItem>): RecyclerView.Adapter<ChildcategorieAdapter.CatViewHolder>() {


    class CatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}