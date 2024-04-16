package io.github.jerrymatera.rickymorty.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import io.github.jerrymatera.rickymorty.data.repository.*
import io.github.jerrymatera.rickymorty.domain.repository.CharactersRepository
import io.github.jerrymatera.rickymorty.domain.repository.EpisodesRepository
import io.github.jerrymatera.rickymorty.domain.repository.LocationsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCharactersRepository(
        rickyMortyService: RickyMortyService
    ): CharactersRepository {
        return CharactersRepositoryImpl(rickyMortyService = rickyMortyService)
    }

    @Provides
    @Singleton
    fun provideEpisodesRepository(
        rickyMortyService: RickyMortyService
    ): EpisodesRepository {
        return EpisodesRepositoryImpl(rickyMortyService = rickyMortyService)
    }

    @Provides
    @Singleton
    fun provideLocationsRepository(
        rickyMortyService: RickyMortyService
    ): LocationsRepository {
        return LocationsRepositoryImpl(rickyMortyService = rickyMortyService)
    }

}