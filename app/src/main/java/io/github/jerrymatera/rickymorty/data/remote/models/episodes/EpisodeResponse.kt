package io.github.jerrymatera.rickymorty.data.remote.models.episodes

import io.github.jerrymatera.rickymorty.data.remote.models.Info

data class EpisodeResponse(
    val info: Info,
    val results: List<Episode>
)