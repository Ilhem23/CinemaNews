package com.example.aissaouiilhem.cinemanews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_saison.*
import kotlinx.android.synthetic.main.activity_serie_description.*

class Saison : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saison)

        val toolbar = findViewById<View>(R.id.toolbar4) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, serieDescription::class.java )
            startActivity(intent) }
        val btn: ImageButton = epi1
        setEvent(btn,Episode::class.java)
    }
    private fun setEvent(btn : ImageButton, cls: Class<*>) {

        btn.setOnClickListener({
            val intent = Intent(this, cls)
            startActivity(intent)
        })

    }
}
