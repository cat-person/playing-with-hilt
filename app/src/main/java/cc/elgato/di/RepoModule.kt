package cc.elgato.di

import cc.elgato.data.repo.DummyRepoImpl
import cc.elgato.domain.DummyRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun bindDummyRepo(repo: DummyRepoImpl): DummyRepo
}