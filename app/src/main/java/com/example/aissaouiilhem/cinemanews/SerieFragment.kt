package com.example.aissaouiilhem.cinemanews


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


/**
 * A simple [Fragment] subclass.
 */
class SerieFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_serie, container, false)
        val img=  view.findViewById<ImageButton>(R.id.seri1)
        setEvent(img,serieDescription::class.java)
        return view
    }
    private fun setEvent(btn : ImageButton, cls: Class<*>) {

        btn.setOnClickListener({
            val intent = Intent(context, cls)
            startActivity(intent)
        })

    }


}// Required empty public constructor
