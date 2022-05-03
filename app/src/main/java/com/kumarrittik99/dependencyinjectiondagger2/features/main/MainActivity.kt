package com.kumarrittik99.dependencyinjectiondagger2.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kumarrittik99.dependencyinjectiondagger2.R
import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.local.Local
import com.kumarrittik99.dependencyinjectiondagger2.features.main.data.remote.Remote
import com.kumarrittik99.dependencyinjectiondagger2.features.main.repositories.MainRepository
import com.kumarrittik99.dependencyinjectiondagger2.features.main.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val local = Local()
        val remote = Remote()
        val repository = MainRepository(local, remote)
        val viewModel = MainActivityViewModel(repository)
    }
}