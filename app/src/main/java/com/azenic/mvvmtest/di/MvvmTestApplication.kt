package com.azenic.mvvmtest.di

import android.app.Application
import com.azenic.mvvmtest.di.components.AppComponent
import com.azenic.mvvmtest.di.components.DaggerAppComponent
import com.azenic.mvvmtest.di.modules.AppModule

/**
 * Created by Azenic on 10-Feb-18.
 */
class MvvmTestApplication : Application() {

    companion object {
        lateinit var appComponent: AppComponent
        const val debug: Boolean = true
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger(){
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this)).build()
    }
}