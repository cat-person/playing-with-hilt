package cc.elgato.data.repo

import cc.elgato.data.remote.DummyAPI
import cc.elgato.domain.DummyRepo

class DummyRepoImpl(private val api: DummyAPI) : DummyRepo {


    override suspend fun get() {
        api.get()
    }
}