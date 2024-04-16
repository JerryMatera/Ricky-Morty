package io.github.jerrymatera.rickymorty.data.remote.models.dto.characters

import io.github.jerrymatera.rickymorty.domain.models.Info


data class CharactersResponseDto(
    val info: Info,
    val results: List<CharacterDto>
)