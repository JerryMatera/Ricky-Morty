package io.github.jerrymatera.rickymorty.data.remote.dto.characters

import io.github.jerrymatera.rickymorty.domain.models.NameUrlItem


data class CharacterDto(
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