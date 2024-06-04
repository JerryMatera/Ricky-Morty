package io.github.jerrymatera.rickymorty.presentation.screen.episode

import io.github.jerrymatera.rickymorty.domain.models.Episode

data class EpisodesScreenState(
    val episodeResponse:  List<Episode>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
