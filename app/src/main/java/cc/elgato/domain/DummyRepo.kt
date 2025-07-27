package cc.elgato.domain

interface DummyRepo {
    suspend fun get(): String
}