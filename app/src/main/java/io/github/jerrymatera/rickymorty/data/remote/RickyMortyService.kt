package io.github.jerrymatera.rickymorty.data.remote

import io.github.jerrymatera.rickymorty.data.models.characters.CharactersResponse
import io.github.jerrymatera.rickymorty.data.models.episodes.EpisodeResponse
import io.github.jerrymatera.rickymorty.data.models.locations.LocationResponse
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import retrofit2.http.GET

interface RickyMortyService {
    @GET("/characters")
    suspend fun getCharacters() : NetworkResult<CharactersResponse>

    @GET("/location")
    suspend fun getLocations() : NetworkResult<LocationResponse>

    @GET("/episode")
    suspend fun getEpisodes(): NetworkResult<EpisodeResponse>
}