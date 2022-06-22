package com.example.musicapi.dagger

import com.example.musicapi.interfaces.PresenterInterface
import com.example.musicapi.presenter.Presenter
import dagger.Binds
import dagger.Module

@Module
abstract class PresenterModule {
    @Binds
    abstract fun presenter(presenter: Presenter): PresenterInterface
}