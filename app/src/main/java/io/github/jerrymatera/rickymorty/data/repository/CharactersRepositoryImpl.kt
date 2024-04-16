package io.github.jerrymatera.rickymorty.data.repository

import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import io.github.jerrymatera.rickymorty.data.remote.models.dto.characters.CharactersResponseDto
import io.github.jerrymatera.rickymorty.domain.repository.CharactersRepository
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(private val rickyMortyService: RickyMortyService) :
    CharactersRepository {
    override suspend fun getCharacters(): Flow<NetworkResult<CharactersResponseDto>> = flow {
        emit(NetworkResult.Loading())
        when (val response = rickyMortyService.getCharacters()) {
            is ApiResponse.Success -> {
                val charactersResponse = response.data
                emit(NetworkResult.Success(data = charactersResponse))
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