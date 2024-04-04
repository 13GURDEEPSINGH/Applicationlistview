package com.gurdeep.applicationlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.gurdeep.applicationlistview.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    var listview: ListView?=null
    lateinit var adapter:ArrayAdapter<String>
    var array= arrayListOf<String>("1","2","3","4","5")
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)
         listview=findViewById(R.id.listview)
        adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,array)
        listview?.adapter=adapter
        binding.btn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

    }
}}