package io.github.jerrymatera.rickymorty.data.repository

import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import io.github.jerrymatera.rickymorty.data.mapper.toLocationResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import io.github.jerrymatera.rickymorty.domain.models.Location
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse
import io.github.jerrymatera.rickymorty.domain.repository.LocationsRepository
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class LocationsRepositoryImpl @Inject constructor(private val rickyMortyService: RickyMortyService) :
    LocationsRepository {
    override suspend fun getLocations(): Flow<NetworkResult<PaginatedResponse<Location>>> = flow {
        emit(NetworkResult.Loading())
        when (val response = rickyMortyService.getLocations()) {
            is ApiResponse.Success -> {
                val locationsResponse = response.data
                emit(NetworkResult.Success(data = locationsResponse.toLocationResponse()))
            }

            is ApiResponse.Failure.Error -> {
                emit(NetworkResult.Error(message = response.message()))
            }

            is ApiResponse.Failure.Exception -> {
                emit(NetworkResult.Error(message = response.message()))
            }
        }
    }.flowOn(Dispatchers.IO)
}