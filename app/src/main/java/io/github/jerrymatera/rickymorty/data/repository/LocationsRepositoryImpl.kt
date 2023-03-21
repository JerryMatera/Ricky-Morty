package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.models.locations.LocationResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocationsRepositoryImpl @Inject constructor(rickyMortyService: RickyMortyService) : LocationsRepository {
    override suspend fun getLocations(): Flow<LocationResponse> {
        TODO("Not yet implemented")
    }
}