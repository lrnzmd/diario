package com.example.diarioscuola2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola2.ui.compiti.CompitiFragment

class compiti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compiti_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CompitiFragment.newInstance())
                .commitNow()
        }
    }

}
