package com.example.musicapi.dagger

import com.example.musicapi.database.LocalRepository
import com.example.musicapi.interfaces.LocalRepositoryInterface
import com.example.musicapi.interfaces.RepositoryInterface
import com.example.musicapi.network.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun localRepository(
        localRepository: LocalRepository): LocalRepositoryInterface

    @Binds
    abstract fun repository(
        repository: Repository): RepositoryInterface
}