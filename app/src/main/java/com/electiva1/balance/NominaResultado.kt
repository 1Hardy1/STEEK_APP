package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class NominaResultado : AppCompatActivity()  {


    var devengadosEmpleado1: Double = 0.0
    var devengadosEmpleado2: Double = 0.0
    var devengadosEmpleado3: Double = 0.0
    var devengadosEmpleado4: Double = 0.0
    var devengadosEmpleado5: Double = 0.0

    var totalDevengados: Double = 0.0

    var descuentoEmpleado1: Double = 0.0
    var descuentoEmpleado2: Double = 0.0
    var descuentoEmpleado3: Double = 0.0
    var descuentoEmpleado4: Double = 0.0
    var descuentoEmpleado5: Double = 0.0

    var totalDescuentos: Double = 0.0

    var netoEmpleado1: Double = 0.0
    var netoEmpleado2: Double = 0.0
    var netoEmpleado3: Double = 0.0
    var netoEmpleado4: Double = 0.0
    var netoEmpleado5: Double = 0.0

    var netoNomina: Double = 0.0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        var bundle =intent.extras



        devengadosEmpleado1 = bundle!!.getDouble("devengadosEmpleado1")
        devengadosEmpleado2 = bundle!!.getDouble("devengadosEmpleado2")
        devengadosEmpleado3 = bundle!!.getDouble("devengadosEmpleado3")
        devengadosEmpleado4 = bundle!!.getDouble("devengadosEmpleado4")
        devengadosEmpleado5 = bundle!!.getDouble("devengadosEmpleado5")

        descuentoEmpleado1 = bundle!!.getDouble("descuentoEmpleado1")
        descuentoEmpleado2 = bundle!!.getDouble("descuentoEmpleado2")
        descuentoEmpleado3 = bundle!!.getDouble("descuentoEmpleado3")
        descuentoEmpleado4 = bundle!!.getDouble("descuentoEmpleado4")
        descuentoEmpleado5 = bundle!!.getDouble("descuentoEmpleado5")

        totalDevengados = bundle!!.getDouble("totalDevengados")
        totalDescuentos = bundle!!.getDouble("totalDescuentos")

        netoEmpleado1= devengadosEmpleado1-descuentoEmpleado1
        netoEmpleado2= devengadosEmpleado2-descuentoEmpleado2
        netoEmpleado3= devengadosEmpleado3-descuentoEmpleado3
        netoEmpleado4= devengadosEmpleado4-descuentoEmpleado4
        netoEmpleado5= devengadosEmpleado5-descuentoEmpleado5

        netoNomina= netoEmpleado1+netoEmpleado2+netoEmpleado3+netoEmpleado4+netoEmpleado5




        findViewById<TextView>(R.id.devengadoEmp1).text= devengadosEmpleado1.toString()
        findViewById<TextView>(R.id.devengadoEmp2).text= devengadosEmpleado2.toString()
        findViewById<TextView>(R.id.devengadoEmp3).text= devengadosEmpleado3.toString()
        findViewById<TextView>(R.id.devengadoEmp4).text= devengadosEmpleado4.toString()
        findViewById<TextView>(R.id.devengadoEmp5).text= devengadosEmpleado5.toString()

        findViewById<TextView>(R.id.descuentoEmp1).text= descuentoEmpleado1.toString()
        findViewById<TextView>(R.id.descuentoEmp2).text= descuentoEmpleado2.toString()
        findViewById<TextView>(R.id.descuentoEmp3).text= descuentoEmpleado3.toString()
        findViewById<TextView>(R.id.descuentoEmp4).text= descuentoEmpleado4.toString()
        findViewById<TextView>(R.id.descuentoEmp5).text= descuentoEmpleado5.toString()

        findViewById<TextView>(R.id.totalDevengados).text= totalDevengados.toString()
        findViewById<TextView>(R.id.totalDescuentos).text= totalDescuentos.toString()

       /** findViewById<TextView>(R.id.netoEmp1).text= netoEmpleado1.toString()
        findViewById<TextView>(R.id.netoEmp2).text= netoEmpleado2.toString()
        findViewById<TextView>(R.id.netoEmp3).text= netoEmpleado3.toString()
        findViewById<TextView>(R.id.netoEmp4).text= netoEmpleado4.toString()
        findViewById<TextView>(R.id.netoEmp5).text= netoEmpleado5.toString()

        findViewById<TextView>(R.id.netoNomina).text= netoNomina.toString()

*/




    }


    fun btnNuevaClick(view: View){

        val intent = Intent(this, BasicoEmpleados::class.java)
        startActivity(intent)

    }

    fun btnMenuClick(view: View){

        val intent = Intent(this, Menu::class.java)
        startActivity(intent)

    }
}