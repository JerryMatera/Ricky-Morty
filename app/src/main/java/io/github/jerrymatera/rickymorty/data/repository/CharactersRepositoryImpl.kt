package io.github.jerrymatera.rickymorty.data.repository

import android.util.Log
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import io.github.jerrymatera.rickymorty.data.mapper.toCharacterResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import io.github.jerrymatera.rickymorty.domain.models.CharactersResponse
import io.github.jerrymatera.rickymorty.domain.repository.CharactersRepository
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(private val rickyMortyService: RickyMortyService) :
    CharactersRepository {
    override suspend fun getCharacters(): Flow<NetworkResult<CharactersResponse>> = flow {
        emit(NetworkResult.Loading())
        when (val response = rickyMortyService.getCharacters()) {
            is ApiResponse.Success -> {
                val charactersResponse = response.data.toCharacterResponse()
                Log.i("Character Success", charactersResponse.toString())
                emit(NetworkResult.Success(data = charactersResponse))
            }

            is ApiResponse.Failure.Error -> {
                Log.i("Character Failure", response.message())

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