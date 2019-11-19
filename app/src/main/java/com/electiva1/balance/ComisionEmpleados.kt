package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class ComisionEmpleados : AppCompatActivity()  {

    var comisionEmpleado1: Double = 0.0
    var comisionEmpleado2: Double = 0.0
    var comisionEmpleado3: Double = 0.0
    var comisionEmpleado4: Double = 0.0
    var comisionEmpleado5: Double = 0.0

    var basicoEmpleado1: Double = 0.0
    var basicoEmpleado2: Double = 0.0
    var basicoEmpleado3: Double = 0.0
    var basicoEmpleado4: Double = 0.0
    var basicoEmpleado5: Double = 0.0

    var bonificacionEmpleado1: Double = 0.0
    var bonificacionEmpleado2: Double = 0.0
    var bonificacionEmpleado3: Double = 0.0
    var bonificacionEmpleado4: Double = 0.0
    var bonificacionEmpleado5: Double = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comisiones)


    }




    fun siguienteComClick(view: View){

        var bundle =intent.extras

        basicoEmpleado1= bundle!!.getDouble("basicoEmpleado1")
        basicoEmpleado2= bundle!!.getDouble("basicoEmpleado2")
        basicoEmpleado3= bundle!!.getDouble("basicoEmpleado3")
        basicoEmpleado4= bundle!!.getDouble("basicoEmpleado4")
        basicoEmpleado5= bundle!!.getDouble("basicoEmpleado5")
        bonificacionEmpleado1= bundle!!.getDouble("bonificacionEmpleado1")
        bonificacionEmpleado2= bundle!!.getDouble("bonificacionEmpleado2")
        bonificacionEmpleado3= bundle!!.getDouble("bonificacionEmpleado3")
        bonificacionEmpleado4= bundle!!.getDouble("bonificacionEmpleado4")
        bonificacionEmpleado5= bundle!!.getDouble("bonificacionEmpleado5")


        comisionEmpleado1 = findViewById<EditText>(R.id.editComision1).text.toString().toDouble()
        comisionEmpleado2 = findViewById<EditText>(R.id.editComision2).text.toString().toDouble()
        comisionEmpleado3 = findViewById<EditText>(R.id.editComision3).text.toString().toDouble()
        comisionEmpleado4 = findViewById<EditText>(R.id.editComision4).text.toString().toDouble()
        comisionEmpleado5 = findViewById<EditText>(R.id.editComision5).text.toString().toDouble()




        val intent = Intent(this, HorasEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putDouble("comisionEmpleado1", comisionEmpleado1)
        b.putDouble("comisionEmpleado2", comisionEmpleado2)
        b.putDouble("comisionEmpleado3", comisionEmpleado3)
        b.putDouble("comisionEmpleado4", comisionEmpleado4)
        b.putDouble("comisionEmpleado5", comisionEmpleado5)

        b.putDouble("basicoEmpleado1", basicoEmpleado1)
        b.putDouble("basicoEmpleado2", basicoEmpleado2)
        b.putDouble("basicoEmpleado3", basicoEmpleado3)
        b.putDouble("basicoEmpleado4", basicoEmpleado4)
        b.putDouble("basicoEmpleado5", basicoEmpleado5)

        b.putDouble("bonificacionEmpleado1", bonificacionEmpleado1)
        b.putDouble("bonificacionEmpleado2", bonificacionEmpleado2)
        b.putDouble("bonificacionEmpleado3", bonificacionEmpleado3)
        b.putDouble("bonificacionEmpleado4", bonificacionEmpleado4)
        b.putDouble("bonificacionEmpleado5", bonificacionEmpleado5)

        intent.putExtras(b)
        startActivity(intent)

    }




}