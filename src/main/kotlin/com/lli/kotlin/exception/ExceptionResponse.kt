package com.lli.kotlin.exception

class ExceptionResponse(val url: String, ex: Exception) {
    val exception = ex.message ?: ""
}