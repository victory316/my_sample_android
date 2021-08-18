package com.example.mysampleapp.presentation.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysampleapp.R
import com.example.mysampleapp.base.BaseActivity

/**
 *  최초 시작을 위한 Splash activity
 */
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}