package cc.elgato.data.repo

import cc.elgato.data.remote.DummyAPI
import cc.elgato.di.Hello
import cc.elgato.di.World
import cc.elgato.domain.DummyRepo
import javax.inject.Inject
import javax.inject.Named

class DummyRepoImpl @Inject constructor(private val api: DummyAPI, @Named("Hello") private val hello: Hello, @Named("World") private val world: World) : DummyRepo {
    override suspend fun get(): String {
        api.get()
        return "$hello $world"
    }
}