package com.publishsubject.app.di.component

import android.app.Application
import com.publishsubject.app.PublishSubjectApplication
import com.publishsubject.app.di.module.ActivityModule
import com.publishsubject.app.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    AppModule::class
])

interface AppComponent : AndroidInjector<PublishSubjectApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}