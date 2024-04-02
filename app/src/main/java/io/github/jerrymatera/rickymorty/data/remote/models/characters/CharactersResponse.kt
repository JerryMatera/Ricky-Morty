package io.github.jerrymatera.rickymorty.data.remote.models.characters

import io.github.jerrymatera.rickymorty.data.remote.models.Info


data class CharactersResponse(
    val info: Info,
    val results: List<CharacterDetail>
)