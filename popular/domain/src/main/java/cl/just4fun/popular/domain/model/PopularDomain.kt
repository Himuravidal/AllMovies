package cl.just4fun.popular.domain.model

/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
data class PopularDomain (
    val adult: Boolean = false,
    val originalLanguage: String = "",
    val originalTitle: String = "",
    val overview: String = "",
    val popularity: Double = 0.0,
    val posterPath: String = "",
    val releaseDate: String = "",
    val title: String = ""
)