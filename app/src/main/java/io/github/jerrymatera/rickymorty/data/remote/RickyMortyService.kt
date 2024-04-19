package io.github.jerrymatera.rickymorty.data.remote

import com.skydoves.sandwich.ApiResponse
import io.github.jerrymatera.rickymorty.data.remote.models.dto.characters.CharactersResponseDto
import io.github.jerrymatera.rickymorty.data.remote.models.dto.episodes.EpisodeResponseDto
import io.github.jerrymatera.rickymorty.data.remote.models.dto.locations.LocationResponseDto
import retrofit2.http.GET

interface RickyMortyService {
    @GET("character")
    suspend fun getCharacters() : ApiResponse<CharactersResponseDto>

    @GET("location")
    suspend fun getLocations() : ApiResponse<LocationResponseDto>

    @GET("episode")
    suspend fun getEpisodes(): ApiResponse<EpisodeResponseDto>
}