package io.github.jerrymatera.rickymorty.presentation.screen.characters

import io.github.jerrymatera.rickymorty.data.remote.models.characters.CharacterDetail

data class CharacterScreenState(
    val charactersResponse: List<CharacterDetail>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
