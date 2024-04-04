package io.github.jerrymatera.rickymorty.presentation.screen.episode

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.jerrymatera.rickymorty.data.repository.EpisodesRepository
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EpisodesViewModel @Inject constructor(
    private val episodesRepository: EpisodesRepository
) : ViewModel() {
    private val _episodesScreenUiState = MutableStateFlow(EpisodesScreenState())
    val episodesScreenUiState: StateFlow<EpisodesScreenState>  get() = _episodesScreenUiState.asStateFlow()

    init {
        episodesResponse()
    }

    private fun episodesResponse() {
        _episodesScreenUiState.value = episodesScreenUiState.value.copy(isLoading = true)
        viewModelScope.launch {
            episodesRepository.getEpisodes().collect() { response ->
                when (response) {
                    is NetworkResult.Error -> {
                        _episodesScreenUiState.value = episodesScreenUiState.value.copy(
                            episodeResponse = emptyList(),
                            isLoading = false,
                            error = response.message
                        )
                    }
                    is NetworkResult.Loading -> {
                        _episodesScreenUiState.value = episodesScreenUiState.value.copy(
                            isLoading = true
                        )
                    }
                    is NetworkResult.Success -> {
                        _episodesScreenUiState.value = episodesScreenUiState.value.copy(
                            isLoading = false,
                            episodeResponse = response.data?.results
                        )
                    }
                }
            }
        }
    }
}