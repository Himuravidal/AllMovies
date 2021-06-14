package cl.just4fun.allmovies.di

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

/**
 * Created by adacher on 13-06-21. cristian.vidal.lopez@gmail.com
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface DaggerDependencies {
    fun providesRetrofit(): Retrofit
}