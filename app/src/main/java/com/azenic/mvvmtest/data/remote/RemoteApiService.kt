package com.azenic.mvvmtest.data.remote

import com.azenic.mvvmtest.data.models.PeopleResponseModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Azenic on 10-Feb-18.
 */
interface RemoteApiService {

    @GET("people")
    fun getPeople(): Call<PeopleResponseModel>
}