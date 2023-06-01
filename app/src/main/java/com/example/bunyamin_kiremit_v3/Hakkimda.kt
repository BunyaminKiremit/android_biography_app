package com.example.bunyamin_kiremit_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class Hakkimda : AppCompatActivity() {

    lateinit var languagesList:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hakkimda)

        languagesList=findViewById(R.id.languagesList)


        var arr=resources.getStringArray(R.array.languages)
        for (item in arr){
            Log.d("item",item)

        }

        registerForContextMenu(languagesList)
        var adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr)
        languagesList.adapter=adapter

    }
}