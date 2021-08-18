package com.example.mysampleapp.utils

import com.example.mysampleapp.presentation.AuthenticationException
import com.example.mysampleapp.presentation.NetworkErrorException
import com.example.mysampleapp.presentation.NetworkErrorException.Companion.parseException
import com.example.mysampleapp.presentation.State
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 *  에러 핸들링을 위한 Utils
 */
class Utils {
    companion object {
        fun resolveError(e: Exception): State.ErrorState {
            var error = e

            when (e) {
                is SocketTimeoutException -> {
                    error = NetworkErrorException(errorMessage = "connection error!")
                }
                is ConnectException -> {
                    error = NetworkErrorException(errorMessage = "no internet access!")
                }
                is UnknownHostException -> {
                    error = NetworkErrorException(errorMessage = "no internet access!")
                }
            }

            if (e is HttpException) {
                when (e.code()) {
                    502 -> {
                        error = NetworkErrorException(e.code(), "internal error!")
                    }
                    401 -> {
                        throw AuthenticationException("authentication error!")
                    }
                    400 -> {
                        error = NetworkErrorException.parseException(e)
                    }
                }
            }


            return State.ErrorState(error)
        }
    }
}
