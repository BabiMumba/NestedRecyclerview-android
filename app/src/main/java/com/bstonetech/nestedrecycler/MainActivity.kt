package com.bstonetech.nestedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.nestedrecycler.adapter.MainRecyclerAdapter

class MainActivity : AppCompatActivity() {

    private var mainrecycler:RecyclerView? = null
    private var mainRecyclerAdapter:MainRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}