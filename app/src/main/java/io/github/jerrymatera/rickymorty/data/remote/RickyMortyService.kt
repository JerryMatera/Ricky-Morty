package io.github.jerrymatera.rickymorty.data.remote

import com.skydoves.sandwich.ApiResponse
import io.github.jerrymatera.rickymorty.data.remote.dto.characters.CharacterDto
import io.github.jerrymatera.rickymorty.data.remote.dto.episodes.EpisodeDto
import io.github.jerrymatera.rickymorty.data.remote.dto.locations.LocationDto
import io.github.jerrymatera.rickymorty.domain.models.PaginatedResponse
import retrofit2.http.GET

interface RickyMortyService {
    @GET("character")
    suspend fun getCharacters() : ApiResponse<PaginatedResponse<CharacterDto>>

    @GET("location")
    suspend fun getLocations() : ApiResponse<PaginatedResponse<LocationDto>>

    @GET("episode")
    suspend fun getEpisodes(): ApiResponse<PaginatedResponse<EpisodeDto>>
}