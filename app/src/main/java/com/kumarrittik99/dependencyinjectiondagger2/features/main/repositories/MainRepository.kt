package com.kumarrittik99.dependencyinjectiondagger2.features.main.repositories

import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.local.Local
import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.remote.Remote

class MainRepository(private val local: Local, private val remote: Remote) {
}