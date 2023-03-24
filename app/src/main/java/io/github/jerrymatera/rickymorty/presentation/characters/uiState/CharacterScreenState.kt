package io.github.jerrymatera.rickymorty.presentation.characters.uiState

import io.github.jerrymatera.rickymorty.data.models.characters.CharacterDetail

data class CharacterScreenState(
    val charactersResponse: List<CharacterDetail>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
