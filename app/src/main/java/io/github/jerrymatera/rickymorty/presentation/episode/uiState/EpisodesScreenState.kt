package io.github.jerrymatera.rickymorty.presentation.episode.uiState

import io.github.jerrymatera.rickymorty.data.models.episodes.Episode

data class EpisodesScreenState(
    val episodeResponse:  List<Episode>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
