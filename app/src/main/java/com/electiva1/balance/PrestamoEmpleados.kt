package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class PrestamoEmpleados : AppCompatActivity()  {

    var prestamoEmpleado1: Double = 0.0
    var prestamoEmpleado2: Double = 0.0
    var prestamoEmpleado3: Double = 0.0
    var prestamoEmpleado4: Double = 0.0
    var prestamoEmpleado5: Double = 0.0


    var bonificacionEmpleado1: Double = 0.0
    var bonificacionEmpleado2: Double = 0.0
    var bonificacionEmpleado3: Double = 0.0
    var bonificacionEmpleado4: Double = 0.0
    var bonificacionEmpleado5: Double = 0.0



    var horasEmpleado1 : Double = 0.0
    var horasEmpleado2 : Double = 0.0
    var horasEmpleado3 : Double = 0.0
    var horasEmpleado4 : Double = 0.0
    var horasEmpleado5 : Double = 0.0

    var comisionEmpleado1 : Double = 0.0
    var comisionEmpleado2 : Double = 0.0
    var comisionEmpleado3 : Double = 0.0
    var comisionEmpleado4 : Double = 0.0
    var comisionEmpleado5 : Double = 0.0

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

    var saludEmpleado1 : Double = 0.0
    var saludEmpleado2: Double = 0.0
    var saludEmpleado3: Double = 0.0
    var saludEmpleado4: Double = 0.0
    var saludEmpleado5: Double = 0.0

    var pensionEmpleado1: Double = 0.0
    var pensionEmpleado2: Double = 0.0
    var pensionEmpleado3: Double = 0.0
    var pensionEmpleado4: Double = 0.0
    var pensionEmpleado5: Double = 0.0

    var fondoEmpleado1: Double = 0.0
    var fondoEmpleado2: Double = 0.0
    var fondoEmpleado3: Double = 0.0
    var fondoEmpleado4: Double = 0.0
    var fondoEmpleado5: Double = 0.0

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

        bonificacionEmpleado1 = bundle!!.getDouble("bonificacionEmpleado1")
        bonificacionEmpleado2 = bundle!!.getDouble("bonificacionEmpleado2")
        bonificacionEmpleado3 = bundle!!.getDouble("bonificacionEmpleado3")
        bonificacionEmpleado4 = bundle!!.getDouble("bonificacionEmpleado4")
        bonificacionEmpleado5 = bundle!!.getDouble("bonificacionEmpleado5")

        comisionEmpleado1 = bundle!!.getDouble("comisionEmpleado1")
        comisionEmpleado2 = bundle!!.getDouble("comisionEmpleado2")
        comisionEmpleado3 = bundle!!.getDouble("comisionEmpleado3")
        comisionEmpleado4 = bundle!!.getDouble("comisionEmpleado4")
        comisionEmpleado5 = bundle!!.getDouble("comisionEmpleado5")

        horasEmpleado1 = bundle!!.getDouble("horasEmpleado1")
        horasEmpleado2 = bundle!!.getDouble("horasEmpleado2")
        horasEmpleado3 = bundle!!.getDouble("horasEmpleado3")
        horasEmpleado4 = bundle!!.getDouble("horasEmpleado4")
        horasEmpleado5 = bundle!!.getDouble("horasEmpleado5")

        devengadosEmpleado1 = bundle!!.getDouble("devengadosEmpleado1")
        devengadosEmpleado2 = bundle!!.getDouble("devengadosEmpleado2")
        devengadosEmpleado3 = bundle!!.getDouble("devengadosEmpleado3")
        devengadosEmpleado4 = bundle!!.getDouble("devengadosEmpleado4")
        devengadosEmpleado5 = bundle!!.getDouble("devengadosEmpleado5")

        totalDevengados = bundle!!.getDouble("totalDevengados")

        saludEmpleado1=(basicoEmpleado1+horasEmpleado1+comisionEmpleado1)*(0.04)
        saludEmpleado2=(basicoEmpleado2+horasEmpleado2+comisionEmpleado2)*(0.04)
        saludEmpleado3=(basicoEmpleado3+horasEmpleado3+comisionEmpleado3)*(0.04)
        saludEmpleado4=(basicoEmpleado4+horasEmpleado4+comisionEmpleado4)*(0.04)
        saludEmpleado5=(basicoEmpleado5+horasEmpleado5+comisionEmpleado5)*(0.04)

        pensionEmpleado1=(basicoEmpleado1+horasEmpleado1+comisionEmpleado1)*(0.04)
        pensionEmpleado2=(basicoEmpleado2+horasEmpleado2+comisionEmpleado2)*(0.04)
        pensionEmpleado3=(basicoEmpleado3+horasEmpleado3+comisionEmpleado3)*(0.04)
        pensionEmpleado4=(basicoEmpleado4+horasEmpleado4+comisionEmpleado4)*(0.04)
        pensionEmpleado5=(basicoEmpleado5+horasEmpleado5+comisionEmpleado5)*(0.04)

        fondoEmpleado1=(basicoEmpleado1+horasEmpleado1+comisionEmpleado1)*(0.1)
        fondoEmpleado2=(basicoEmpleado2+horasEmpleado2+comisionEmpleado2)*(0.1)
        fondoEmpleado3=(basicoEmpleado3+horasEmpleado3+comisionEmpleado3)*(0.1)
        fondoEmpleado4=(basicoEmpleado4+horasEmpleado4+comisionEmpleado4)*(0.1)
        fondoEmpleado5=(basicoEmpleado5+horasEmpleado5+comisionEmpleado5)*(0.1)

        descuentoEmpleado1=saludEmpleado1+pensionEmpleado1+fondoEmpleado1
        descuentoEmpleado2=saludEmpleado2+pensionEmpleado2+fondoEmpleado2
        descuentoEmpleado3=saludEmpleado3+pensionEmpleado3+fondoEmpleado3
        descuentoEmpleado4=saludEmpleado4+pensionEmpleado4+fondoEmpleado4
        descuentoEmpleado5=saludEmpleado5+pensionEmpleado5+fondoEmpleado5










        prestamoEmpleado1 = findViewById<EditText>(R.id.editPrestamo1).text.toString().toDouble()
        prestamoEmpleado2 = findViewById<EditText>(R.id.editPrestamo2).text.toString().toDouble()
        prestamoEmpleado3 = findViewById<EditText>(R.id.editPrestamo3).text.toString().toDouble()
        prestamoEmpleado4 = findViewById<EditText>(R.id.editPrestamo4).text.toString().toDouble()
        prestamoEmpleado5 = findViewById<EditText>(R.id.editPrestamo5).text.toString().toDouble()



        val intent = Intent(this, EmbargoEmpleados::class.java)
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

        b.putDouble("devengadosEmpleado1", devengadosEmpleado1)
        b.putDouble("devengadosEmpleado2", devengadosEmpleado2)
        b.putDouble("devengadosEmpleado3", devengadosEmpleado3)
        b.putDouble("devengadosEmpleado4", devengadosEmpleado4)
        b.putDouble("devengadosEmpleado5", devengadosEmpleado5)

        b.putDouble("totalDevengados", totalDevengados)
        intent.putExtras(b)
        startActivity(intent)

    }




}