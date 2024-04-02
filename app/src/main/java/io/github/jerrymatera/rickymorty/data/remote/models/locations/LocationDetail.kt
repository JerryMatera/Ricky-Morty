package io.github.jerrymatera.rickymorty.data.remote.models.locations

data class LocationDetail(
    val created: String,
    val dimension: String,
    val id: Int,
    val name: String,
    val residents: List<String>,
    val type: String,
    val url: String
)