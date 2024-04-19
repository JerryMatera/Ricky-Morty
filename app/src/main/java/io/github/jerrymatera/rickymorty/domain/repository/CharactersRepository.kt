package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.domain.models.CharactersResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    suspend fun getCharacters(): Flow<NetworkResult<CharactersResponse>>
}