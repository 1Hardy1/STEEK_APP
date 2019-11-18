package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class BasicoEmpleados : AppCompatActivity()  {

    var basicoEmpleado1=0
    var basicoEmpleado2=0
    var basicoEmpleado3=0
    var basicoEmpleado4= 0
    var basicoEmpleado5= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomina_empleados)


    }




    fun siguienteClick(view: View){

        basicoEmpleado1 = findViewById<EditText>(R.id.editBasico1).text.toString().toInt()
        basicoEmpleado2 = findViewById<EditText>(R.id.editBasico2).text.toString().toInt()
        basicoEmpleado3 = findViewById<EditText>(R.id.editBasico3).text.toString().toInt()
        basicoEmpleado4 = findViewById<EditText>(R.id.editBasico4).text.toString().toInt()
        basicoEmpleado5 = findViewById<EditText>(R.id.editBasico5).text.toString().toInt()



        val intent = Intent(this, BonificacionEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putInt("basicoEmpleado1", basicoEmpleado1)
        b.putInt("basicoEmpleado2", basicoEmpleado2)
        b.putInt("basicoEmpleado3", basicoEmpleado3)
        b.putInt("basicoEmpleado4", basicoEmpleado4)
        b.putInt("basicoEmpleado5", basicoEmpleado5)
        intent.putExtras(b)
        startActivity(intent)

    }




}