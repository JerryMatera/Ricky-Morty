package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.domain.models.Location
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface LocationsRepository {
    suspend fun getLocations(): Flow<NetworkResult<PaginatedResponse<Location>>>
}