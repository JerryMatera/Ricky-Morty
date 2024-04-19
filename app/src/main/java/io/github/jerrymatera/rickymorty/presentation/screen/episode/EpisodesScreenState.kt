package io.github.jerrymatera.rickymorty.presentation.screen.episode

import io.github.jerrymatera.rickymorty.data.remote.dto.episodes.EpisodeDto

data class EpisodesScreenState(
    val episodeResponse:  List<EpisodeDto>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
