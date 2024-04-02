package io.github.jerrymatera.rickymorty.data.remote.models.locations

import io.github.jerrymatera.rickymorty.data.remote.models.Info

data class LocationResponse(
    val info: Info,
    val results: List<LocationDetail>
)