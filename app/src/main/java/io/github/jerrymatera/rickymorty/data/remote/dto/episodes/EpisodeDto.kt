package io.github.jerrymatera.rickymorty.data.remote.dto.episodes

import com.squareup.moshi.Json

data class EpisodeDto(
    @Json(name = "air_date") val airDate: String,
    val characters: List<String>,
    val created: String,
    val episode: String,
    val id: Int,
    val name: String,
    val url: String
)