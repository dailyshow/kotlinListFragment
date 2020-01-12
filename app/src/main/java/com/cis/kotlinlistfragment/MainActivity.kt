package com.cis.kotlinlistfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var listFragment = ListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tran = supportFragmentManager.beginTransaction()
        tran.replace(R.id.container, listFragment)
        tran.commit()
    }
}
