package io.github.jerrymatera.rickymorty.data.remote.models.characters

data class Character (
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val location: Location,
    val image: String,
    val episode: List<String>,
)