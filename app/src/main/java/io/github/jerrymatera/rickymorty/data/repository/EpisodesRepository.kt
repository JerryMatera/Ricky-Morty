package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.models.episodes.EpisodeResponse
import kotlinx.coroutines.flow.Flow

interface EpisodesRepository {
    suspend fun getEpisodes():Flow<EpisodeResponse>
}