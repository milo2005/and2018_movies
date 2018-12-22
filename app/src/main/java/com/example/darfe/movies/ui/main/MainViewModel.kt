package com.example.darfe.movies.ui.main

import androidx.lifecycle.ViewModel
import com.example.darfe.movies.data.api.MovieApi
import com.example.darfe.movies.data.api.Results
import kotlinx.coroutines.Deferred

class MainViewModel(private val api:MovieApi,
                    private val key:String):ViewModel(){

    fun getMovies():Deferred<Results> = api.getMovies(key, "es")

}