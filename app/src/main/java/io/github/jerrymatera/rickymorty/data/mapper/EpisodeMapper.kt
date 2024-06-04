package io.github.jerrymatera.rickymorty.data.mapper

import io.github.jerrymatera.rickymorty.data.remote.dto.episodes.EpisodeDto
import io.github.jerrymatera.rickymorty.domain.models.Episode
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse

fun EpisodeDto.toEpisode(): Episode {
    return Episode(
        airDate = airDate,
        characters = characters,
        created = created,
        episode = episode,
        id = id,
        name = name,
        url = url,
    )
}

fun PaginatedResponse<EpisodeDto>.toEpisodeResponse(): PaginatedResponse<Episode> {
    return PaginatedResponse(
        info = info,
        results = results.map { it.toEpisode() }
    )
}