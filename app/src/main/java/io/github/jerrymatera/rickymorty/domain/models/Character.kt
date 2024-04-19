package io.github.jerrymatera.rickymorty.domain.models


data class Character(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: NameUrlItem,
    val name: String,
    val origin: NameUrlItem,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)