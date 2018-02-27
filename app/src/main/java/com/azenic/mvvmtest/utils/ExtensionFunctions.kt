package com.azenic.mvvmtest.utils

import android.app.Activity
import android.arch.lifecycle.LiveData
import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.util.Log
import com.azenic.mvvmtest.di.MvvmTestApplication
import com.azenic.mvvmtest.ui.main.MainActivity
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

/**
 * Created by Azenic on 13-Feb-18.
 */
fun Activity.log(tag: String, message: String){
    if(MvvmTestApplication.debug){
        Log.d(tag, message)
    }
}

fun Fragment.log(tag: String, message: String){
    if(MvvmTestApplication.debug){
        Log.d(tag, message)
    }
}

