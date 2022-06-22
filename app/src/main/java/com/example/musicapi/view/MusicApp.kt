package com.example.musicapi.view

import android.app.Application
import com.example.musicapi.dagger.ApplicationModule
import com.example.musicapi.dagger.MusicComponent
import com.example.musicapi.dagger.DaggerMusicComponent

class MusicApp: Application() {


    override fun onCreate() {
        super.onCreate()
        component = DaggerMusicComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    companion object { lateinit var component: MusicComponent }
}

