package com.azenic.mvvmtest.ui.main

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.azenic.mvvmtest.data.repository.PeopleRepository
import javax.inject.Inject

/**
 * Created by Azenic on 10-Feb-18.
 */
class MainViewModelFactory @Inject constructor(val peopleRepository: PeopleRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(peopleRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}