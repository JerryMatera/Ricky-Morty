package io.github.jerrymatera.rickymorty.data.models.locations

import io.github.jerrymatera.rickymorty.data.models.Info

data class LocationResponse(
    val info: Info,
    val results: List<LocationDetail>
)