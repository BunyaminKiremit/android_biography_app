package com.example.bunyamin_kiremit_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FullscreenImageActivity : AppCompatActivity() {

    lateinit var fullscreen_image_view:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_image)

        supportActionBar?.hide()

        val img1 = intent.getIntExtra("img1", 0)



        // ImageView'i bul ve resmi yükle
        val imageView =findViewById<ImageView>(R.id.fullscreen_image_view)
        imageView.setImageResource(img1)



    }
}