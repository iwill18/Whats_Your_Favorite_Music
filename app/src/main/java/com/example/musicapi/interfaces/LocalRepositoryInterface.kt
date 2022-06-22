package com.example.musicapi.interfaces

import com.example.musicapi.database.MusicEntity
import io.reactivex.Completable
import io.reactivex.Single

interface LocalRepositoryInterface {
    fun getMusicList(apiSearchTerm: String): Single<List<MusicEntity>>
    fun insertMusic(musicEntityList: List<MusicEntity>): Completable
}