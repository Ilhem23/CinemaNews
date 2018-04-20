package com.example.aissaouiilhem.cinemanews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_saison.*

class Saison : AppCompatActivity() {
    var showingFirst1 = true
    var showingFirst2 = true
    var showingFirst3 = true
    var showingFirst4 = true
    var showingFirst5 = true
    var showingFirst6 = true
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
        val b1: Button = b1
        b1.setOnClickListener ({
            if(showingFirst1 == true){
                b1.setBackgroundResource(R.drawable.ic_star_black_24dp)
                showingFirst1 = false
            }else{
                b1.setBackgroundResource(R.drawable.ic_star_border_black_24dp)
                b1.setTag(70);
                showingFirst1 = true
            }

        })
        val b2: Button = b2
        b2.setOnClickListener ({
            if(showingFirst2 == true){
                b2.setBackgroundResource(R.drawable.ic_star_black_24dp)
                showingFirst2 = false
            }else{
                b2.setBackgroundResource(R.drawable.ic_star_border_black_24dp)
                b2.setTag(70);
                showingFirst2 = true
            }

        })
        val b3: Button = b3
        b3.setOnClickListener ({
            if(showingFirst3 == true){
                b3.setBackgroundResource(R.drawable.ic_star_black_24dp)
                showingFirst3 = false
            }else{
                b3.setBackgroundResource(R.drawable.ic_star_border_black_24dp)
                b3.setTag(70);
                showingFirst3 = true
            }

        })
        val b4: Button = b4
        b4.setOnClickListener ({
            if(showingFirst4 == true){
                b4.setBackgroundResource(R.drawable.ic_star_black_24dp)
                showingFirst4 = false
            }else{
                b4.setBackgroundResource(R.drawable.ic_star_border_black_24dp)
                b4.setTag(70);
                showingFirst4 = true
            }

        })
        val b5: Button = b5
        b5.setOnClickListener ({
            if(showingFirst5 == true){
                b5.setBackgroundResource(R.drawable.ic_star_black_24dp)
                showingFirst5 = false
            }else{
                b5.setBackgroundResource(R.drawable.ic_star_border_black_24dp)
                b1.setTag(70);
                showingFirst5 = true
            }

        })
        val b6: Button = b6
        b6.setOnClickListener ({
            if(showingFirst6 == true){
                b6.setBackgroundResource(R.drawable.ic_favorite_black_24dp)
                showingFirst6 = false
            }else{
                b6.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp)
                b6.setTag(70);
                showingFirst6 = true
            }

        })
    }
    private fun setEvent(btn : ImageButton, cls: Class<*>) {

        btn.setOnClickListener({
            val intent = Intent(this, cls)
            startActivity(intent)
        })

    }
}
