package io.github.jerrymatera.rickymorty.domain.models

data class Episode(
    val airDate: String,
    val characters: List<String>,
    val created: String,
    val episode: String,
    val id: Int,
    val name: String,
    val url: String
)