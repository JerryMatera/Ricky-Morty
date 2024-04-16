package io.github.jerrymatera.rickymorty.presentation.screen.characters
import io.github.jerrymatera.rickymorty.data.remote.models.dto.characters.CharacterDto

data class CharacterScreenState(
    val charactersResponse: List<CharacterDto> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
