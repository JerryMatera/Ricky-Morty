package io.github.jerrymatera.rickymorty.data.mapper

import io.github.jerrymatera.rickymorty.data.remote.dto.characters.CharacterDto
import io.github.jerrymatera.rickymorty.domain.models.Character
import io.github.jerrymatera.rickymorty.domain.models.NameUrlItem
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse

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


fun PaginatedResponse<CharacterDto>.toCharacterResponse(): PaginatedResponse<Character> {
    return PaginatedResponse(info = info, results = results.map { it.toCharacter() })
}