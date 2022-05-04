package com.kumarrittik99.dependencyinjectiondagger2.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kumarrittik99.dependencyinjectiondagger2.R
import com.kumarrittik99.dependencyinjectiondagger2.di.components.DaggerImplementationComponent
import com.kumarrittik99.dependencyinjectiondagger2.features.main.viewmodels.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewmodel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerImplementationComponent.builder().build().injectDependencies(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


/*
        We want all the following dependencies to be added by dagger
        val local = Local()
        val remote = Remote()
        val repository = MainRepository(local, remote)
        val viewModel = MainActivityViewModel(repository)*/

        /*val viewmodel = DaggerImplementationComponent.builder().build().getViewModel()
        Log.i("Object_Value", viewmodel.toString())*/

        Log.i("Object_Value", viewmodel.toString())
    }
}