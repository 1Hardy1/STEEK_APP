package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class BasicoEmpleados : AppCompatActivity()  {

    var basicoEmpleado1: Double = 0.0
    var basicoEmpleado2: Double = 0.0
    var basicoEmpleado3: Double = 0.0
    var basicoEmpleado4: Double = 0.0
    var basicoEmpleado5: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomina_empleados)


    }




    fun siguienteClick(view: View){

        basicoEmpleado1 = findViewById<EditText>(R.id.editBasico1).text.toString().toDouble()
        basicoEmpleado2 = findViewById<EditText>(R.id.editBasico2).text.toString().toDouble()
        basicoEmpleado3 = findViewById<EditText>(R.id.editBasico3).text.toString().toDouble()
        basicoEmpleado4 = findViewById<EditText>(R.id.editBasico4).text.toString().toDouble()
        basicoEmpleado5 = findViewById<EditText>(R.id.editBasico5).text.toString().toDouble()



        val intent = Intent(this, BonificacionEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putDouble("basicoEmpleado1", basicoEmpleado1)
        b.putDouble("basicoEmpleado2", basicoEmpleado2)
        b.putDouble("basicoEmpleado3", basicoEmpleado3)
        b.putDouble("basicoEmpleado4", basicoEmpleado4)
        b.putDouble("basicoEmpleado5", basicoEmpleado5)
        intent.putExtras(b)
        startActivity(intent)

    }




}