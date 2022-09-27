package com.bstonetech.nestedrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.R
import com.bstonetech.nestedrecycler.model.Allcategorie
import com.bstonetech.nestedrecycler.model.CategoryItem

class MainRecyclerAdapter(private val context: Context, private val allcategorie: List<Allcategorie>):
    RecyclerView.Adapter<MainRecyclerAdapter.MainviewHolder>() {

    class MainviewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
         var categoryTitle:TextView
        var itemRecycler:RecyclerView

        init {
            categoryTitle = itemView.findViewById(R.id.title)
            itemRecycler = itemView.findViewById(R.id.cat_item_row)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainviewHolder {
        return MainviewHolder((LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item,parent,false)))
    }

    override fun onBindViewHolder(holder: MainviewHolder, position: Int) {
        holder.categoryTitle.text = allcategorie[position].CaterieTitle

        setcateItemRecycler(holder.itemRecycler, allcategorie[position].categorItem)
    }

    override fun getItemCount(): Int {
        return allcategorie.size
    }

    private fun setcateItemRecycler(recyclerView: RecyclerView, categoryItem: List<CategoryItem>){

        val itemRecyclerAdapter = ChildcategorieAdapter(context,categoryItem)
        recyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)

        recyclerView.adapter = itemRecyclerAdapter

    }

}