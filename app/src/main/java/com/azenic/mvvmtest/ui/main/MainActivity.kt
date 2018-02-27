package com.azenic.mvvmtest.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.azenic.mvvmtest.R
import com.azenic.mvvmtest.di.MvvmTestApplication
import com.azenic.mvvmtest.ui.main.characters.CharacterListFragment
import com.azenic.mvvmtest.utils.log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
        loadCharacterListFragment()
        log(localClassName, "aaaaaaa")
    }

    private fun setupViewModel() {
        MvvmTestApplication.appComponent.inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }

    private fun loadCharacterListFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, CharacterListFragment()).commit()
    }


}
