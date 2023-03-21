package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.models.episodes.EpisodeResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EpisodesRepositoryImpl @Inject constructor(rickyMortyService: RickyMortyService) : EpisodesRepository {
    override suspend fun getEpisodes(): Flow<EpisodeResponse> {
        TODO("Not yet implemented")
    }
}