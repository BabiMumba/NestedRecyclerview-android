package com.bstonetech.nestedrecycler

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.adapter.MainRecyclerAdapter
import com.bstonetech.nestedrecycler.model.Allcategorie
import com.bstonetech.nestedrecycler.model.CategoryItem

class MainActivity : AppCompatActivity() {

    private var mainrecycler:RecyclerView? = null
    private var mainRecyclerAdapter:MainRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val categoryItemList:MutableList<CategoryItem> = ArrayList()

        categoryItemList.add(CategoryItem(1,R.drawable.zero1))
        categoryItemList.add(CategoryItem(1,R.drawable.influa))
        categoryItemList.add(CategoryItem(1,R.drawable.pour_le_nul))
        categoryItemList.add(CategoryItem(1,R.drawable.semaine))
        categoryItemList.add(CategoryItem(1,R.drawable.zero1))

        val allcategorie:MutableList<Allcategorie> = ArrayList()
        allcategorie.add(Allcategorie("Holywood"))
        allcategorie.add(Allcategorie("nolywood"))
        allcategorie.add(Allcategorie("Bollywood"))
        allcategorie.add(Allcategorie("Holywood"))
        allcategorie.add(Allcategorie("Holywood"))

        setMainCategoriRecycler(allcategorie)

    }
    private fun setMainCategoriRecycler(allcategorie: List<Allcategorie>){
        mainrecycler = findViewById(R.id.my_recycler)
        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainrecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this,allcategorie)
        mainrecycler!!.adapter = mainRecyclerAdapter

    }
}