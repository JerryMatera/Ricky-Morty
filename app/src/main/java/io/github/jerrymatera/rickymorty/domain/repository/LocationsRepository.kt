package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.data.remote.models.dto.locations.LocationResponseDto
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface LocationsRepository {
    suspend fun getLocations(): Flow<NetworkResult<LocationResponseDto>>
}