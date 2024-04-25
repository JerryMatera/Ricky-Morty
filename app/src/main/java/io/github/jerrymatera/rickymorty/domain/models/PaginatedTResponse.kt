package io.github.jerrymatera.rickymorty.domain.models

data class PaginatedTResponse<T>(
    val info: Info,
    val results: List<T>
)