package com.azenic.mvvmtest.di.modules

import android.content.Context
import com.azenic.mvvmtest.di.MvvmTestApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Azenic on 10-Feb-18.
 */
@Module
class AppModule(private val mvvmTestApplication: MvvmTestApplication) {

    @Provides
    @Singleton
    fun provideContext(): Context = mvvmTestApplication


}