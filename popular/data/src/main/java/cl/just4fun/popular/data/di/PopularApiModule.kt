package cl.just4fun.popular.data.di

import cl.just4fun.popular.data.api.PopularMoviesApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
@Module
class PopularApiModule {
    @Provides
    fun providePopularApi(retrofit: Retrofit): PopularMoviesApi {
        return retrofit.create(PopularMoviesApi::class.java)
    }
}