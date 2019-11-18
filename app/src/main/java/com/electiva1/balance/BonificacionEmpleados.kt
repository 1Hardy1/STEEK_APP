package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class BonificacionEmpleados : AppCompatActivity()  {

    var basicoEmpleado1=0
    var basicoEmpleado2=0
    var basicoEmpleado3=0
    var basicoEmpleado4= 0
    var basicoEmpleado5= 0

    var bonificacionEmpleado1=0
    var bonificacionEmpleado2=0
    var bonificacionEmpleado3=0
    var bonificacionEmpleado4= 0
    var bonificacionEmpleado5= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bonificaciones)


    }




    fun siguienteBonClick(view: View){

        var bundle =intent.extras

        basicoEmpleado1= bundle!!.getInt("basicoEmpleado1")
        basicoEmpleado2= bundle!!.getInt("basicoEmpleado2")
        basicoEmpleado3= bundle!!.getInt("basicoEmpleado3")
        basicoEmpleado4= bundle!!.getInt("basicoEmpleado4")
        basicoEmpleado5= bundle!!.getInt("basicoEmpleado5")



        bonificacionEmpleado1 = findViewById<EditText>(R.id.editBonificacion1).text.toString().toInt()
        bonificacionEmpleado2 = findViewById<EditText>(R.id.editBonificacion2).text.toString().toInt()
        bonificacionEmpleado3 = findViewById<EditText>(R.id.editBonificacion3).text.toString().toInt()
        bonificacionEmpleado4 = findViewById<EditText>(R.id.editBonificacion4).text.toString().toInt()
        bonificacionEmpleado5 = findViewById<EditText>(R.id.editBonificacion5).text.toString().toInt()



        val intent = Intent(this, ComisionEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putInt("bonificacionEmpleado1", bonificacionEmpleado1)
        b.putInt("bonificacionEmpleado2", bonificacionEmpleado2)
        b.putInt("bonificacionEmpleado3", bonificacionEmpleado3)
        b.putInt("bonificacionEmpleado4", bonificacionEmpleado4)
        b.putInt("bonificacionEmpleado5", bonificacionEmpleado5)

        b.putInt("basicoEmpleado1", basicoEmpleado1)
        b.putInt("basicoEmpleado2", basicoEmpleado2)
        b.putInt("basicoEmpleado3", basicoEmpleado3)
        b.putInt("basicoEmpleado4", basicoEmpleado4)
        b.putInt("basicoEmpleado5", basicoEmpleado5)
        intent.putExtras(b)
        startActivity(intent)

    }




}