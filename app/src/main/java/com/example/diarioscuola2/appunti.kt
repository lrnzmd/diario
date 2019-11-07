package com.example.diarioscuola2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola2.ui.appunti.AppuntiFragment

class appunti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.appunti_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AppuntiFragment.newInstance())
                .commitNow()
        }
    }

}
