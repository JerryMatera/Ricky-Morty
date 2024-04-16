package io.github.jerrymatera.rickymorty.domain.models

data class Info(
    val count: Int,
    val pages: Int,
    val next: String,
    val prev: Any?
)
