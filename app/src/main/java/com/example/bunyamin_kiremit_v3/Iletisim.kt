package com.example.bunyamin_kiremit_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.ContextCompat
import java.util.*

class Iletisim : AppCompatActivity() {

    lateinit var dataListView: ListView

    lateinit var editAdSoyad: EditText
    lateinit var editEmail: EditText
    lateinit var editMesaj: EditText
    lateinit var btnGonder: Button
    lateinit var txtMail: TextView
    lateinit var txtTelefon: TextView
    lateinit var txtLinkedin: TextView
    lateinit var txtGithub: TextView

    var arr = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iletisim)

        dataListView = findViewById(R.id.dataListView)

        editAdSoyad = findViewById(R.id.editAdSoyad)
        editEmail = findViewById(R.id.editEmail)
        editMesaj = findViewById(R.id.editMesaj)
        btnGonder = findViewById(R.id.btnGonder)

        txtMail = findViewById<TextView>(R.id.txtMail)
        txtTelefon = findViewById<TextView>(R.id.txtTelefon)
        txtLinkedin = findViewById<TextView>(R.id.txtLinkedin)
        txtGithub = findViewById<TextView>(R.id.txtGithub)
        dataResult()

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr)
        dataListView.adapter = adapter



        btnGonder.setOnClickListener() {
            var adSoyad = editAdSoyad.text.toString()
            var mesaj=editMesaj.text.toString()
            arr.add("Ad Soyadı :$adSoyad \n" +
                    "Mesaj :$mesaj")
            adapter.notifyDataSetChanged()
            editAdSoyad.setText("")
            editMesaj.setText("")
            editEmail.setText("")
            var toast= Toast.makeText(this,"Mesajınız Gönderildi", Toast.LENGTH_LONG).show()
        }

        var drawableMail = ContextCompat.getDrawable(this, R.drawable.email_icon)
        txtMail.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMail, null, null, null)

        var drawableTelefon = ContextCompat.getDrawable(this, R.drawable.telephone_icon)
        txtTelefon.setCompoundDrawablesRelativeWithIntrinsicBounds(
            drawableTelefon,
            null,
            null,
            null
        )

        var drawableLink = ContextCompat.getDrawable(this, R.drawable.linkedin_icon)
        txtLinkedin.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableLink, null, null, null)

        var drawablegithub = ContextCompat.getDrawable(this, R.drawable.github_icon)
        txtGithub.setCompoundDrawablesRelativeWithIntrinsicBounds(drawablegithub, null, null, null)


    }

    fun dataResult() {

          arr.add("Ad Soyadı :Bünyamin Kiremit \n" +
                    "Mesaj: Bana ulasabilir misiniz")



    }
}