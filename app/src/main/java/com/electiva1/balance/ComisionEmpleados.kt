package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class ComisionEmpleados : AppCompatActivity()  {

    var comisionEmpleado1=0
    var comisionEmpleado2=0
    var comisionEmpleado3=0
    var comisionEmpleado4=0
    var comisionEmpleado5=0

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
        setContentView(R.layout.activity_comisiones)


    }




    fun siguienteComClick(view: View){

        var bundle =intent.extras

        basicoEmpleado1= bundle!!.getInt("basicoEmpleado1")
        basicoEmpleado2= bundle!!.getInt("basicoEmpleado2")
        basicoEmpleado3= bundle!!.getInt("basicoEmpleado3")
        basicoEmpleado4= bundle!!.getInt("basicoEmpleado4")
        basicoEmpleado5= bundle!!.getInt("basicoEmpleado5")
        bonificacionEmpleado1= bundle!!.getInt("bonificacionEmpleado1")
        bonificacionEmpleado2= bundle!!.getInt("bonificacionEmpleado2")
        bonificacionEmpleado3= bundle!!.getInt("bonificacionEmpleado3")
        bonificacionEmpleado4= bundle!!.getInt("bonificacionEmpleado4")
        bonificacionEmpleado5= bundle!!.getInt("bonificacionEmpleado5")


        comisionEmpleado1 = findViewById<EditText>(R.id.editComision1).text.toString().toInt()
        comisionEmpleado2 = findViewById<EditText>(R.id.editComision2).text.toString().toInt()
        comisionEmpleado3 = findViewById<EditText>(R.id.editComision3).text.toString().toInt()
        comisionEmpleado4 = findViewById<EditText>(R.id.editComision4).text.toString().toInt()
        comisionEmpleado5 = findViewById<EditText>(R.id.editComision5).text.toString().toInt()




        val intent = Intent(this, HorasEmpleados::class.java)
        val b : Bundle = Bundle()
        b.putInt("comisionEmpleado1", comisionEmpleado1)
        b.putInt("comisionEmpleado2", comisionEmpleado2)
        b.putInt("comisionEmpleado3", comisionEmpleado3)
        b.putInt("comisionEmpleado4", comisionEmpleado4)
        b.putInt("comisionEmpleado5", comisionEmpleado5)

        b.putInt("basicoEmpleado1", basicoEmpleado1)
        b.putInt("basicoEmpleado2", basicoEmpleado2)
        b.putInt("basicoEmpleado3", basicoEmpleado3)
        b.putInt("basicoEmpleado4", basicoEmpleado4)
        b.putInt("basicoEmpleado5", basicoEmpleado5)

        b.putInt("bonificacionEmpleado1", bonificacionEmpleado1)
        b.putInt("bonificacionEmpleado2", bonificacionEmpleado2)
        b.putInt("bonificacionEmpleado3", bonificacionEmpleado3)
        b.putInt("bonificacionEmpleado4", bonificacionEmpleado4)
        b.putInt("bonificacionEmpleado5", bonificacionEmpleado5)

        intent.putExtras(b)
        startActivity(intent)

    }




}