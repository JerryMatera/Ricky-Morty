package io.github.jerrymatera.rickymorty.data.repository

import io.github.jerrymatera.rickymorty.data.models.characters.CharactersResponse
import io.github.jerrymatera.rickymorty.data.remote.RickyMortyService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(rickyMortyService: RickyMortyService) :
    CharactersRepository {
    override suspend fun getCharacters(): Flow<CharactersResponse> {
        TODO("Not yet implemented")
    }
}