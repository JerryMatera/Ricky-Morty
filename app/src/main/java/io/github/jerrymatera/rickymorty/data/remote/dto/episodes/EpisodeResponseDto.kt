package io.github.jerrymatera.rickymorty.data.remote.dto.episodes

import io.github.jerrymatera.rickymorty.domain.models.Info

data class EpisodeResponseDto(
    val info: Info,
    val results: List<EpisodeDto>
)