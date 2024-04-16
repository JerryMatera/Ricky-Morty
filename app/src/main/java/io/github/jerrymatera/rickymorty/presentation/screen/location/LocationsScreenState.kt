package io.github.jerrymatera.rickymorty.presentation.screen.location

import io.github.jerrymatera.rickymorty.data.remote.models.dto.locations.LocationDto

data class LocationsScreenState(
    val locationResponse: List<LocationDto>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)