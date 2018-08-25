package com.example.andersonoliveros.dojokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.andersonoliveros.dojokotlin.DataBase.DBHelper
import com.example.andersonoliveros.dojokotlin.Models.Note
import kotlinx.android.synthetic.main.activity_new_note.*

class New_note : AppCompatActivity() {

    private var database : DBHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)

        guardar.setOnClickListener{
            val title = titulo.text.toString()
            val body = texto.text.toString()

            var note = Note(title,body)

            database = DBHelper(this)
            database!!.insertNote(note)


            val openMainActivity = Intent(this, MainActivity::class.java)
            startActivity(openMainActivity)

        }

        salir.setOnClickListener{
            val openMainActivity = Intent(this, MainActivity::class.java)
            startActivity(openMainActivity)
        }
    }
}
