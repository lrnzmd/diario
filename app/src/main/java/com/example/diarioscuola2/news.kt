package com.example.diarioscuola2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola2.ui.news.NewsFragment

class news : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NewsFragment.newInstance())
                .commitNow()
        }
    }

}
