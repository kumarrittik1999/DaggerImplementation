package com.kumarrittik99.dependencyinjectiondagger2.di.components

import com.kumarrittik99.dependencyinjectiondagger2.di.producers.ImplementationModule
import com.kumarrittik99.dependencyinjectiondagger2.features.main.MainActivity
import dagger.Component

@Component(modules = [ImplementationModule::class])
interface ImplementationComponent {

    //fun getViewModel(): MainActivityViewModel

    fun injectDependencies(mainActivity: MainActivity)
}