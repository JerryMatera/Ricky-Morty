package io.github.jerrymatera.rickymorty.presentation.screen.characters

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.jerrymatera.rickymorty.domain.repository.CharactersRepository
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {
    private val _charactersScreenUiState = MutableStateFlow(CharacterScreenUIState())
    val charactersScreenState: StateFlow<CharacterScreenUIState> =
        _charactersScreenUiState.asStateFlow()

    private fun charactersResponse() = viewModelScope.launch(Dispatchers.IO) {
        _charactersScreenUiState.value = charactersScreenState.value.copy(
            isLoading = true
        )
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
                        charactersResponse = response.data?.results ?: emptyList()
                    )
                    Log.i("character viewmodel", "${response.data}")
                }
            }
        }
    }

    init {
        charactersResponse()
    }
}