package io.github.jerrymatera.rickymorty.data.models


data class CharactersResponse(
    val info: Info,
    val results: List<Character>
)