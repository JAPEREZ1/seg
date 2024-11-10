package com.example.demo.util

data class JSendResponse(
    val status: String,
    val data: Any?
) {
    companion object {
        fun success(data: Any?): JSendResponse = JSendResponse("success", data)
        fun fail(data: Any?): JSendResponse = JSendResponse("fail", data)
        fun error(message: String): JSendResponse = JSendResponse("error", mapOf("message" to message))
    }
}
