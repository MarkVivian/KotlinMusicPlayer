package com.example.playme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discover_activity)
        /*
        instead of using the:
            actionBar?.hide()
        to remove the action bar,
        we go to the values/themes and set both files containing the DarkActionBar to NoActionBar.
         */

        /*
we are going to set a listener for all the buttons at the bottom of the app which will allow us to
switch between activities.
        */
        val searchButton = findViewById<Button>(R.id.Search)
        searchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        val libraryButton = findViewById<Button>(R.id.Library)
        libraryButton.setOnClickListener {
            val intent = Intent(this, LibraryActivity::class.java)
            startActivity(intent)
        }

        val settingsButton = findViewById<Button>(R.id.Settings)
        settingsButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

    }
}
