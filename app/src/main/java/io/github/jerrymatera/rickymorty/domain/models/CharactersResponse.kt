package io.github.jerrymatera.rickymorty.domain.models

data class CharactersResponse(
    val info: Info,
    val results: List<Character>
)