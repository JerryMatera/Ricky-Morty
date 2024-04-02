package io.github.jerrymatera.rickymorty.data.repository

import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import io.github.jerrymatera.rickymorty.data.remote.models.episodes.EpisodeResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class EpisodesRepositoryImpl @Inject constructor(private val rickyMortyService: RickyMortyService) :
    EpisodesRepository {
    override suspend fun getEpisodes(): Flow<NetworkResult<EpisodeResponse>> = flow {
        emit(NetworkResult.Loading())
        when (val response = rickyMortyService.getEpisodes()) {
            is ApiResponse.Success -> {
                val episodesResponse = response.data
                emit(NetworkResult.Success(data = episodesResponse))
            }
            is ApiResponse.Failure.Error -> {
                emit(
                    NetworkResult.Error(
                        message = response.message()
                    )
                )
            }
            is ApiResponse.Failure.Exception -> {
                emit(
                    NetworkResult.Error(
                        message = response.message()
                    )
                )
            }
        }
    }.flowOn(Dispatchers.IO)
}