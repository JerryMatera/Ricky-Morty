package io.github.jerrymatera.rickymorty.presentation.navigation

import androidx.annotation.StringRes
import io.github.jerrymatera.rickymorty.R

sealed class DestinationRoutes(
    val route: String,
    @StringRes val title: Int,
) {
    data object Characters : DestinationRoutes(
        route = "Characters",
        title = R.string.characters
    )

    data object Episodes : DestinationRoutes(
        route = "episodes",
        title = R.string.episodes,
    )

    data object Locations : DestinationRoutes(
        route = "locations",
        title = R.string.locations,
    )
}
