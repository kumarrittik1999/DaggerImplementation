package com.kumarrittik99.dependencyinjectiondagger2.features.main.viewmodels

import com.kumarrittik99.dependencyinjectiondagger2.features.main.repositories.MainRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val repository: MainRepository) {

}