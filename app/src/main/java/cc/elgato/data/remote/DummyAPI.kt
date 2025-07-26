package cc.elgato.data.remote

import retrofit2.http.GET

interface DummyAPI {
    @GET("dummy")
    suspend fun get() {

    }
}