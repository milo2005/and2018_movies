package com.example.darfe.movies

import android.app.Application
import com.example.darfe.movies.di.appModule
import com.facebook.drawee.backends.pipeline.Fresco
import org.koin.android.ext.android.startKoin

class App:Application(){

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
        startKoin(this, listOf(appModule))
    }

}