package io.github.jerrymatera.rickymorty.data.models.episodes

import io.github.jerrymatera.rickymorty.data.models.Info

data class EpisodeResponse(
    val info: Info,
    val results: List<Episode>
)