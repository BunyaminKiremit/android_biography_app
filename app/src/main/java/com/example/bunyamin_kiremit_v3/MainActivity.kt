package com.example.bunyamin_kiremit_v3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var btnHakkımda:Button
    lateinit var btnGaleri:Button
    lateinit var btnİletisim:Button
    lateinit var btnGithub:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHakkımda=findViewById(R.id.btnHakkımda)
        btnGaleri=findViewById(R.id.btnGaleri)
        btnİletisim=findViewById(R.id.btnİletisim)
        btnGithub=findViewById(R.id.btnGithub)

        btnHakkımda.setOnClickListener(){
            var intent=Intent(this,Hakkimda::class.java)
            startActivity(intent)


        }

        btnGaleri.setOnClickListener(){
            var intent=Intent(this,Galeri::class.java)
            startActivity(intent)
        }

        btnİletisim.setOnClickListener(){
            var intent=Intent(this,Iletisim::class.java)
            startActivity(intent)
        }

        btnGithub.setOnClickListener(){
            var intent=Intent(this,Github::class.java)
            startActivity(intent)

        }



    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item:MenuItem): Boolean {
        alertDialog()
        return when (item.itemId) {

            R.id.logout ->{

                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun alertDialog(){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Uyarı")
        alert.setMessage("Çıkış Yapmak İstediğinizden Emin Misiniz ?")
        alert.setCancelable(false) // Boş yere tıklandığında kapanmaz kesinlikle doldurulması gerekir
        //button
        alert.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            finishAffinity()
        })
        alert.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialogInterface, i ->
        })
        alert.setIcon(androidx.viewpager.R.drawable.notification_tile_bg)
        alert.show()
    }


}