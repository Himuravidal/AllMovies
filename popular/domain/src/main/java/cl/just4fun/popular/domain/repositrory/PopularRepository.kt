package cl.just4fun.popular.domain.repositrory

import cl.just4fun.popular.domain.model.PopularDomain
import kotlinx.coroutines.flow.Flow


/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
interface PopularRepository {

    fun getPopularMovies(page: Int): Flow<PopularDomain>

}