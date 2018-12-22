package com.example.darfe.movies.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darfe.movies.R
import com.example.darfe.movies.ui.main.adapters.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val adapter:MovieAdapter = MovieAdapter()

    val vm:MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.adapter = adapter
    }

    override fun onResume() {
        super.onResume()

        GlobalScope.launch(Dispatchers.Main){
            val result = vm.getMovies().await()
            adapter.data = result.results
        }


    }


}
