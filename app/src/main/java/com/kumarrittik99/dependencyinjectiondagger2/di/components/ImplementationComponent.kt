package com.kumarrittik99.dependencyinjectiondagger2.di.components

import com.kumarrittik99.dependencyinjectiondagger2.features.main.viewmodels.MainActivityViewModel
import dagger.Component

@Component
interface ImplementationComponent {

    fun getViewModel(): MainActivityViewModel
}