package com.example.mysampleapp.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders
import com.example.mysampleapp.R

/**
 *  BaseActivity
 */
abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {
}