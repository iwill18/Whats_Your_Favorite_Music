package com.example.musicapi.dagger

import com.example.musicapi.view.MainActivity
import com.example.musicapi.view.MusicListFragment
import dagger.Component


@Component(
    modules = [
        ApplicationModule::class,
        NetworkModule::class,
        PresenterModule::class,
        RepositoryModule::class
    ]
)
interface MusicComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(musicListFragment: MusicListFragment)
}