package com.example.aissaouiilhem.cinemanews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View

class serieDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie_description)

        val toolbar = findViewById<View>(R.id.toolbar3) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Main2Activity::class.java )
            startActivity(intent) }
    }
}
