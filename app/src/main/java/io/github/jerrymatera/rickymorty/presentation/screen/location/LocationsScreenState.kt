package io.github.jerrymatera.rickymorty.presentation.screen.location

import io.github.jerrymatera.rickymorty.data.remote.models.locations.LocationDetail

data class LocationsScreenState(
    val locationResponse: List<LocationDetail>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)