package io.github.jerrymatera.rickymorty.data.remote

import com.skydoves.sandwich.ApiResponse
import io.github.jerrymatera.rickymorty.data.models.characters.CharactersResponse
import io.github.jerrymatera.rickymorty.data.models.episodes.EpisodeResponse
import io.github.jerrymatera.rickymorty.data.models.locations.LocationResponse
import retrofit2.http.GET

interface RickyMortyService {
    @GET("/characters")
    suspend fun getCharacters() : ApiResponse<CharactersResponse>

    @GET("/location")
    suspend fun getLocations() : ApiResponse<LocationResponse>

    @GET("/episode")
    suspend fun getEpisodes(): ApiResponse<EpisodeResponse>
}