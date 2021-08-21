package com.example.mysampleapp.presentation.splash

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.example.mysampleapp.R
import com.example.mysampleapp.base.BaseActivity
import com.example.mysampleapp.databinding.ActivitySplashBinding
import com.example.mysampleapp.presentation.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *  최초 시작을 위한 Splash activity
 */
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {

            Log.d("test", "??")
            delay(SPLASH_TIME)

            CoroutineScope(Dispatchers.Main).launch {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }
    }

    companion object {
        const val SPLASH_TIME = 1500L
    }
}