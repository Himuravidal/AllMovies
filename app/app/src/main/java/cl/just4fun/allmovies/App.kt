package cl.just4fun.allmovies

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by adacher on 13-06-21. cristian.vidal.lopez@gmail.com
 */
@HiltAndroidApp
class App: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}