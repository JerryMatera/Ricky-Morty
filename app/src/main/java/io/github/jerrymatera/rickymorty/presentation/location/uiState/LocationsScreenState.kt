package io.github.jerrymatera.rickymorty.presentation.location.uiState

import io.github.jerrymatera.rickymorty.data.models.locations.LocationDetail

data class LocationsScreenState(
    val locationResponse: List<LocationDetail>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)