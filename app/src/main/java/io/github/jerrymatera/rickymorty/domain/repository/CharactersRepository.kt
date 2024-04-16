package io.github.jerrymatera.rickymorty.domain.repository

import io.github.jerrymatera.rickymorty.data.remote.models.dto.characters.CharactersResponseDto
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    suspend fun getCharacters(): Flow<NetworkResult<CharactersResponseDto>>
}