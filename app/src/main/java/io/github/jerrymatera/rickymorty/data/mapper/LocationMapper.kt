package io.github.jerrymatera.rickymorty.data.mapper

import io.github.jerrymatera.rickymorty.data.remote.dto.locations.LocationDto
import io.github.jerrymatera.rickymorty.domain.models.Location
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse

fun LocationDto.toLocation(): Location {
    return Location(
        created = created,
        dimension = dimension,
        id = id,
        name = name,
        residents = residents,
        type = type,
        url = url,
    )
}

fun PaginatedResponse<LocationDto>.toLocationResponse(): PaginatedResponse<Location> {
    return PaginatedResponse(
        info = info,
        results = results.map { it.toLocation() }
    )
}