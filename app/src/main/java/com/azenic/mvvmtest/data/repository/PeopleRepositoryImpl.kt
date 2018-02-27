package com.azenic.mvvmtest.data.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.azenic.mvvmtest.data.models.PeopleResponseModel
import com.azenic.mvvmtest.data.remote.RemoteApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by Azenic on 10-Feb-18.
 */
class PeopleRepositoryImpl @Inject constructor(private val remoteApiService: RemoteApiService) : PeopleRepository {


override fun getPeople(): MutableLiveData<PeopleResponseModel> {
    val peopleLiveData = MutableLiveData<PeopleResponseModel>()
    remoteApiService.getPeople().enqueue(object : Callback<PeopleResponseModel> {

        override fun onResponse(call: Call<PeopleResponseModel>?, response: Response<PeopleResponseModel>?) {
            if (response!!.isSuccessful) {
                peopleLiveData.value = response?.body()
            }
        }

        override fun onFailure(call: Call<PeopleResponseModel>?, t: Throwable?) {

        }

    })
    return peopleLiveData
}
}