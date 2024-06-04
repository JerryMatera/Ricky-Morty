package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.domain.models.Character
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    suspend fun getCharacters(): Flow<NetworkResult<PaginatedResponse<Character>>>
}