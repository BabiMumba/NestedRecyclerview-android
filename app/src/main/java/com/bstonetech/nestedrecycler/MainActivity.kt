package com.bstonetech.nestedrecycler

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.adapter.MainRecyclerAdapter
import com.bstonetech.nestedrecycler.model.Allcategorie

class MainActivity : AppCompatActivity() {

    private var mainrecycler:RecyclerView? = null
    private var mainRecyclerAdapter:MainRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private fun setMainCategoriRecycler(allcategorie: List<Allcategorie>){
        mainrecycler = findViewById(R.id.my_recycler)
        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainrecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this,allcategorie)
        mainrecycler!!.adapter = mainRecyclerAdapter

    }
}