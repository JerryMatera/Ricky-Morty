package io.github.jerrymatera.rickymorty.presentation.screen.characters

import io.github.jerrymatera.rickymorty.domain.models.Character

data class CharacterScreenUIState(
    val charactersResponse: List<Character> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
