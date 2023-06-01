package com.example.bunyamin_kiremit_v3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class Galeri : AppCompatActivity() {

    lateinit var img1:ImageView
    lateinit var img2:ImageView
    lateinit var img3:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        img1=findViewById(R.id.img1)
        img2=findViewById(R.id.img2)
        img3=findViewById(R.id.img3)

        img1.setOnClickListener(){
            val intent =Intent(this, FullscreenImageActivity::class.java)
            intent.putExtra("img1", R.drawable.img_20230219_041100) // resminizi burada gösterin
            startActivity(intent)

        }
        img2.setOnClickListener(){

            val intent =Intent(this, FullscreenImageActivity::class.java)
            intent.putExtra("img2", R.drawable.img_2_jpg) // resminizi burada gösterin
            startActivity(intent)
            var toast= Toast.makeText(this,"Resim Yüklenirken Bir Hata Oluştu", Toast.LENGTH_LONG).show()

        }
        img3.setOnClickListener(){
            val intent =Intent(this, FullscreenImageActivity::class.java)
            intent.putExtra("img3", R.drawable.dsc_0505) // resminizi burada gösterin
            startActivity(intent)
            var toast=Toast.makeText(this,"Resim Yüklenirken Bir Hata Oluştu",Toast.LENGTH_LONG).show()

        }


    }
}