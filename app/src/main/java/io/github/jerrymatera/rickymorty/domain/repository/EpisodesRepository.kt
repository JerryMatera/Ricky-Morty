package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.data.remote.dto.episodes.EpisodeResponseDto
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface EpisodesRepository {
    suspend fun getEpisodes():Flow<NetworkResult<EpisodeResponseDto>>
}