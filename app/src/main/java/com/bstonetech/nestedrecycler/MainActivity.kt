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
        categoryItemList.add(CategoryItem(1,R.drawable.zero1))
        categoryItemList.add(CategoryItem(1,R.drawable.zero1))
        categoryItemList.add(CategoryItem(1,R.drawable.zero1))
        categoryItemList.add(CategoryItem(1,R.drawable.zero1))

        //groupe 2
        val categoryItemList2:MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))
        categoryItemList2.add(CategoryItem(1,R.drawable.influa))

        //groupe 3
        val categoryItemList3:MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(CategoryItem(1,R.drawable.pour_le_nul))
        categoryItemList3.add(CategoryItem(1,R.drawable.pour_le_nul))
        categoryItemList3.add(CategoryItem(1,R.drawable.pour_le_nul))
        categoryItemList3.add(CategoryItem(1,R.drawable.pour_le_nul))
        categoryItemList3.add(CategoryItem(1,R.drawable.pour_le_nul))


        val allcategorie:MutableList<Allcategorie> = ArrayList()

        allcategorie.add(Allcategorie("Holywood",categoryItemList))
        allcategorie.add(Allcategorie("nolywood",categoryItemList))
        allcategorie.add(Allcategorie("Bollywood",categoryItemList2))
        allcategorie.add(Allcategorie("Holywood",categoryItemList))
        allcategorie.add(Allcategorie("Holywood",categoryItemList3))

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