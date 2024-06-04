package io.github.jerrymatera.rickymorty.domain.models

data class PaginatedResponse<T>(
    val info: Info,
    val results: List<T>
)