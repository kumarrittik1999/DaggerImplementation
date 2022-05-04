package com.kumarrittik99.dependencyinjectiondagger2.di.producers

import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.DataSource1
import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.remote.Remote
import dagger.Binds
import dagger.Module

@Module
abstract class ImplementationModule {

    /*@Provides
    fun getLocalDataSource(local: Local): DataSource1 {
        return local
    }*/

    @Binds
    abstract fun bindDataSource(remote: Remote): DataSource1

}