package com.example.diarioscuola2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola2.ui.calendario.CalendarioFragment

class calendario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendario_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CalendarioFragment.newInstance())
                .commitNow()
        }
    }

}
