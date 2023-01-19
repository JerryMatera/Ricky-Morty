package io.github.jerrymatera.rickymorty.presentation.ui.characters

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.github.jerrymatera.rickymorty.data.models.characters.Character

@Composable
fun CharacterCard(character: Character) {
    Row {
        AsyncImage(model = character.image, contentDescription = "")
        Column {
            Text(
                text = character.name
            )
            Text(
                text = "${character.status} - ${character.species}"
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Last known location: ${character.location.name}"
            )
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            Text(
                text = "First seen in: ${character.episode.first()}"
            )
        }
    }
}
