package com.forsythe.basictemplatemvvm.data.remote.network.client

import com.forsythe.basictemplatemvvm.constants.baseUrl
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class KtorClient {
    private val client = HttpClient(OkHttp){
        //base url for all network calls
        defaultRequest {
            url(baseUrl)
        }

        install(Logging){
            logger = Logger.SIMPLE
        }

        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true
            })
        }

        //for access token requests
        /*install(Auth) {
            bearer {
                loadTokens {
                    BearerTokens("your access token", "your refresh token")
                }
                refreshTokens {
                    BearerTokens("your access token", "your refresh token")
                }
            }
        }*/
    }

    inline fun <T>safeApiCall(apiCall : () -> T) : ApiOperation<T>{
        return try{
            ApiOperation.Success(data = apiCall())
        }catch (e:Exception){
            ApiOperation.Failure(exception = e)
        }
    }
}