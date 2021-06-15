package cl.just4fun.popular.data.repository

import cl.just4fun.popular.data.api.PopularMoviesApi
import cl.just4fun.popular.domain.model.PopularDomain
import cl.just4fun.popular.domain.repositrory.PopularRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
class PopularRepositoryImp  @Inject constructor(
    private val popularMoviesApi: PopularMoviesApi
): PopularRepository{
    override fun getPopularMovies(page: Int): Flow<PopularDomain> {
        return flow {
            val result = popularMoviesApi.getPopularMovies(page).toDomain()
        }
    }
}