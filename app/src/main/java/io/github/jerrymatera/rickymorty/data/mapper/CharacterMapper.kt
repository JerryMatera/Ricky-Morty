package io.github.jerrymatera.rickymorty.data.mapper

import io.github.jerrymatera.rickymorty.data.remote.dto.characters.CharacterDto
import io.github.jerrymatera.rickymorty.data.remote.dto.characters.CharactersResponseDto
import io.github.jerrymatera.rickymorty.domain.models.Character
import io.github.jerrymatera.rickymorty.domain.models.CharactersResponse
import io.github.jerrymatera.rickymorty.domain.models.NameUrlItem

fun Character.toCharacterDto(): CharacterDto {
    return CharacterDto(
        created = created,
        episode = episode,
        gender = gender,
        id = id,
        image = image,
        location = NameUrlItem(name = location.name, url = location.url),
        name = name,
        origin = NameUrlItem(name = origin.name, url = origin.url),
        species = species,
        status = status,
        type = type,
        url = url
    )
}

fun CharacterDto.toCharacter(): Character {
    return Character(
        created = created,
        episode = episode,
        gender = gender,
        id = id,
        image = image,
        location = NameUrlItem(name = location.name, url = location.url),
        name = name,
        origin = NameUrlItem(name = origin.name, url = origin.url),
        species = species,
        status = status,
        type = type,
        url = url
    )
}

fun CharactersResponseDto.toCharacterResponse(): CharactersResponse {
    return CharactersResponse(info = info, results = results.map { it.toCharacter() })
}