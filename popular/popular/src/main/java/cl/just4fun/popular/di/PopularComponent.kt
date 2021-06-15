package cl.just4fun.popular.di

import android.content.Context
import cl.just4fun.allmovies.di.DaggerDependencies
import cl.just4fun.popular.PopularFragment
import dagger.BindsInstance
import dagger.Component

/**
 * Created by adacher on 14-06-21. cristian.vidal.lopez@gmail.com
 */
@Component(
    dependencies = [DaggerDependencies::class],
    modules = [
        //PopularApiModule::class,
        //PopularRepositoryModule::class,
        //PopularUseCaseModule::class,
        //PopularFeatureModule::class
    ]
)
interface PopularComponent {
    fun inject(popularFragment: PopularFragment)

    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(daggerDependencies: DaggerDependencies): Builder
        fun build(): PopularComponent
    }
}