package io.github.jerrymatera.rickymorty.presentation.screen.characters

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CharactersScreen(state: CharacterScreenState) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(state.charactersResponse){ character ->
            CharacterCard(character = character)
        }
    }
}