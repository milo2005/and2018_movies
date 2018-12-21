package com.example.darfe.movies.ui.main.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.darfe.movies.R
import com.example.darfe.movies.data.models.Movie
import com.example.darfe.movies.databinding.TemplateMovieBinding

class MovieAdapter:RecyclerView.Adapter<MovieViewHolder>(){

    var data:List<Movie> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.template_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(data[position])
    }

}

class MovieViewHolder(view:View):RecyclerView.ViewHolder(view){
    private val binding:TemplateMovieBinding = TemplateMovieBinding.bind(view)

    fun bind(movie:Movie){
        binding.movie = movie
    }
}