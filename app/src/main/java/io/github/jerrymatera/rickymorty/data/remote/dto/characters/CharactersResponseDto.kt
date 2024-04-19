package io.github.jerrymatera.rickymorty.data.remote.dto.characters

import io.github.jerrymatera.rickymorty.domain.models.Info


data class CharactersResponseDto(
    val info: Info,
    val results: List<CharacterDto>
)