package com.example.playme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        instead of using the:
            actionBar?.hide()
        to remove the action bar,
        we go to the values/themes and set both files containing the DarkActionBar to NoActionBar.
         */
    }
}