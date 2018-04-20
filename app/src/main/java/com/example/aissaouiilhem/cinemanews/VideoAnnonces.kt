package com.example.aissaouiilhem.cinemanews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video_annonces.*

class VideoAnnonces : AppCompatActivity() {
    private var mediaController: MediaController? = null
    private var TAG = "VideoPlayer"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_annonces)

        val toolbar = findViewById<View>(R.id.toolbar20) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Main2Activity::class.java )
            startActivity(intent) }

        configureVideoView()
    }
    private fun configureVideoView() {

        videoView1.setVideoPath(
                "https://www.youtube.com/watch?v=8ndhidEmUbI")
        mediaController = MediaController(this)
        mediaController?.setAnchorView(videoView1)
        videoView1.setMediaController(mediaController)
        videoView1.setOnPreparedListener { mp ->
            mp.isLooping = true
            Log.i(TAG, "Duration = " + videoView1.duration)
        }
        videoView1.start()
    }
}
