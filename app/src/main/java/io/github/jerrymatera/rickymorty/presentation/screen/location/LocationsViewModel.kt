package io.github.jerrymatera.rickymorty.presentation.screen.location

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.jerrymatera.rickymorty.data.repository.LocationsRepository
import io.github.jerrymatera.rickymorty.presentation.screen.location.LocationsScreenState
import io.github.jerrymatera.rickymorty.utils.NetworkResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LocationsViewModel @Inject constructor(
    private val locationsRepository: LocationsRepository
) : ViewModel() {
    private val _locationsScreenUiState = MutableStateFlow(LocationsScreenState())
    val locationsScreenState: StateFlow<LocationsScreenState> =
        _locationsScreenUiState.asStateFlow()

    init {
        locationsResponse()
    }

    private fun locationsResponse() {
        viewModelScope.launch {
            locationsRepository.getLocations().collect() { response ->
                when (response) {
                    is NetworkResult.Error -> {
                        _locationsScreenUiState.value = locationsScreenState.value.copy(
                            locationResponse = null,
                            isLoading = false,
                            error = response.message
                        )
                    }
                    is NetworkResult.Loading -> {
                        _locationsScreenUiState.value =
                            locationsScreenState.value.copy(isLoading = true)
                    }
                    is NetworkResult.Success -> {
                        _locationsScreenUiState.value = locationsScreenState.value.copy(
                            isLoading = false,
                            locationResponse = response.data?.results
                        )
                    }
                }
            }
        }

    }
}