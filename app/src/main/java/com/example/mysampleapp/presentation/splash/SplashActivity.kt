package com.example.mysampleapp.presentation.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.mysampleapp.R
import com.example.mysampleapp.base.BaseActivity
import com.example.mysampleapp.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 *  최초 시작을 위한 Splash activity
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_splash)
    }
}