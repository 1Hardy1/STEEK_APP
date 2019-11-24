package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
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

    var embargoEmpleado1: Double = 0.0
    var embargoEmpleado2: Double = 0.0
    var embargoEmpleado3: Double = 0.0
    var embargoEmpleado4: Double = 0.0
    var embargoEmpleado5: Double = 0.0

    var totalDescuentos: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_embargos)


    }




    fun siguienteEmbClick(view: View){

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

        var embargocb1 = findViewById<CheckBox>(R.id.embargoEmp1)
        var embargocb2 = findViewById<CheckBox>(R.id.embargoEmp2)
        var embargocb3 = findViewById<CheckBox>(R.id.embargoEmp3)
        var embargocb4 = findViewById<CheckBox>(R.id.embargoEmp4)
        var embargocb5 = findViewById<CheckBox>(R.id.embargoEmp5)

        if(embargocb1.isChecked){
            embargoEmpleado1= (basicoEmpleado1-828116)/5

        }

        if(embargocb2.isChecked){
            embargoEmpleado2= (basicoEmpleado2-828116)/5
        }


        if(embargocb3.isChecked){
            embargoEmpleado3= (basicoEmpleado3-828116)/5
        }

        if(embargocb4.isChecked){
            embargoEmpleado4= (basicoEmpleado4-828116)/5
        }


        if(embargocb5.isChecked){
            embargoEmpleado5= (basicoEmpleado5-828116)/5
        }

        descuentoEmpleado1= descuentoEmpleado1+embargoEmpleado1
        descuentoEmpleado2= descuentoEmpleado2+embargoEmpleado2
        descuentoEmpleado3= descuentoEmpleado3+embargoEmpleado3
        descuentoEmpleado4= descuentoEmpleado4+embargoEmpleado4
        descuentoEmpleado5= descuentoEmpleado5+embargoEmpleado5

        totalDescuentos= descuentoEmpleado1+descuentoEmpleado2+descuentoEmpleado3+descuentoEmpleado4+descuentoEmpleado5

        val intent = Intent(this, NominaResultado::class.java)
        val b : Bundle = Bundle()

        b.putDouble("descuentoEmpleado1", descuentoEmpleado1)
        b.putDouble("descuentoEmpleado2", descuentoEmpleado2)
        b.putDouble("descuentoEmpleado3", descuentoEmpleado3)
        b.putDouble("descuentoEmpleado4", descuentoEmpleado4)
        b.putDouble("descuentoEmpleado5", descuentoEmpleado5)

        b.putDouble("devengadosEmpleado1", devengadosEmpleado1)
        b.putDouble("devengadosEmpleado2", devengadosEmpleado2)
        b.putDouble("devengadosEmpleado3", devengadosEmpleado3)
        b.putDouble("devengadosEmpleado4", devengadosEmpleado4)
        b.putDouble("devengadosEmpleado5", devengadosEmpleado5)

        b.putDouble("totalDevengados", totalDevengados)
        b.putDouble("totalDescuentos", totalDescuentos)


        intent.putExtras(b)
        startActivity(intent)

    }




}