package com.publishsubject.app

import com.publishsubject.app.di.component.AppComponent
import com.publishsubject.app.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class PublishSubjectApplication : DaggerApplication() {

    override fun applicationInjector():
            AndroidInjector<out DaggerApplication> {

        //Build app component
        val appComponent: AppComponent = DaggerAppComponent.builder()
            .application(this)
            .build()

        //inject application instance
        appComponent.inject(this)
        return appComponent
    }

}