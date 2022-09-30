package com.bstonetech.nestedrecycler.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.R
import com.bstonetech.nestedrecycler.model.CategoryItem

class ChildcategorieAdapter(private val context: Context, private var categoryItem: List<CategoryItem>): RecyclerView.Adapter<ChildcategorieAdapter.CatViewHolder>() {


    class CatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage:ImageView
        init {
            itemImage = itemView.findViewById(R.id.imade_row)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(LayoutInflater.from(context).inflate(R.layout.row_cat,parent,false))
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.itemImage.setImageResource(categoryItem[position].imageUrl)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "salut", Toast.LENGTH_SHORT).show()
        }
    }
    override fun getItemCount(): Int {
        return categoryItem.size
    }
}