package com.example.aissaouiilhem.cinemanews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import com.example.aissaouiilhem.cinemanews.R.id.toolbar
import com.example.aissaouiilhem.cinemanews.R.id.toolbar
import kotlinx.android.synthetic.main.activity_test.*
import kotlinx.android.synthetic.main.app_bar_main2.*


class test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Main2Activity::class.java )
            startActivity(intent) }


    }
}
