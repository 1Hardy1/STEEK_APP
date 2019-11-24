package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class HorasEmpleados : AppCompatActivity() {

    var horasEmpleado1 :Double =0.0
    var horasEmpleado2 :Double =0.0
    var horasEmpleado3 :Double =0.0
    var horasEmpleado4 :Double =0.0
    var horasEmpleado5 :Double =0.0

    var comisionEmpleado1 :Double =0.0
    var comisionEmpleado2 :Double =0.0
    var comisionEmpleado3 :Double =0.0
    var comisionEmpleado4 :Double =0.0
    var comisionEmpleado5 :Double =0.0

    var basicoEmpleado1 :Double =0.0
    var basicoEmpleado2 :Double =0.0
    var basicoEmpleado3 :Double =0.0
    var basicoEmpleado4 :Double =0.0
    var basicoEmpleado5 :Double =0.0

    var bonificacionEmpleado1 :Double =0.0
    var bonificacionEmpleado2 :Double =0.0
    var bonificacionEmpleado3 :Double =0.0
    var bonificacionEmpleado4 :Double =0.0
    var bonificacionEmpleado5 :Double =0.0

    var minimo :Double =828116.0

    var auxilioEmpleado1 :Double =0.0
    var auxilioEmpleado2 :Double =0.0
    var auxilioEmpleado3 :Double =0.0
    var auxilioEmpleado4 :Double =0.0
    var auxilioEmpleado5 :Double =0.0

    var devengadosEmpleado1:Double =0.0
    var devengadosEmpleado2:Double =0.0
    var devengadosEmpleado3:Double =0.0
    var devengadosEmpleado4:Double =0.0
    var devengadosEmpleado5:Double =0.0
    var totalDevengados:Double =0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horas)


    }


    fun siguienteHorasClick(view: View) {

        var bundle = intent.extras

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



        horasEmpleado1 = findViewById<EditText>(R.id.editHoras1).text.toString().toDouble()
        horasEmpleado2 = findViewById<EditText>(R.id.editHoras2).text.toString().toDouble()
        horasEmpleado3 = findViewById<EditText>(R.id.editHoras3).text.toString().toDouble()
        horasEmpleado4 = findViewById<EditText>(R.id.editHoras4).text.toString().toDouble()
        horasEmpleado5 = findViewById<EditText>(R.id.editHoras5).text.toString().toDouble()


        if (basicoEmpleado1 < (minimo * 2) && basicoEmpleado1 >0) {
            auxilioEmpleado1 = 97032.0
        } else {
            auxilioEmpleado1 = 0.0
        }
        if (basicoEmpleado2 < (minimo * 2)&& basicoEmpleado2 >0) {
            auxilioEmpleado2 = 97032.0
        } else {
            auxilioEmpleado2 = 0.0
        }
        if (basicoEmpleado3 < (minimo * 2)&& basicoEmpleado3 >0) {
            auxilioEmpleado3 = 97032.0
        } else {
            auxilioEmpleado3 = 0.0
        }
        if (basicoEmpleado4 < (minimo * 2)&& basicoEmpleado4 >0) {
            auxilioEmpleado4 = 97032.0
        } else {
            auxilioEmpleado4 = 0.0
        }
        if (basicoEmpleado5 < (minimo * 2)&& basicoEmpleado5 >0) {
            auxilioEmpleado5 = 97032.0
        } else {
            auxilioEmpleado5 = 0.0
        }


        devengadosEmpleado1=basicoEmpleado1+bonificacionEmpleado1+comisionEmpleado1+horasEmpleado1+auxilioEmpleado1
        devengadosEmpleado2=basicoEmpleado2+bonificacionEmpleado2+comisionEmpleado2+horasEmpleado2+auxilioEmpleado2
        devengadosEmpleado3=basicoEmpleado3+bonificacionEmpleado3+comisionEmpleado3+horasEmpleado3+auxilioEmpleado3
        devengadosEmpleado4=basicoEmpleado4+bonificacionEmpleado4+comisionEmpleado4+horasEmpleado4+auxilioEmpleado4
        devengadosEmpleado5=basicoEmpleado5+bonificacionEmpleado5+comisionEmpleado5+horasEmpleado5+auxilioEmpleado5

        totalDevengados=devengadosEmpleado1+devengadosEmpleado2+devengadosEmpleado3+devengadosEmpleado4+devengadosEmpleado5



        val intent = Intent(this, PrestamoEmpleados::class.java)
        val b: Bundle = Bundle()
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


        b.putDouble("horasEmpleado1", horasEmpleado1)
        b.putDouble("horasEmpleado2", horasEmpleado2)
        b.putDouble("horasEmpleado3", horasEmpleado3)
        b.putDouble("horasEmpleado4", horasEmpleado4)
        b.putDouble("horasEmpleado5", horasEmpleado5)


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
