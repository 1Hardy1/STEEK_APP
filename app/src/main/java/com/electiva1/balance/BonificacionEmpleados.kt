package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class BonificacionEmpleados : AppCompatActivity()  {

    var basicoEmpleado1: Double=0.0
    var basicoEmpleado2: Double=0.0
    var basicoEmpleado3: Double=0.0
    var basicoEmpleado4: Double=0.0
    var basicoEmpleado5: Double=0.0

    var bonificacionEmpleado1: Double=0.0
    var bonificacionEmpleado2: Double=0.0
    var bonificacionEmpleado3: Double=0.0
    var bonificacionEmpleado4: Double=0.0
    var bonificacionEmpleado5: Double=0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bonificaciones)


    }




    fun siguienteBonClick(view: View){

        var bundle =intent.extras

        basicoEmpleado1= bundle!!.getDouble("basicoEmpleado1")
        basicoEmpleado2= bundle!!.getDouble("basicoEmpleado2")
        basicoEmpleado3= bundle!!.getDouble("basicoEmpleado3")
        basicoEmpleado4= bundle!!.getDouble("basicoEmpleado4")
        basicoEmpleado5= bundle!!.getDouble("basicoEmpleado5")



        bonificacionEmpleado1 = findViewById<EditText>(R.id.editBonificacion1).text.toString().toDouble()
        bonificacionEmpleado2 = findViewById<EditText>(R.id.editBonificacion2).text.toString().toDouble()
        bonificacionEmpleado3 = findViewById<EditText>(R.id.editBonificacion3).text.toString().toDouble()
        bonificacionEmpleado4 = findViewById<EditText>(R.id.editBonificacion4).text.toString().toDouble()
        bonificacionEmpleado5 = findViewById<EditText>(R.id.editBonificacion5).text.toString().toDouble()



        val intent = Intent(this, ComisionEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putDouble("bonificacionEmpleado1", bonificacionEmpleado1)
        b.putDouble("bonificacionEmpleado2", bonificacionEmpleado2)
        b.putDouble("bonificacionEmpleado3", bonificacionEmpleado3)
        b.putDouble("bonificacionEmpleado4", bonificacionEmpleado4)
        b.putDouble("bonificacionEmpleado5", bonificacionEmpleado5)

        b.putDouble("basicoEmpleado1", basicoEmpleado1)
        b.putDouble("basicoEmpleado2", basicoEmpleado2)
        b.putDouble("basicoEmpleado3", basicoEmpleado3)
        b.putDouble("basicoEmpleado4", basicoEmpleado4)
        b.putDouble("basicoEmpleado5", basicoEmpleado5)
        intent.putExtras(b)
        startActivity(intent)

    }




}