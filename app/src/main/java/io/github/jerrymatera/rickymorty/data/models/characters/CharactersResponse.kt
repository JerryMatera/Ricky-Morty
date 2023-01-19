package io.github.jerrymatera.rickymorty.data.models.characters

import io.github.jerrymatera.rickymorty.data.models.Info


data class CharactersResponse(
    val info: Info,
    val results: List<CharacterDetail>
)