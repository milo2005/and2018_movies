package com.example.darfe.movies.data.models

import com.google.gson.annotations.SerializedName

class Movie{
    @SerializedName("poster_path")
    lateinit var posterPath:String

    lateinit var overview:String

    @SerializedName("release_date")
    lateinit var releaseDate:String

    lateinit var title:String

    @SerializedName("backdrop_path")
    lateinit var backdropPath:String

    @SerializedName("vote_average")
    var voteAverage:Float = 0f
}