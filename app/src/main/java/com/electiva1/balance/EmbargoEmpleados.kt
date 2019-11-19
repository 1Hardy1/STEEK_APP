package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class EmbargoEmpleados : AppCompatActivity()  {


    var basicoEmpleado1 : Double = 0.0
    var basicoEmpleado2 : Double = 0.0
    var basicoEmpleado3 : Double = 0.0
    var basicoEmpleado4 : Double = 0.0
    var basicoEmpleado5 : Double = 0.0

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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamos)


    }




    fun siguientePresClick(view: View){

        var bundle =intent.extras

        basicoEmpleado1 = bundle!!.getDouble("basicoEmpleado1")
        basicoEmpleado2 = bundle!!.getDouble("basicoEmpleado2")
        basicoEmpleado3 = bundle!!.getDouble("basicoEmpleado3")
        basicoEmpleado4 = bundle!!.getDouble("basicoEmpleado4")
        basicoEmpleado5 = bundle!!.getDouble("basicoEmpleado5")

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





        val intent = Intent(this, ComisionEmpleados::class.java)
        val b : Bundle = Bundle()

        b.putDouble("descuentoEmpleado1", descuentoEmpleado1)
        b.putDouble("descuentoEmpleado2", descuentoEmpleado2)
        b.putDouble("descuentoEmpleado3", descuentoEmpleado3)
        b.putDouble("descuentoEmpleado4", descuentoEmpleado4)
        b.putDouble("descuentoEmpleado5", descuentoEmpleado5)

        b.putDouble("basicoEmpleado1", basicoEmpleado1)
        b.putDouble("basicoEmpleado2", basicoEmpleado2)
        b.putDouble("basicoEmpleado3", basicoEmpleado3)
        b.putDouble("basicoEmpleado4", basicoEmpleado4)
        b.putDouble("basicoEmpleado5", basicoEmpleado5)
        intent.putExtras(b)
        startActivity(intent)

    }




}