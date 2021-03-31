package com.minga.android_kotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minga.android_kotlin.R
import com.minga.android_kotlin.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}