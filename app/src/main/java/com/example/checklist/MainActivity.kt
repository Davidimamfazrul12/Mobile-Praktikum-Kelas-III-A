package com.example.checklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //okkk
        val language = listOf("Kotlin","Python","Ruby","JavaScript","PHP")

        list_view.adapter = ArrayAdapter(this, simple_list_item_1, language)

        list_view.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this,"Anda memilih: ${language[position]}",
                Toast.LENGTH_SHORT).show()
        }
    }
}
