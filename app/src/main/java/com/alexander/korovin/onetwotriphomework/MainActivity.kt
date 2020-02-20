package com.alexander.korovin.onetwotriphomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexander.korovin.onetwotriphomework.ui.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commitNow()
        }
    }

}
