package io.github.jerrymatera.rickymorty.data.remote.dto.locations

data class LocationDto(
    val created: String,
    val dimension: String,
    val id: Int,
    val name: String,
    val residents: List<String>,
    val type: String,
    val url: String
)