package com.azenic.mvvmtest.data.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.azenic.mvvmtest.data.models.PeopleResponseModel

/**
 * Created by Azenic on 10-Feb-18.
 */
interface PeopleRepository {

    fun getPeople(): MutableLiveData<PeopleResponseModel>
}