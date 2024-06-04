package io.github.jerrymatera.rickymorty.presentation.screen.characters

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.github.jerrymatera.rickymorty.domain.models.Character
import io.github.jerrymatera.rickymorty.domain.models.NameUrlItem
import io.github.jerrymatera.rickymorty.presentation.ui.theme.RickyMortyTheme

@Composable
fun CharacterCard(character: Character) {
    Card {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AsyncImage(
                model = character.image,
                contentScale = ContentScale.FillWidth,
                contentDescription = "",
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = character.name)
                Text(text = "${character.status} - ${character.species}")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Last known location: ")
                Text(text = character.location.name)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "First seen in:")
                Text(text = "Episode ${character.episode.first().split("/").last()}")
            }
        }
    }
}

@Preview
@Composable
private fun CharacterCardPrev() {
    RickyMortyTheme {
        CharacterCard(
            character = Character(
                id = 395,
                name = "Greebybobe",
                status = "Alive",
                species = "Alien",
                type = "Greebybobe",
                gender = "unknown",
                origin = NameUrlItem(
                    name = "Girvonesk", url = "https://rickandmortyapi.com/api/location/68"
                ),
                location = NameUrlItem(
                    name = "Worldender's lair", url = "https://rickandmortyapi.com/api/location/4"
                ),
                image = "https://rickandmortyapi.com/api/character/avatar/395.jpeg",
                episode = listOf(
                    "https://rickandmortyapi.com/api/episode/1",
                    "https://rickandmortyapi.com/api/episode/11",
                    "https://rickandmortyapi.com/api/episode/16",
                    "https://rickandmortyapi.com/api/episode/25"
                ),
                url = "https://rickandmortyapi.com/api/character/395",
                created = "2018-04-15T16:46:31.715Z"
            )
        )
    }
}