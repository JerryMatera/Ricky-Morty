package io.github.jerrymatera.rickymorty.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.jerrymatera.rickymorty.presentation.screen.characters.CharactersScreen
import io.github.jerrymatera.rickymorty.presentation.screen.episode.EpisodesScreen
import io.github.jerrymatera.rickymorty.presentation.screen.location.LocationsScreen

@Composable
fun BottomNavGraph(modifier: Modifier, navController: NavHostController) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = BottomNavScreen.Home.route
    ) {
        composable(route = BottomNavScreen.Home.route) {
            CharactersScreen()
        }
        composable(route = BottomNavScreen.Episodes.route) {
            EpisodesScreen()
        }
        composable(route = BottomNavScreen.Locations.route) {
            LocationsScreen()
        }
    }
}