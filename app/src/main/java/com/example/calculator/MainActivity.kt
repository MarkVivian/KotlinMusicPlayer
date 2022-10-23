package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //REMOVES THE HEADER BAR AT THE TOP OF THE APPLICATION
        supportActionBar?.hide()

    }
}

                //CHANGING THE ICON
/*
To change the icon, i right clicked on the app and selected image vector and downloaded a png photo.
NB/ DON'T NAME THE PNG WITH SPACE BETWEEN THE WORDS AND DELETE THE ORIGINAL ICON IN MIPMAP LEAVING
YOUR ICON AS THE ONLY FOLDER IN MIPMAP
*/