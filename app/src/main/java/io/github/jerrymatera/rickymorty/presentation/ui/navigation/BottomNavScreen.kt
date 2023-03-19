package io.github.jerrymatera.rickymorty.presentation.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home : BottomNavScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Episodes : BottomNavScreen(
        route = "episodes",
        title = "Episodes",
        icon = Icons.Default.List
    )

    object Locations : BottomNavScreen(
        route = "locations",
        title = "Locations",
        icon = Icons.Default.LocationOn
    )
}
