package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.remote.models.episodes.EpisodeResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface EpisodesRepository {
    suspend fun getEpisodes():Flow<NetworkResult<EpisodeResponse>>
}