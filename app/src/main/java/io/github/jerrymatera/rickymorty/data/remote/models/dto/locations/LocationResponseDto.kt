package io.github.jerrymatera.rickymorty.data.remote.models.dto.locations

import io.github.jerrymatera.rickymorty.domain.models.Info

data class LocationResponseDto(
    val info: Info,
    val results: List<LocationDto>
)