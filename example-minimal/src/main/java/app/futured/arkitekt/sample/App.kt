package app.futured.arkitekt.sample

import android.util.Log
import app.futured.arkitekt.core.error.UseCaseErrorHandler
import app.futured.arkitekt.sample.injection.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        UseCaseErrorHandler.globalOnErrorLogger = { error ->
            Log.d("UseCase error", "$error")
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerApplicationComponent.builder().application(this).build()
        component.inject(this)
        return component
    }
}
