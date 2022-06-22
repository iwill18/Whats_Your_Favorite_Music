package com.example.musicapi.interfaces

import com.example.musicapi.model.MusicList

interface ViewInterface {
    fun loadingState()
    fun connectionChecked()
    fun onLoad(music: MusicList)
    fun onError(error: Throwable)
    fun makeToast(text: String, long: Boolean = true)
    fun processOffline()
}