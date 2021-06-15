package cl.just4fun.popular.data.api

import cl.just4fun.popular.data.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
interface PopularMoviesApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("page") page: Int):MovieResponse
}