package com.example.mysampleapp.presentation.splash

import androidx.lifecycle.ViewModel
import com.example.mysampleapp.domain.SampleUseCase
import com.example.mysampleapp.presentation.State
import com.example.mysampleapp.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class SplashActivityViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) :
    ViewModel() {

    fun getSampleResponse() = flow {
        emit(State.LoadingState)

        try {
            delay(1000)
            emit(State.DataState(sampleUseCase()))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Utils.resolveError(e))
        }
    }
}