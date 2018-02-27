package com.azenic.mvvmtest.di.modules

import com.azenic.mvvmtest.data.repository.PeopleRepository
import com.azenic.mvvmtest.data.repository.PeopleRepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Azenic on 10-Feb-18.
 */
@Module
abstract class PeopleRepositoryModule {

    @Binds
    abstract fun bindsPeopleRepository(peopleRepository: PeopleRepositoryImpl): PeopleRepository
}