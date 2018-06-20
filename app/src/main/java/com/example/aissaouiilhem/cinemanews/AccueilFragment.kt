package com.example.aissaouiilhem.cinemanews


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import kotlinx.android.synthetic.main.fragment_accueil.*;

/**
 * A simple [Fragment] subclass.
 */
class AccueilFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment val posts: ArrayList<Int> = ArrayList()
      var view = inflater.inflate(R.layout.fragment_accueil, container, false)
   /*  val img=  view.findViewById<ImageButton>(R.id.imageButton)
        val video= view.findViewById<ImageButton>(R.id.annonce1)
        setEvent(img,test::class.java)
        setEvent(video,VideoAnnonces::class.java)*/
        return view

    }// Required empty public constructor

    private fun setEvent(btn : ImageButton, cls: Class<*>) {

        btn.setOnClickListener({
            val intent = Intent(context, cls)
            startActivity(intent)
        })

    }
}