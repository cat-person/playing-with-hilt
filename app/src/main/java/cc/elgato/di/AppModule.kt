package cc.elgato.di

import cc.elgato.data.remote.DummyAPI
import cc.elgato.data.repo.DummyRepoImpl
import cc.elgato.domain.DummyRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

typealias Hello = String
typealias World = String

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideDummyApi(): DummyAPI {
        return Retrofit.Builder().baseUrl("https://cat-person.github.io/").build().create(DummyAPI::class.java)

    }

    @Provides
    @Singleton
    @Named("Hello")
    fun provideHello(): Hello {
        return "Hello"
    }

    @Provides
    @Singleton
    @Named("World")
    fun provideWorld(): World {
        return "Earth" +
                ""
    }

//    @Provides
//    @Singleton
//    fun provideDummyRepo(api: DummyAPI, @Named("Hello") hello: Hello, @Named("World")  world: World): DummyRepo {
//        return DummyRepoImpl(api, hello, world)
//    }
}