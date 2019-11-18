package com.electiva1.balance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu : AppCompatActivity() {
    private val REQ_CODE = 124


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }


    fun balanceClick(view: View){


        val intent = Intent(this, MainActivity::class.java)
        startActivityForResult(intent, REQ_CODE)

    }

    fun nominaClick(view: View){


        val intent = Intent(this, BasicoEmpleados::class.java)
        startActivityForResult(intent, REQ_CODE)

    }
}
