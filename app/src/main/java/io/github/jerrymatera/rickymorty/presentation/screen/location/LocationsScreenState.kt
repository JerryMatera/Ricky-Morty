package io.github.jerrymatera.rickymorty.presentation.screen.location

import io.github.jerrymatera.rickymorty.domain.models.Location

data class LocationsScreenState(
    val locationResponse: List<Location>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)