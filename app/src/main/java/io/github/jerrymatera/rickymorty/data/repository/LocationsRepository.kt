package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.models.locations.LocationResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface LocationsRepository {
    suspend fun getLocations(): Flow<NetworkResult<LocationResponse>>
}