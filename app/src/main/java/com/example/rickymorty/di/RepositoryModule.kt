package com.example.rickymorty.di

import com.example.rickymorty.data.network.CharacterApi
import com.example.rickymorty.data.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesRepository(characterApi: CharacterApi): CharacterRepository {
        return CharacterRepository(characterApi)
    }
}