package com.kumarrittik99.dependencyinjectiondagger2.features.main.repositories

import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.DataSource1
import javax.inject.Inject

class MainRepository @Inject constructor(private val dataSource: DataSource1) {
}