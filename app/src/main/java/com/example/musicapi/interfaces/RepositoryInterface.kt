package com.example.musicapi.interfaces

import com.example.musicapi.model.MusicList
import io.reactivex.Single
import io.reactivex.subjects.BehaviorSubject

interface RepositoryInterface {
    val networkState: BehaviorSubject<Boolean>
    fun registerNetworkAvailability()
    fun unregisterNetworkAvailability()
    fun getData(musicType: String): Single<MusicList>
}