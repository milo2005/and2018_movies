package com.example.darfe.movies.di

import com.example.darfe.movies.R
import com.example.darfe.movies.data.api.MovieApi
import com.example.darfe.movies.ui.main.MainViewModel
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.experimental.builder.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule: Module = module {

    single {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(androidContext().getString(R.string.url_base))
            .build()
    }

    single { androidContext().resources.getString(R.string.api_key) }

    single { get<Retrofit>().create(MovieApi::class.java) }

    viewModel<MainViewModel>()

}