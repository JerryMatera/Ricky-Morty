package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.remote.models.characters.CharactersResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    suspend fun getCharacters(): Flow<NetworkResult<CharactersResponse>>
}