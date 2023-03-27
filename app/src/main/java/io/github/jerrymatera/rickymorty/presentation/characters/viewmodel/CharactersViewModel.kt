package io.github.jerrymatera.rickymorty.presentation.characters.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.jerrymatera.rickymorty.data.repository.CharactersRepository
import io.github.jerrymatera.rickymorty.presentation.characters.uiState.CharacterScreenState
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {
    private val _charactersScreenUiState = MutableStateFlow(CharacterScreenState())
    val charactersScreenState: StateFlow<CharacterScreenState> =
        _charactersScreenUiState.asStateFlow()

    init {
        charactersResponse()
    }

    private fun charactersResponse() {
        _charactersScreenUiState.value = charactersScreenState.value.copy(
            isLoading = true
        )
        viewModelScope.launch {
            charactersRepository.getCharacters().collect() { response ->
                when (response) {
                    is NetworkResult.Error -> {
                        _charactersScreenUiState.value = charactersScreenState.value.copy(
                            charactersResponse = emptyList(),
                            isLoading = false,
                            error = response.message.toString()
                        )
                    }
                    is NetworkResult.Loading -> {
                        _charactersScreenUiState.value =
                            charactersScreenState.value.copy(isLoading = true)
                    }
                    is NetworkResult.Success -> {
                        _charactersScreenUiState.value = charactersScreenState.value.copy(
                            isLoading = false,
                            charactersResponse = response.data?.results
                        )
                    }
                }
            }
        }
    }
}