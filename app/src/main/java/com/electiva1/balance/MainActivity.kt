package com.electiva1.balance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private val REQ_CODE = 124


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun iniciarClick(view: View){



            val intent = Intent(this, Ingreso::class.java)
        startActivityForResult(intent, REQ_CODE)

    }
}
