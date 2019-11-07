package com.example.diarioscuola2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola2.ui.impostazioni.ImpostazioniFragment

class impostazioni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.impostazioni_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ImpostazioniFragment.newInstance())
                .commitNow()
        }
    }

}
