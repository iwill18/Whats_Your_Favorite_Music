package com.example.musicapi.utils

import com.example.musicapi.model.Music
import com.example.musicapi.model.MusicList

fun List<Music>.toMusicList() : MusicList =
    MusicList(
        results = this,
        resultCount = this.count()
    )