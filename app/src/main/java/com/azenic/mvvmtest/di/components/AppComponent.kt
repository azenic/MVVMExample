package com.azenic.mvvmtest.di.components

import com.azenic.mvvmtest.di.modules.AppModule
import com.azenic.mvvmtest.di.modules.PeopleRepositoryModule
import com.azenic.mvvmtest.di.modules.RemoteModule
import com.azenic.mvvmtest.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Azenic on 10-Feb-18.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        RemoteModule::class,
        PeopleRepositoryModule::class))

interface AppComponent {

    fun inject(mainActivity: MainActivity)

}