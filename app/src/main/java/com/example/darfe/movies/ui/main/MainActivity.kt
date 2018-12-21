package com.example.darfe.movies.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darfe.movies.R
import com.example.darfe.movies.ui.main.adapters.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter:MovieAdapter = MovieAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.adapter = adapter
    }


}
