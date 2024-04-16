package io.github.jerrymatera.rickymorty.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.jerrymatera.rickymorty.presentation.screen.characters.CharactersScreen
import io.github.jerrymatera.rickymorty.presentation.screen.characters.CharactersViewModel
import io.github.jerrymatera.rickymorty.presentation.screen.episode.EpisodesScreen
import io.github.jerrymatera.rickymorty.presentation.screen.location.LocationsScreen

@Composable
fun BottomNavGraph(modifier: Modifier, navController: NavHostController) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = DestinationRoutes.Characters.route
    ) {
        composable(route = DestinationRoutes.Characters.route) {
            val viewModel = hiltViewModel<CharactersViewModel>()
            val state = viewModel.charactersScreenState.collectAsState().value
            CharactersScreen(state = state)
        }
        composable(route = DestinationRoutes.Episodes.route) {
            EpisodesScreen()
        }
        composable(route = DestinationRoutes.Locations.route) {
            LocationsScreen()
        }
    }
}