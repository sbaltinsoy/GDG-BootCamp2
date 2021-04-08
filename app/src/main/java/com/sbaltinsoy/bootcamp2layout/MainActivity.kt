package com.sbaltinsoy.bootcamp2layout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            FrameLayput
            Koyulan viewlari bir blokk uzerinde dizer
            Genelde tek bir view tutmak icin kullanilir

            LinearLayout
            vertically or horizontally yani dikeyde alt alta ya da yatayda yan yana dizmemizi saglar

            ***ConstraintLayout***
            Daha komplex ui tasarimlarinda viewlarin birbirilerine gore nasil durmasi gerektigini gostermemize olanak saglar

            Kisayol
            ctrl+bosluk -> gelebilecekleri gosterir
            SHIFT+SHIFT -> arama kismi cikar


         */


        val textInputEditTextUserName: TextInputEditText =
            findViewById(R.id.textInputEditTextUserName)

        val textInputEditTextPassword: TextInputEditText =
            findViewById(R.id.textInputEditTextPassword)

        val buttonLogin: MaterialButton =
            findViewById(R.id.buttonLogin)

        //buttonLogin.text = "abc"
        buttonLogin.setOnClickListener() {
            Toast.makeText(
                this,
                "${textInputEditTextUserName.text} - ${textInputEditTextPassword.text}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}